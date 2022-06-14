/**
 * 
 */
package de.validas.nlx.view.fxviews.visual;

import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.FXML_CONTAINER_FILE;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.FXML_PANEL_FILE;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants.FXML_SMALL_PANEL_FILE;

import java.util.List;

import de.validas.nlx.view.fxviews.access.IItem;
import de.validas.nlx.view.fxviews.access.IPanelsAccessor;
import de.validas.nlx.view.fxviews.access.elements.ContainerItem;
import de.validas.nlx.view.fxviews.access.elements.ShortCutItem;
import de.validas.nlx.view.fxviews.access.elements.SmallItem;
import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.nlx.view.fxviews.semantics.IListener;
import de.validas.nlx.view.fxviews.views.IPanelContainer;
import javafx.beans.value.ChangeListener;
import javafx.collections.ObservableList;
import javafx.geometry.Bounds;
import javafx.scene.Node;

/**
 * @author schaller
 *
 */
public class NodePanelFactory {
	
	//TODO: replace all strings by externals in all classes

	protected IPanelContainer parent;
	protected IDragController dragController;
	

	/**
	 * 
	 */
	public NodePanelFactory(IPanelContainer parent, IDragController dragController) {
		this.parent = parent;
		this.dragController = dragController;
	}

	public IPanel create(IItem token, IPanelsAccessor accessor, IListener linkListener, int i, List<Node> container) {
		
//		ChangeListener<? super Bounds> changeListener = (obs, oldScene, newScene) -> {
//			if (newScene != null && oldScene != null) {
//				if (linkListener != null)
//					linkListener.update();
//			}
//		};
		
		IPanel nodePanel;
		if (token instanceof SmallItem)
			nodePanel = new NodePanel(parent, getClass().getResource(FXML_SMALL_PANEL_FILE), container, dragController, linkListener, token, accessor, i);
		else { 
			if (token instanceof ContainerItem) 
				nodePanel = new ContainerPanel(parent, getClass().getResource(FXML_CONTAINER_FILE), container, dragController, linkListener, token, accessor, i);
			else {
				nodePanel = new NodePanel(parent, getClass().getResource(FXML_PANEL_FILE), container, dragController, linkListener, token, accessor, i);
			}
			
		}
		nodePanel.load();
		nodePanel.scheduleDraw();
		return nodePanel;
	}

}
