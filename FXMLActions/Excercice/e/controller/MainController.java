package e.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;

public class MainController implements Initializable {

	@FXML
	private TextArea normalTextArea;

	@FXML
	private TextArea reverseTextArea;

	@FXML
	private Button clearScreenButton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

		clearScreenButton.setOnAction(x -> {
			normalTextArea.clear();
			reverseTextArea.clear();
		});

		normalTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
				x -> MainController.reverseText(normalTextArea, reverseTextArea));

		reverseTextArea.addEventFilter(KeyEvent.KEY_RELEASED,
				x -> MainController.reverseText(reverseTextArea, normalTextArea));

	}

	private static void reverseText(TextArea textArea, TextArea reversedTextArea) {
		StringBuilder text = new StringBuilder();
		text.append(textArea.getText());
		text.reverse();
		reversedTextArea.setText(text.toString());

	}

}
