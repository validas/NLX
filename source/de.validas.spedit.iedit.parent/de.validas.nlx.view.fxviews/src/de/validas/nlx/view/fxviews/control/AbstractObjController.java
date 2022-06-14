package de.validas.nlx.view.fxviews.control;

import java.util.List;

import de.validas.nlx.constants.Direction;
import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.access.elements.SmallItem;
import de.validas.nlx.view.fxviews.semantics.ILink;
import de.validas.nlx.view.fxviews.semantics.ILinkObj;
import de.validas.nlx.view.fxviews.semantics.LinkPath;
import de.validas.nlx.view.fxviews.semantics.util.LinkUtils;
import de.validas.nlx.view.fxviews.semantics.SemanticLink;
import de.validas.nlx.view.fxviews.visual.NodePanel;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Labeled;
import javafx.scene.input.ClipboardContent;
import javafx.scene.input.ContextMenuEvent;
import javafx.scene.input.DragEvent;
import javafx.scene.input.Dragboard;
import javafx.scene.input.MouseDragEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.ScrollEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.Pane;

public abstract class AbstractObjController extends AbstractCanvasObjController implements IObjController {

	@FXML
	protected Pane panel;

	protected String panelDefaultStyle;

	/**
	 * @return the panel
	 */
	public Pane getPanel() {
		return panel;
	}

	public void addDragController(IDragController controller) {
		this.dragController = controller;
	}

	/**
	 * @return the label
	 */
	public abstract Labeled getLabel();

	// Event Listener on Pane[#panel].onContextMenuRequested
	@FXML
	public void panelKontextMenue(ContextMenuEvent event) {
	}

	// Event Listener on Pane[#panel].onDragDetected
	@FXML
	public void dragPanelStart(MouseEvent event) {
		double startX = event.getSceneX();
		double startY = event.getSceneY();

		if (dragController != null) {
			dragController.add(new Dragevent(startX, startY, this));
		}

		Object source = event.getSource();
		if (source instanceof Pane) {
			Dragboard db = ((Pane) source).startDragAndDrop(TransferMode.ANY);
			ClipboardContent content = new ClipboardContent();
			DragContainer container = new DragContainer();
			container.addData("source", ((Pane) source).toString());
			content.put(DragContainer.AddLink, container);
			db.setContent(content);
		}

		if (canvas instanceof SemanticFxViewController)
			((SemanticFxViewController) canvas).createLineVisual((int) startX, (int) startY);

		event.consume();
	}

	// Event Listener on Pane[#panel].onDragDone
	@FXML
	public void dragPanelEnd(DragEvent event) {
		visualClear();
		event.consume();
	}

	// Event Listener on Pane[#panel].onDragOver
	@FXML
	public void dragPanelOver(DragEvent event) {
		try {
			event.acceptTransferModes(TransferMode.NONE);
			IDragevent dragEvent = getDragEvent();
			IJavaFxObj source = dragEvent.getController().getParent();
			Point2D sourcePoint = dragEvent.getPoint2D();
			ILinkObj neigbour;
			
			if (source instanceof LinkPath) {
				if (sourcePoint.getX() < event.getSceneX()) {
					neigbour = (ILinkObj) LinkUtils.findNextAdjacentPanel((ILink) source.getParent(), true).getSuccessor();
					while (neigbour.getToken() instanceof SmallItem) 
						neigbour = (ILinkObj) neigbour.getSuccessor();
				} else {
					neigbour = (ILinkObj) LinkUtils.findNextAdjacentPanel((ILink) source.getParent(), false).getPrecessor();
					while (neigbour.getToken() instanceof SmallItem) 
						neigbour = (ILinkObj) neigbour.getPrecessor();
				}
				if (neigbour == null)  //TODO: 21.07.21 check if really dead code
					return;
				if (neigbour.equals(parent))
					hoverMode.apply(event);
			} else if (source instanceof NodePanel) {
				if (!parent.getParent().equals(source.getParent()) || parent.equals(source))
					return;
				List<ILink> sourceLink = ((NodePanel) source).getLink();
				List<ILink> destLink = ((NodePanel) parent).getLink();
				boolean sameLink = false;
				if (sourceLink != null && destLink != null)
					for (ILink src : sourceLink) {
						if (destLink.contains(src))
							sameLink = true;
					}
				if (!sameLink && calcDeta((NodePanel) parent, (NodePanel) source))
					hoverMode.apply(event);
			}
		} finally {
			Point2D absolutePos = canvas.createAbsolutePos(event.getSceneX(), event.getSceneY());
			visualDraw((int) absolutePos.getX(), (int) absolutePos.getY());
			event.consume();
		}
	}

	private boolean calcDeta(NodePanel parentPanel2, NodePanel sourcePanel) {
		int delta = parentPanel2.getIndex() - sourcePanel.getIndex();
		int absDelta = Math.abs(delta);
		NodePanel neigbour = null;
		if (absDelta == 1)
			return true;
		else if (absDelta == 2)
			if (delta > 0)
				neigbour = (NodePanel) sourcePanel.getSuccessor();
			else
				neigbour = (NodePanel) sourcePanel.getPrecessor();
		if (neigbour !=null && neigbour.getToken() instanceof SmallItem)
			return true;
		return false;
	}

	// Event Listener on Pane[#panel].onDragDropped
	@FXML
	public void dragPanelDropped(DragEvent event) { // TODO: prepare for general IJavaFXObj
		visualClear();

		DragContainer container = (DragContainer) event.getDragboard().getContent(DragContainer.AddLink);
		if (container == null)
			return;

		IDragevent dragEvent = getDragEvent();
		IJavaFxObj source = dragEvent.getController().getParent();
		Point2D sourcePoint = dragEvent.getPoint2D();
		Direction dir;
		if (sourcePoint.getX() < event.getSceneX())
			dir = Direction.RIGHT;
		else
			dir = Direction.LEFT;
		if (source != null)
			if (source instanceof LinkPath)
				((NodePanel) parent).getViewPart().connectNode((SemanticLink) source.getParent(), (NodePanel) parent, dir);
			else if (source instanceof NodePanel)
				((NodePanel) parent).getViewPart().connectNode((NodePanel) source, (NodePanel) parent, dir);

		if (dragController != null) {
			dragController.clear();
		}
		event.consume();
	}

	// Event Listener on Pane[#panel].onDragEntered
	@FXML
	public void dragPanelEntered(DragEvent event) {
		
	}

	// Event Listener on Pane[#panel].onDragExited
	@FXML
	public void dragPanelExited(DragEvent event) {

	}

	// Event Listener on Pane[#panel].onMouseClicked
	@FXML
	public void panelMouseClicked(MouseEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseDragEntered
	@FXML
	public void dragPanelMouseEntered(MouseDragEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseDragExited
	@FXML
	public void dragPanelMouseExited(MouseDragEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseDragOver
	@FXML
	public void dragPanelMouseOver(MouseDragEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseDragReleased
	@FXML
	public void dragPanelMouseReleased(MouseDragEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseDragged
	@FXML
	public void dragPanelMouseDragged(MouseEvent event) {
		visualClear();
		event.consume();
	}

	// Event Listener on Pane[#panel].onMouseEntered
	@FXML
	public void panelMouseEntered2(MouseEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseExited
	@FXML
	public void panelMouseExited2(MouseEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseMoved
	@FXML
	public void panelMouseMoved(MouseEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMousePressed
	@FXML
	public void panelMousePressed(MouseEvent event) {
		// TODO to be deleted in the future if not used
	}

	// Event Listener on Pane[#panel].onMouseReleased
	@FXML
	public void panelMouseReleased(MouseEvent event) {
		visualClear();
	}

	// Event Listener on Pane[#panel].onScroll
	@FXML
	public void panelMouseScroll(ScrollEvent event) {

	}

	@FXML // This method is called by the FXMLLoader when initialization is complete
	void initialize() {
		super.initialize();
	}
}
