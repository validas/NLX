/**
 * 
 */
package de.validas.nlx.view.fxviews.control;

import java.util.List;

import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.semantics.util.IDelegates.Procedure;
import de.validas.nlx.view.fxviews.visual.IVisual;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;

/**
 * @author schaller
 *
 */
public class AbstractCanvasObjController extends AbstractController {
	
	protected ICanvasController canvas;
	protected IDragController dragController;
	/**
	 * 
	 */
	@Override
	public void addDragController(IDragController controller) {
		this.dragController = controller;
	}
	
	public void setParent(IJavaFxObj nodePanel) {
		this.parent = nodePanel;
		canvas = parent.getCanvasController();
	}
	
	protected Procedure<DragEvent> hoverMode = (event)-> {
		event.acceptTransferModes(TransferMode.NONE);
	};
	
	protected IJavaFxObj getSource() {
		IDragevent event = getDragEvent();
		if (event !=null) {
			IElmController controller = event.getController();
			return controller.getParent();
		}
			return null;
	}
	
	protected IDragevent getDragEvent() {
		List<IDragevent> dragEvents = dragController.getEvents();
		if (!dragEvents.isEmpty()) {
			return dragEvents.get(dragEvents.size()-1);
		}
			return null;
	}

	/**
	 * draws line visual display
	 */
	protected void visualDraw(int x, int y) {
		IVisual lineVisual = ((SemanticFxViewController) canvas).getLineVisual();
		if (lineVisual != null)
			lineVisual.draw(x, y);
	}
	
	/**
	 * clears line visual display
	 */
	protected void visualClear() {
		IVisual lineVisual = ((SemanticFxViewController) canvas).getLineVisual();
		if (lineVisual != null)
			lineVisual.clear();
	}

}
