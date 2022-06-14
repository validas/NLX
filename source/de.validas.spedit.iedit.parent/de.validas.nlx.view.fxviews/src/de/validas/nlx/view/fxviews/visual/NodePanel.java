package de.validas.nlx.view.fxviews.visual;

import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._CIRCLE_BUTTON;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.xtext.xbase.lib.CollectionLiterals;

import de.validas.nlx.constants.Direction;
import de.validas.nlx.dictionary.type.ITypeAttributes;
import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.elements.ShortCutItem;
import de.validas.nlx.view.fxviews.control.ICanvasController;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.control.IObjController;
import de.validas.nlx.view.fxviews.control.PanelObjController;
import de.validas.nlx.view.fxviews.control.PanelObjExtController;
import de.validas.nlx.view.fxviews.control.SmallPanelObjController;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.ILinkType;
import de.validas.nlx.view.fxviews.semantics.IListener;
import de.validas.nlx.view.fxviews.semantics.types.WordType;
import de.validas.nlx.view.fxviews.semantics.util.IDelegates.Procedure2;
import de.validas.nlx.view.fxviews.views.IPanelContainer;
import de.validas.nlx.view.fxviews.views.ISemanticTrainViewPart;
import de.validas.utils.data.lists.AbstractAppendable;
import de.validas.utils.data.lists.IAppendable;
import de.validas.utils.data.types.XPair;
import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.event.Event;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Bounds;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.control.TitledPane;

public class NodePanel extends AbstractAppendable implements ILinkObj, IAppendable, IPanel, IJavaFxObj {
	/**
	 * 
	 */
	protected IPanelContainer parent = null;
	protected FXMLLoader loader;
	protected IObjController controller;
	protected IDragController dragController;
	protected Parent root;
	protected IItem token;
	//protected ILink link;
	protected int index = -1;
	private IListener linkListener;
	
	protected List<Node> canvasParent;
	protected IPanelsAccessor accessor;
	
	ChangeListener<? super Bounds> linkUpdateListener = (obs, oldScene, newScene) -> {
		if (newScene != null && oldScene != null) {
			if (linkListener != null)
				linkListener.update();
		}
	};
	
	Procedure2<IJavaFxObj, Event> plusButton = (parent, event)-> {
		token.newType();
		if (parent != null)
			this.parent.getLinkListener().update();
	};
	
	
	

	/**
	 * @return the index
	 */
	@Override
	public int getIndex() {
		return index;
	}

	NodePanel(IPanelContainer semanticFxViewPart, FXMLLoader loader) {
		this.parent = semanticFxViewPart;
		this.loader = loader;
		this.controller = loader.getController();
	}

	public NodePanel(IPanelContainer parent, URL resource, List<Node> canvasParent, IDragController dragController, IListener linkListener, IItem item, IPanelsAccessor accessor, int i) {
		this.parent = parent;
		//TODO: move loader into parent
		this.loader = new FXMLLoader(resource);
		loader.setClassLoader(getCanvas().getFxClassLoader());
		this.dragController = dragController;
		this.token = item;
		item.setParent(this);
		this.linkListener = linkListener;
		setName(item.getName());
		//scheduleDraw();
		this.canvasParent = canvasParent;
		this.accessor = accessor;
		this.index = i;
	}
	
	@Override
	public void scheduleDraw() {
		Platform.runLater(()->{
			if (root != null && !canvasParent.contains(root)) {
				canvasParent.add(root);
				configure(accessor);
			}
		});
	}

	/**
	 * @return the loader
	 */
	public FXMLLoader getLoader() {
		return loader;
	}

	/**
	 * @return the controller
	 */
	public IObjController getController() {
		return controller;
	}

	/**
	 * @return the root
	 */
	public Parent getRoot() {
		return root;
	}

	public Parent load() {
		try {
			root = loader.load();
			controller = loader.getController();
			controller.addDragController(dragController);
			controller.setParent(this);
			if (controller instanceof PanelObjExtController) {
				List<Direction> directions = Collections.<Direction>unmodifiableList(CollectionLiterals.<Direction>newArrayList(Direction.IN, Direction.OUT));
				for (Direction direction: directions) {
					TitledPane accordeon = ((PanelObjExtController)controller).getAccordion(direction);
					accordeon.managedProperty().bind(accordeon.visibleProperty());
				}
			}
			setName(token.getName());
			if (controller instanceof SmallPanelObjController) {
				Node child = token.instantiateTypes();
				if (child != null)
					if (Platform.isFxApplicationThread())
						((PanelObjExtController) controller).getTypeContainer().getChildren()
							.add(child);
					else 
						Platform.runLater(()->{
							((PanelObjExtController) controller).getTypeContainer().getChildren()
							.add(child);
						});
				if (controller instanceof PanelObjExtController)
					controller.addListener(_CIRCLE_BUTTON, plusButton);
			}
			setListeners(linkUpdateListener);
			return root;
		} catch (IOException e) {
			e.printStackTrace();
			return null;
		}
	}

	// TODO: should be also taken from the Item directly
	public void setName(String name) {
		if (controller != null) {
			controller.getLabel().setText(name);
		}
	}

	public void setToken(IItem token) {
		token.setParent(this);
		this.token = token;
		setName(token.getName());
	}

	/**
	 * @return the token
	 */
	@Override
	public IItem getToken() {
		return token;
	}

	public void configure(IPanelsAccessor accessor) {
		
		String cssClass = accessor.getCssClass(index);
		if (cssClass != null && !cssClass.isEmpty())
			controller.getPanel().getStyleClass().add(cssClass);
	}

	public ICanvasController getCanvasController() {
		return this.parent.getCanvasController();
	}

	public ISemanticTrainViewPart getViewPart() {
		return this.parent.getViewPart();
	}

	/**
	 * @return the parent
	 */
	public IPanelContainer getParent() {
		return parent;
	}

	@Override
	public List<ILink> getLink() {
		ILinkType intType = token.getInternalType();
		if (intType != null)
			return intType.getSelectedLink();
		return null;
	}
	
	@Override
	public Map<String, List<ILink>> getLinks() {
		ILinkType internal = token.getInternalType();
		if (internal != null) {
			return internal.getLinks();
		} else {
			return null;
		}
	}

	@Override
	public void setLink(String type, ILink link) {
		token.setLinkTo(type,link);
	}

	@Override
	public ILinkType getLinkType() {
		return token.getInternalType();
	}

	@Override
	public void setListeners(ChangeListener<? super Bounds> changeListener) {
		root.boundsInParentProperty().addListener(changeListener);
	}
	
	@Override
	public String toString() {
		StringBuilder links = new StringBuilder();
		if (getLink()!=null && !getLink().isEmpty())
			for (ILink link : getLink()) {
				links.append("\n\t");
				links.append(link.getName());
			}
		else
			links.append("null");
		String name = "<NONE>";
		if (getToken() != null)
			name = getToken().getName();
		return String.format("NodePanel [Name: %1$s, Link: %2$s]", name, links);
	}

	@Override
	public IPanelContainer getCanvas() {
		return getParent();
	}

	@Override
	public String getName() {
		return token.getName();
	}
	
	public List<XPair<String, ITypeAttributes>> getTypes() { 
		return token.getTypes();			
	}

	@Override
	public XPair<String, ITypeAttributes> getType() {
		return token.getInternalType().getBaseType();
	}

	@Override
	public int getLowerBound() {
		return index;
	}

	@Override
	public int getHigherBound() {
		return index;
	}

	@Override
	public int getCardinality() {
		return 0;
	}

	@Override
	public Map<? extends String, ? extends Object> getIntermediate() {
		return new HashMap<String, Object>();
	}

}