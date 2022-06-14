package de.validas.nlx.view.fxviews.control;

import java.net.URL;
import java.util.ResourceBundle;

import de.validas.nlx.constants.Direction;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.VBox;

public class SmallPanelObjController extends AbstractObjController {

	@FXML
	private ResourceBundle resources;
	@FXML
	private URL location;
	@FXML
	private VBox attribVBoxIN;
	@FXML
	private TitledPane accordionIN;
	@FXML
	private TitledPane accordionOUT;
	@FXML
	private VBox attribVBoxOUT;
	@FXML
	private Label label;

	@FXML
	void initialize() {
		super.initialize();
		assert attribVBoxIN != null : "fx:id=\"attribVBoxIN\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
		assert accordionIN != null : "fx:id=\"accordionIN\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
		assert accordionOUT != null : "fx:id=\"accordionOUT\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
		assert attribVBoxOUT != null : "fx:id=\"attribVBoxOUT\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
		assert label != null : "fx:id=\"label\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
		assert panel != null : "fx:id=\"panel\" was not injected: check your FXML file 'SmallPanelObj.fxml'.";
	}

	@Override
	public Labeled getLabel() {
		return label;
	}

	/**
	 * @return the resources
	 */
	protected ResourceBundle getResources() {
		return resources;
	}

	/**
	 * @return the location
	 */
	protected URL getLocation() {
		return location;
	}

	/**
	 * @return the attribVBoxIN
	 */
	protected VBox getAttribVBoxIN() {
		return attribVBoxIN;
	}

	/**
	 * @return the accordionIN
	 */
	protected TitledPane getAccordionIN() {
		return accordionIN;
	}

	/**
	 * @return the accordionOUT
	 */
	protected TitledPane getAccordionOUT() {
		return accordionOUT;
	}

	/**
	 * @return the attribVBoxOUT
	 */
	protected VBox getAttribVBoxOUT() {
		return attribVBoxOUT;
	}
	
	/**
	 * @return the attribVBox
	 */
	public VBox getAttribVBox(Direction dir) {
		switch (dir) {
			case IN: {
				return attribVBoxIN;
			}
			case OUT: {
				return attribVBoxOUT;
			}
			default:
				break;
		}
		return null;
	}

	/**
	 * @return the accordion
	 */
	public TitledPane getAccordion(Direction dir) {
		
		switch (dir) {
			case IN: {
				return accordionIN;
			}
			case OUT: {
				return accordionOUT;
			}
			default:
				break;
		}
		return null;
	}
}
