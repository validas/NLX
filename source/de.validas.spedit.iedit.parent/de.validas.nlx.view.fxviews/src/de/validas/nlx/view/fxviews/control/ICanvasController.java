package de.validas.nlx.view.fxviews.control;

import javafx.geometry.Point2D;
import javafx.scene.layout.Pane;

public interface ICanvasController extends IController {
	
	public Point2D createAbsolutePos(double sceneX, double sceneY);

	public Pane getLinkPane();

}
