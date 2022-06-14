/**
 * 
 */
package de.validas.nlx.view.fxviews.visual;

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;

/**
 * @author schaller
 *
 */
public class LineVisual implements IVisual {

	protected int startX;
	protected int startY;
	protected Pane canvas;
	protected Line lineGeom;

	/**
	 * @param parent
	 * @param startY
	 * @param startX
	 * 
	 */
	public LineVisual(int startX, int startY, Pane origin) {
		this.startX = startX;
		this.startY = startY;
		canvas = origin;
		lineGeom = new Line(startX, startY, startX, startY);
		canvas.getChildren().add(lineGeom);
	}

	@Override
	public void draw(int x, int y) {
		if (lineGeom != null) {
			lineGeom.setEndX(x);
			lineGeom.setEndY(y);

		}
	}

	@Override
	public void clear() {
		canvas.getChildren().remove(lineGeom);
		lineGeom = null;
	}

}
