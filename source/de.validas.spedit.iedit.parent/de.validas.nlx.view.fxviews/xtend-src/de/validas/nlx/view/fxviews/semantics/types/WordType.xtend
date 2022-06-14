package de.validas.nlx.view.fxviews.semantics.types

import de.validas.nlx.constants.Direction
import de.validas.nlx.dictionary.IDictionaryAccess
import de.validas.nlx.dictionary.type.ITypeAttributes
import de.validas.nlx.dictionary.type.NoneTypeAttributes
import de.validas.nlx.view.fxviews.access.IJavaFxObj
import de.validas.nlx.view.fxviews.control.PanelObjExtController
import de.validas.nlx.view.fxviews.control.TypeControlElController
import de.validas.nlx.view.fxviews.semantics.ILink
import de.validas.nlx.view.fxviews.semantics.ILinkObj
import de.validas.nlx.view.fxviews.semantics.ILinkable
import de.validas.nlx.view.fxviews.semantics.util.AttribUtils
import de.validas.utils.data.types.XPair
import java.util.ArrayList
import java.util.HashMap
import java.util.List
import javafx.application.Platform
import javafx.scene.control.TitledPane
import javafx.scene.layout.Pane
import javafx.scene.layout.VBox
import org.neo4j.driver.v1.types.Relationship

import static de.validas.nlx.dictionary.constants.NodeConstants._NONE
import static de.validas.nlx.dictionary.constants.NodeConstants._TYPE
import static de.validas.nlx.dictionary.constants.NodeConstants._WORD
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.FXML_TYPE_CONTROL_FILE
import org.neo4j.driver.internal.value.ListValue
import de.validas.nlx.dictionary.DictItem
import de.validas.nlx.view.fxviews.access.IItem
import de.validas.nlx.dictionary.type.ITypeInfo
import de.validas.nlx.dictionary.type.WordTypeInfo

class WordType extends LiteralType {

	protected var ITypeInfo typeInfo //Grammar Data
	protected Pane group
	protected List<TypeElement> elements //GUI Data


	int selection = 0

	val ressource = getClass().getResource(FXML_TYPE_CONTROL_FILE)

	IDictionaryAccess dictAccess

	new(ITypeInfo typeInfo, ILinkable parent, IDictionaryAccess dictAccess) {
		super(_WORD,parent) //TODO: 24.01.22 maybe set Name to token name
		this.typeInfo = typeInfo
		this.elements = newArrayList()
		this.dictAccess = dictAccess
	}

	override getBaseType(){
		//typeInfo.activeType
		var TypeElement el
		if (selection < elements.size())
			el = elements.get(selection)
		else if (elements.size() === 0){
			var res = dictAccess.getLinkTypes((_parent as ILinkObj).token.name, _WORD, true)
			if (res!== null){
				typeInfo = res
				generate
			} else
				newType

		} else
			return null
		if (el !== null)
			return new XPair<String, ITypeAttributes>(el.name, el.getTypeAttributes)
		null
	}

	override getTypeEls(){
		elements.map[e | new XPair<String, ITypeAttributes>(e.typeName, e.typeAttributes)]
	}
	
	override getTypeInfo(){
		typeInfo 
	}

	override getRoot(){
		if (group === null)
			group = generate()
		update
		group
	}

	protected def Pane generate() {
		group = new VBox
		if (typeInfo.types !== null)
			for (type : typeInfo.types){
				addType(type, false)
			}
		group
	}

	def addType(XPair<String, ITypeAttributes> type, boolean withNone){
		val el = new TypeElement(type.key, type.value, elements.size, this, ressource, withNone)
		el.create
		if (el.root !== null)
			if (!Platform.fxApplicationThread)
				Platform.runLater([|
					group.getChildren.add(el.root)
				])
			else
				group.getChildren.add(el.root)
		elements.add(el)
	}

	override newType() {
		addType(new XPair<String, ITypeAttributes>(_NONE, new NoneTypeAttributes), true);
	}

	override setSelection(int selection) {
		if (selection< elements.size()){
			this.selection = selection
			update
		}
	}

	protected def update() {
		for (el : elements){
			if (selection != el.index){
				(el.controller as TypeControlElController).sphere.visible = false
			} else {
				(el.controller as TypeControlElController).sphere.visible = true
				createAttributes(el)
			}
		}
	}
	def clearAttribBox(Direction dir){
		var control = ((parent as IJavaFxObj).controller as PanelObjExtController)
		control.getAttribVBox(dir).children.clear
	}

	
	def createAttributes(TypeElement element) {

		var dbAttrs = element.getTypeAttributes()
		var attrs = dbAttrs.attrs as List<?> ?: #[]
		var control = ((parent as IJavaFxObj).controller as PanelObjExtController)

		if (attrs === null) {
			return
		}

		for (dir: #[Direction.IN, Direction.OUT]){
			if (!Platform.isFxApplicationThread)
				Platform.runLater([|
					clearAttribBox(dir)
				])
			else
				clearAttribBox(dir)
		}
		for (attr : attrs) {
			if (attr instanceof Relationship){
				var end = attr.endNodeId
				var start = attr.startNodeId
				var source = dbAttrs.source.get(0) //can only contain entity 1
				var targets = dbAttrs.target

				var VBox attribCtrl
				//var long dest_id
				var TitledPane accordion
				var Pair<Long ,Direction> directions
				var type = attr.get(_TYPE)
				var els = newArrayList
				
				//dest_id = end
				if (type!== null) {
					if (type instanceof ListValue) 
						els.addAll(type.asList)
					else
						els.add(type.asString)
					
					for (el : els) { 
						if (el.equals(Direction.IN.name)){
							directions = end -> Direction.IN
						}else if (source.id.equals(end)){
								directions = start -> Direction.IN
						} else {
							directions = end -> Direction.OUT
						}
										
						if (directions.key !==  source.id){
							attribCtrl = control.getAttribVBox(directions.value)
							accordion = control.getAccordion(directions.value)
							if (!accordion.visible)
								accordion.visible = true
		
							for (target : targets){
									if (target.id.equals(directions.key)){
										if (parent instanceof ILinkObj){
											AttribUtils.createAttrEntry(attribCtrl, source, target, attr)
										}
									}
								}
								
						}
					}
				}
			}
		}
	}

	override getSelection() {
		selection
	}

	override HashMap<String, List<ILink>> getLinks() {
		var result = newHashMap()
		for (type : elements){
			var name = type.name
			var typeR = type.getLink(name)
			if (typeR !== null){ //TODO: if may be obsolete
				result.put(name,typeR)
			}
		}
		result
	}

	override List<ILink> getSelectedLink() {
		if (selection<elements.size){
			elements.get(selection).links
		}
	}

	def setLinkTo(String typeName, ILink link){
		for (el : elements){            //TODO: [05.07.21] replace by HashMap with typeID
			if (el.name.equals(typeName))
				el.addLink = link
		}
	}

	def List<TypeElement> getAllTypes(){
		return elements
	}

	override toString() {
		return '''NodeType: «selectedLink» Sel:«selection»''';
	}

	def updateTypes(HashMap<String, ITypeAttributes> map) {
		typeInfo.updateTypes(map)  // is already updated
		for (type : allTypes){
			for (info: map.keySet)
				if (info.equals(type.typeName))
					type.setTypeAttributes = map.get(info)
		}
	}

	override postProcess(ILinkObj precessor, List<ITypeAttributes> attribs) {
		var token = (parent as ILinkObj).token
		dictAccess.processPrefix(token.name.toLowerCase, attribs)
		dictAccess.processSuffix(token.name.toLowerCase, attribs)

//		if(links !== null){
		for (type : elements){ //TODO: make lambda funct with map
			if (type.links !== null && !type.links.empty){			// check links per type - not globally
				if (precessor!== null && selection == type.index){
					var intAttribs = new ArrayList<ITypeAttributes>(attribs)
					intAttribs.add(type.typeAttributes)
					var pT = precessor.token 
					dictAccess.addSuccessor(pT.generateTokenInfo,   //TODO:11.04.2022 inconsistent Interface
						new DictItem(token.label, token.internalType.name, type.name, token.generateID), #{type.name}, intAttribs
					)
					val HashMap<String, ITypeAttributes> map = newHashMap
					dictAccess.getLinkTypes(token.name, _WORD, true).types.forall[ v | map.put(v.key, v.value) true]
					updateTypes(map)
				}
			}
		}



	}
	
	



}
