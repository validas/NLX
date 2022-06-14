/**
 * 
 */
package de.validas.nlx.view.fxviews.semantics;

import java.util.List;

import de.validas.nlx.view.fxviews.control.IDragController;
import de.validas.utils.data.types.XPair;
import javafx.geometry.Point2D;
import de.validas.nlx.view.fxviews.semantics.LinkStyle;

/**
 * @author schaller
 *
 */
public interface ILink extends ILinkable {

	public List<ILink> getParent();

	public XPair<String, ILinkable> getOpposite(ILinkable node);

	public XPair<String, ILinkable> getStartLink();

	public XPair<String, ILinkable> getEndLink();

	public LinkPath getRoot();

	public ILinkInfo getLinkInfo();

	public void setOverKomma(boolean overKomma);

	public boolean isOverKomma();

	//public void setLinkPath(LinkPath path);

	public void setStyle(LinkStyle style);

	public LinkStyle getStyle();

	public int getLevel();

	public int getMaxLevel();

	public void setMaxLevel(int i);

	public abstract IDragController getDragController();

	public void removeLink();

	public void draw(Point2D startPoint, Point2D endPoint);
	
	public ILinkable getCardinalType();
	
	public boolean hasCardinalType();

	
}
