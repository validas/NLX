/**
 * 
 */
package de.validas.nlx.view.fxviews.control;

import javafx.geometry.Point2D;

/**
 * @author schaller
 *
 */
public class Dragevent implements IDragevent {

	protected double startX;
	protected double startY;
	protected IElmController controller;

	/**
	 * @param smallPanelObjController 
	 * @param startY 
	 * @param startX 
	 * 
	 */
	public Dragevent(double startX, double startY, IElmController controller) {
		this.startX = startX;
		this.startY = startY;
		this.controller = controller;
	}
	
	public Point2D getPoint2D() {
		return new Point2D(startX, startY);
	}

	/**
	 * @return the controller
	 */
	public IElmController getController() {
		return controller;
	}
	
	
}
