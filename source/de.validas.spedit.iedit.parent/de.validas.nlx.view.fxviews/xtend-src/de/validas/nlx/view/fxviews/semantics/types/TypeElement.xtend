package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.dictionary.IDictionaryAccess
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.dictionary.type.ITypeHierarchy
import de.validas.nlx.dictionary.type.NoneTypeHierarchy
import de.validas.nlx.view.fxviews.access.IJavaFxObj
import de.validas.nlx.view.fxviews.access.elements.ShortCutItem
import de.validas.nlx.view.fxviews.control.IDragController
import de.validas.nlx.view.fxviews.control.IElmController
import de.validas.nlx.view.fxviews.control.TypeControlElController
import de.validas.nlx.view.fxviews.semantics.ILink
import de.validas.nlx.view.fxviews.semantics.ILinkObj
import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.nlx.view.fxviews.semantics.util.IDelegates.Procedure2
import de.validas.utils.data.types.XPair
import java.net.URL
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import java.util.Map
import javafx.beans.value.ChangeListener
import javafx.event.Event
import javafx.fxml.FXMLLoader
import javafx.scene.Node
import javafx.scene.control.ComboBox

import static de.validas.nlx.dictionary.constants.NodeConstants._NONE
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._CIRCLE_BUTTON

class TypeElement implements IJavaFxObj, ITypeElement {
	protected String typeName
	protected ITypeAttributes typeAttributes
	LiteralType parent
	Node root
	IElmController controller;
	IDragController dragController;
	FXMLLoader loader
	int index
	HashMap<XPair<String, ILinkable>,ILink> links
	
	IDictionaryAccess dictAccess
	
	protected ChangeListener<? super String> listener;
	boolean withNone
	
	Map<ComboBox<String>, ChangeListener<? super String>> listeners
	
	Procedure2<IJavaFxObj, Event> plusButton = [parent, event |
		var wordT = parent.parent
		if (wordT instanceof WordType) {
			wordT.selection = index
			wordT.parent.canvas.linkListener.update
			//wordT.update	
		}
	]
	
	
	

	new(String name, ITypeAttributes attributes, int index, LiteralType parent, URL ressource) {
		this(name, attributes, index, parent, ressource, false)
	}
	
	new(String name, ITypeAttributes attributes, int index, LiteralType parent, URL ressource, boolean withNone) {
		this.parent = parent
		this.loader = new FXMLLoader(ressource)
		loader.setClassLoader(parent.parent.canvas.fxClassLoader);
		listeners = newHashMap()
		typeName = name
		typeAttributes = attributes
		this.index = index
		this.withNone = withNone
		this.links = newHashMap()
		this.dictAccess = ((parent.parent as ILinkObj).token as ShortCutItem).dictAccess
	}

	def create() {
		// TODO: consider to find common Abstract Class or Interface with all JavaFx Objects
		try {
			root = loader.load();
			controller = loader.getController();
			if (controller instanceof TypeControlElController) {
				controller.secondRow.managedProperty.bind(controller.secondRow.visibleProperty)
				var items = new ArrayList((parent?.getParent as ILinkObj)?.token?.wordTypes ?: #[])
				if (withNone)
					items.add(0, new NoneTypeHierarchy())
				addItems(items);
				if (parent.selection != index){
					controller.sphere.visible = false
				} else {
					controller.sphere.visible = true
				}
				controller.addListener(_CIRCLE_BUTTON, plusButton);
			}
			controller.addDragController(dragController);
			controller.setParent(this);
		} catch (Exception ex) {
			print((parent.parent as ILinkObj).token.name)
			ex.printStackTrace()
		}
	}

	def addItems(List<ITypeHierarchy> types) {
		if (controller instanceof TypeControlElController) {
			var combo = controller.mainCombo
			if (typeName !== null) {
				combo.items += types.map[t|t.type]
				combo.value = typeName

				controller.secondRow.visible = false
			}

			setSelectionChangedListener(controller.mainCombo, [Object obs, String oldValue, String newValue | 
						if (newValue !== null)
							typeName = newValue
							if (oldValue.equals(_NONE)){
								addTypeToDict(newValue) 
							} else {
								replaceTypeInDict(oldValue, newValue)
							}
					]);
					
		}
	}
	
	def replaceTypeInDict(String oldType, String newType) {
		var name = ((parent.parent as ILinkObj).token as ShortCutItem).name
		dictAccess.replaceTypeForWord(name, oldType, newType)
	}
	
	def addTypeToDict(String type) {
		var name = ((parent.parent as ILinkObj).token as ShortCutItem).name
		typeAttributes  = dictAccess.addTypeToWord(name, type)
		//dictAccess.addTypeToWord(name, type)
		//TODO: 11.08.21 - launch linkProcssor for new Type here 
	}

	def getRoot() {
		root
	}
	
	def getIndex() {
		index
	}

	override getParent() {
		parent
	}

	override getController() {
		controller
	}

	override getCanvasController() {
		var ILinkable panel = parent.parent
		if (panel instanceof ILinkObj) {
			panel.canvasController
		} else
			null
	}
	
	def getName(){
		typeName
	}
	
	@Deprecated
	def getBaseType(){
		typeName
	}
	
	def addLink(ILink link) {
		var source = parent.parent
		var target = link.getOpposite(source)
		if (!containsKeyPair(links,target)){	
			this.links.put(target, link)
		} else {
			null
		}
	}
	
	def containsKeyPair(HashMap<XPair<String, ILinkable>, ILink> map, XPair<String, ILinkable> pair) {
		for (pairEl : map.keySet){
			if (pairEl.key.equals(pair.key) && pairEl.value.equals(pair.value))
				return true
		}
		false
	}
	
	def getLinks(){
		this.links.values().toList	
	}
	
	def getLink(String name){
		if (name.equals(typeName))
			this.links.values().toList
		else
			null	
	}
	
	def void setSelectionChangedListener(ComboBox<String> combo, ChangeListener<? super String> listener) {
		if (controller instanceof TypeControlElController)
			if (listener !== null){
				combo.valueProperty().addListener(listener);
				this.listeners.put(combo,listener);	
			}
	}



	def ChangeListener<? super String> getSelectionChangedListener() {
		return listener;
	}
	
	override getTypeAttributes() {
		typeAttributes
	}
	
	override setTypeAttributes(ITypeAttributes attrs){
		typeAttributes = attrs
	}
	
}
