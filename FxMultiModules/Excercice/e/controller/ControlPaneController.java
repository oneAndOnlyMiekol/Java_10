package e.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;


public class ControlPaneController implements Initializable {

	
    @FXML
    private Button clearScreenButton;

    @FXML
    private Button switchContentButton;

    @FXML
    private Button lowerCaseButton;

    @FXML
    private Button upperCaseButton;

	public Button getClearScreenButton() {
		return clearScreenButton;
	}

	public void setClearScreenButton(Button clearScreenButton) {
		this.clearScreenButton = clearScreenButton;
	}

	public Button getSwitchContentButton() {
		return switchContentButton;
	}

	public void setSwitchContentButton(Button switchContentButton) {
		this.switchContentButton = switchContentButton;
	}

	public Button getLowerCaseButton() {
		return lowerCaseButton;
	}

	public void setLowerCaseButton(Button lowerCaseButton) {
		this.lowerCaseButton = lowerCaseButton;
	}

	public Button getUpperCaseButton() {
		return upperCaseButton;
	}

	public void setUpperCaseButton(Button upperCaseButton) {
		this.upperCaseButton = upperCaseButton;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		

	}

	

}
