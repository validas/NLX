/**
 * 
 */
package de.validas.nlx.view.fxviews.semantics;

import static de.validas.nlx.view.fxviews.semantics.constants.LinkConstants.LINK_HEIGHT;

import java.util.List;

import de.validas.nlx.view.fxviews.semantics.util.LinkUtils;
import de.validas.nlx.view.fxviews.views.IPanelContainer;
import de.validas.nlx.view.fxviews.visual.ContainerPanel;
import de.validas.utils.data.lists.LinkedList;
import de.validas.utils.data.types.XPair;
import javafx.application.Platform;
import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

/**
 * @author schaller
 *
 */
public class SemanticLinkListener implements IListener {

	protected LinkedList<ILinkObj> panelChain;
	protected Pane linkPane;
	protected IPanelContainer viewer;

	public SemanticLinkListener(IPanelContainer viewer) {
		this.viewer = viewer;
		this.panelChain = viewer.getPanelChain();
		if (viewer instanceof ILinkContainer) // TODO: optimal to solve this problem object internally :)
			this.linkPane = ((ILinkContainer) viewer).getController().getLinkPane();
		else
			this.linkPane = viewer.getCanvasController().getLinkPane();
	}

	/**
	 * @return the panelChain
	 */
	public LinkedList<ILinkObj> getPanelChain() {
		return panelChain;
	}

	/**
	 * @param panelChain the panelChain to set
	 */
	public void setPanelChain(LinkedList<ILinkObj> panelChain) {
		this.panelChain = panelChain;
	}

	/**
	 * (non-Javadoc)
	 * 
	 * @see de.validas.nlx.view.fxviews.semantics.IListener#update()
	 */
	@Override
	public void update() {

		if (panelChain == null || panelChain.isEmpty())
			return;

		if (linkPane == null)
			return;
		//------------------------------------
		//linkPane.getChildren().clear(); // TODO: try to update existing object coordinates instead of purging all
										// objects
		//------------------------------------
		IPanelContainer container = panelChain.get(0).getCanvas();
		List<ILink> buffer = container.getLinkBuffer();
		if (buffer != null)
			for (ILink links: buffer) {
				links.removeLink();  //TODO: 28.02.2022 concurrent modification?
			}
		
		//HACK: because there are still paths remaining
		if(Platform.isFxApplicationThread()) {
			linkPane.getChildren().clear();
		}
		
		for (ILinkObj node : panelChain) { // TODO: override problem with generics that are subset of Iterator<E>
			if (node instanceof ContainerPanel) {
				((ContainerPanel)node).getLinkListener().update();
			}
			List<ILink> links = node.getLink();
			if (links != null && !links.isEmpty()) {
				for (ILink link : links) {

					XPair<String, ILinkable> start = link.getStartLink();
					XPair<String, ILinkable> end = link.getEndLink();
					if (end.equals(node)) { //swap if reverse direction
						XPair<String, ILinkable> dummy = start;
						start = end;
						end = dummy;
					}
					drawLinks(link, LinkUtils.recursiveLinkToPoint(start,link, false), LinkUtils.recursiveLinkToPoint(end,link, false));
					
				}
			}
		}

	}

	/**
	 * @param link
	 * @param startPoint
	 * @param endPoint
	 */
	protected void drawLinks(ILink link, Point2D startPoint, Point2D endPoint) {
		if (startPoint == null || endPoint == null)
			return;
		if (startPoint.getX() <= endPoint.getX()) {
//			linkPath.draw(startPoint, endPoint);  //TODO: 12.05.21 add CSS hierarchy attribute here
			link.draw(startPoint, endPoint);
			nodeToLinkCalculation(link, LinkUtils.calculateLinkOffset(startPoint, endPoint));
		}
	}

	protected void nodeToLinkCalculation(ILink parentLink, Point2D startPoint) {
		List<ILink> startLinks = parentLink.getLink();
		if (startLinks != null && !startLinks.isEmpty()) {
			for (ILink startLink : startLinks) {
		
				Point2D endPoint = LinkUtils.recursiveLinkToPoint(startLink.getOpposite(parentLink), startLink, false);
		
				if (endPoint != null)
					drawLinks(startLink, startPoint, endPoint);

			}
		}

	}

}
