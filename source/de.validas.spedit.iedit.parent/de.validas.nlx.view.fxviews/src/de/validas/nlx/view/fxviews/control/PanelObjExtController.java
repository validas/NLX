package de.validas.nlx.view.fxviews.control;

import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._CIRCLE_BUTTON;
import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._MOUSE_PRESSED;

import de.validas.nlx.constants.Direction;
import javafx.fxml.FXML;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;

public class PanelObjExtController extends SmallPanelObjController {

	@FXML
	protected VBox typeContainer;
	@FXML
	protected Circle plusIcon;
	
	@FXML
	protected VBox attribVBoxIN;

	@FXML
	protected TitledPane accordionIN;

	@FXML
	protected TitledPane accordionOUT;

	@FXML
	protected VBox attribVBoxOUT;

	
	public PanelObjExtController() {
		super();
		hoverMode = (event)-> {
			event.acceptTransferModes(TransferMode.ANY);
		};
	}

	// Event Listener on Circle[#plusIcon].onMouseClicked
	@FXML
	public void circleClicked(MouseEvent event) {
		if (event.getEventType().getName().equals(_MOUSE_PRESSED))
			executeListeners(_CIRCLE_BUTTON, event);
	}

	/**
	 * @return the typeContainer
	 */
	public VBox getTypeContainer() {
		return typeContainer;
	}

	/**
	 * @return the plusIcon
	 */
	public Circle getPlusIcon() {
		return plusIcon;
	}
	
	@Override 
	void initialize() {
		super.initialize();
	}
	
	
}
