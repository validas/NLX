package de.validas.nlx.view.fxviews.control;

import javafx.fxml.FXML;
import javafx.scene.control.ComboBox;
import javafx.scene.input.TransferMode;

public class PanelObjController extends SmallPanelObjController {
	@FXML
	protected ComboBox<String> combobox;
	
	public PanelObjController() {
		super();
		hoverMode = (event)-> {
			event.acceptTransferModes(TransferMode.ANY);
		};
	}

	void initialize() {
		super.initialize();
        assert combobox != null : "fx:id=\"combobox\" was not injected: check your FXML file 'PanelObj.fxml'.";
	}
	
	/**
	 * @return the combobox
	 */
	public ComboBox<String> getCombobox() {
		return combobox;
	}

}
