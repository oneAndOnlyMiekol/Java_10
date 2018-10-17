package e.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainPaneController implements Initializable {

	@FXML
	private ContentPaneController contentPaneController;
	
	@FXML
	private ControlPaneController controlPaneController;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		Button clearScreenButton = controlPaneController.getClearScreenButton();
		Button switchContentButton = controlPaneController.getSwitchContentButton();
		Button lowerCaseButton = controlPaneController.getLowerCaseButton();
		Button upperCaseButton = controlPaneController.getUpperCaseButton();
		
		TextArea normalTextArea = contentPaneController.getNormalTextArea();
		TextArea reverseTextArea = contentPaneController.getReverseTextArea();
		
		normalTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x ->
		contentPaneController.reverseText(normalTextArea, reverseTextArea));
		
		reverseTextArea.addEventFilter(KeyEvent.KEY_RELEASED, x ->
		contentPaneController.reverseText(reverseTextArea, normalTextArea));
		
		clearScreenButton.setOnAction(x -> contentPaneController.clearTextArea());
		
		switchContentButton.setOnAction(x -> contentPaneController.switchTextArea());
		
		lowerCaseButton.setOnAction(x -> contentPaneController.toLowerCase());
		
		upperCaseButton.setOnAction(x -> contentPaneController.toUpperCase());

	}

}
