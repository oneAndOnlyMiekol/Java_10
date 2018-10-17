package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;

public class MainController implements Initializable {

	@FXML
	private VBox lowerCaseMainPane;

	@FXML
	private TextArea lowerCaseTextArea;

	@FXML
	private Button lowerCaseButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		/*
		 * 1)--------------------------------------------------------------------
		 * lowerCaseButton.setOnAction(new EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("Event "+ event.getEventType() +" has been generated");
		 * String text = lowerCaseTextArea.getText();
		 * lowerCaseTextArea.setText(text.toLowerCase()); } });
		 * 2)--------------------------------------------------------------------
		 * lowerCaseButton.setOnAction(x ->
		 * lowerCaseTextArea.setText(lowerCaseTextArea.getText().toLowerCase()));
		 * 3)--------------------------------------------------------------------
		 * lowerCaseButton.addEventFilter(ActionEvent.ACTION, new
		 * EventHandler<ActionEvent>() {
		 * 
		 * @Override public void handle(ActionEvent event) {
		 * System.out.println("Event "+ event.getEventType() +" has been generated");
		 * String text = lowerCaseTextArea.getText();
		 * lowerCaseTextArea.setText(text.toLowerCase());
		 * 
		 * } });
		 * 
		 * lowerCaseButton.addEventFilter(MouseEvent.MOUSE_ENTERED, new
		 * EventHandler<MouseEvent>() {
		 * 
		 * @Override public void handle(MouseEvent event) { System.out.println("Event "+
		 * event.getEventType() +" is coming!"); String text =
		 * lowerCaseTextArea.getText(); lowerCaseTextArea.setText(text.toUpperCase());
		 * 
		 * } });
		 */
	}

	@FXML
	private void toLowerCase(ActionEvent event) {
		System.out.println("toLowerCaseAction()");
		String text = lowerCaseTextArea.getText();
		lowerCaseTextArea.setText(text.toLowerCase());
	}

}
