/**
 * 
 */
package de.validas.nlx.view.fxviews.control;

import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.semantics.util.IDelegates.Procedure2;
import javafx.event.Event;
import javafx.scene.control.Labeled;
import javafx.scene.layout.Pane;

/**
 * @author schaller
 *
 */
public interface IObjController extends IElmController {
	
	public Pane getPanel();
	public Labeled getLabel(); 
	public void addDragController(IDragController controller);
	public void setParent(IJavaFxObj nodePanel);
	public IJavaFxObj getParent();
	public void addListener(String string, Procedure2<IJavaFxObj, Event> plusButton); 
}
