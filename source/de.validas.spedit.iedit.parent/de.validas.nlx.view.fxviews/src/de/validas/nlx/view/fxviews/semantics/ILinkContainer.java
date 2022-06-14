/**
 * 
 */
package de.validas.nlx.view.fxviews.semantics;

import java.util.List;

import de.validas.nlx.view.fxviews.control.IContainerController;
import de.validas.nlx.view.fxviews.views.IPanelContainer;

/**
 * @author schaller
 *
 */
public interface ILinkContainer extends ILinkObj {

	public abstract boolean getIsResolved();
	public abstract IContainerController getController();
	public List<ILinkable> getInnerLink();
	public IPanelContainer getParent();
	List<ILinkable> getAllInnerLinks();
	
}
