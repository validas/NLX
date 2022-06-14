/**
 * 
 */
package de.validas.nlx.view.fxviews.semantics;

import de.validas.utils.data.lists.LinkedList;

/**
 * @author schaller
 *
 */
public interface IListener {
	public LinkedList<ILinkObj> getPanelChain();
	public void setPanelChain(LinkedList<ILinkObj> panelChain);
	void update();
}
