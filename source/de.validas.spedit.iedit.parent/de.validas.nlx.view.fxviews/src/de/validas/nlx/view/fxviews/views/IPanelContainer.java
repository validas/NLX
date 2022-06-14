/**
 * 
 */
package de.validas.nlx.view.fxviews.views;

import java.util.List;

import de.validas.nlx.view.fxviews.control.ICanvasController;
import de.validas.nlx.view.fxviews.control.IController;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.IListener;
import de.validas.nlx.view.fxviews.semantics.SemanticLink;
import de.validas.utils.data.lists.LinkedList;

/**
 * @author schaller
 *
 */
public interface IPanelContainer {

	ICanvasController getCanvasController();

	ISemanticTrainViewPart getViewPart();

	LinkedList<ILinkObj> getPanelChain();
	
	IController getController();
	
	ClassLoader getFxClassLoader();

	IListener getLinkListener();
	
	List<ILink> getLinkBuffer();

	void addLinkBuffer(ILink semanticLink);

	boolean isPostprocess();

}
