package de.validas.nlx.view.fxviews.control;

import de.validas.nlx.view.fxviews.access.IJavaFxObj;
import de.validas.nlx.view.fxviews.semantics.util.IDelegates.Procedure2;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.geometry.Point2D;
import javafx.scene.control.Labeled;
import javafx.scene.control.TitledPane;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;

public class ContainerController extends AbstractObjController implements IContainerController{
	
	@FXML
	private TitledPane title;
	@FXML
	private HBox layoutSpace;
	@FXML
	protected Pane linkPane;
	
	public ContainerController() {
		super();
		hoverMode = (event)-> {
			event.acceptTransferModes(TransferMode.ANY);
		};
	}
	
	@Override
	public Labeled getLabel() {
		return title;
	}
	/**
	 * @return the layoutSpace
	 */
	public Pane getLayoutSpace() {
		return layoutSpace;
	}
	/**
	 * @return the linkPane
	 */
	public Pane getLinkPane() {
		return linkPane;
	}
	@Override
	public Point2D createAbsolutePos(double sceneX, double sceneY) {

		return new Point2D(sceneX, sceneY);
	}

	@Override
	public void addListener(String string, Procedure2<IJavaFxObj, Event> plusButton) {
		//stub
	}

}
