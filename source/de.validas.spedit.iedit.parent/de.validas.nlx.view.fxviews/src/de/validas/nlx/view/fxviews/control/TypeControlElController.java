package de.validas.nlx.view.fxviews.control;

import static de.validas.nlx.view.fxviews.semantics.constants.FxViewConstants._CIRCLE_BUTTON;

import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.paint.PhongMaterial;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Sphere;

public class TypeControlElController extends AbstractController {
	protected IDragController dragController;
	
	@FXML
	private Circle button;
	@FXML
	private Sphere sphere;
	@FXML
	private PhongMaterial materialPhong;
	@FXML
	private ComboBox<String> mainCombo;
	@FXML
	private ComboBox<String> subCombo;
    @FXML
    private HBox secondRow;
	
	@FXML
	public void circleClicked(MouseEvent event) {
		//System.out.println("[TypeControlEL]: CircleClicked");
		executeListeners(_CIRCLE_BUTTON, event);
	}
	
	/**
	 * @return the button
	 */
	public Circle getButton() {
		return button;
	}

	/**
	 * @return the sphere
	 */
	public Sphere getSphere() {
		return sphere;
	}

	/**
	 * @return the materialPhong
	 */
	public PhongMaterial getMaterialPhong() {
		return materialPhong;
	}

	/**
	 * @return the mainCombo
	 */
	public ComboBox<String> getMainCombo() {
		return mainCombo;
	}

	/**
	 * @return the subCombo
	 */
	public ComboBox<String> getSubCombo() {
		return subCombo;
	}

	/**
	 * @return the dragController
	 */
	public IDragController getDragController() {
		return dragController;
	}

	/**
	 * @return the secondRow
	 */
	public HBox getSecondRow() {
		return secondRow;
	}

	/**
	 * @return the parent
	 */
	public IJavaFxObj getParent() {
		return parent;
	}

	@Override
	public void addDragController(IDragController controller) {
		if (dragController == null)
			dragController = controller;
	}
}
