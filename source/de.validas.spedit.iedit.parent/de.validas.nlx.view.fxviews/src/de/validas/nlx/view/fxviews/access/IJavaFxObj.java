package de.validas.nlx.view.fxviews.access;

import de.validas.nlx.view.fxviews.control.ICanvasController;
import de.validas.nlx.view.fxviews.control.IController;

public interface IJavaFxObj {

	Object getParent();
	IController getController();
	ICanvasController getCanvasController();

}
