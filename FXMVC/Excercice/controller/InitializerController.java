package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class InitializerController implements Initializable {

	@FXML
	private VBox VBoxPane;

	@FXML
	private Label firstLabel;

	@FXML
	private Button firstButton;

	@FXML
	private Label secondLabel;

	@FXML
	private Button secondButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		firstLabel.setText("Etykieta 1");
		firstButton.setText("Przycisk 1");
		secondLabel.setText("Etykieta 2");
		secondButton.setText("Przycisk 2");

	}

}