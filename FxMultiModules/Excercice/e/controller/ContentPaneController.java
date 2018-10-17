package e.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextArea;

public class ContentPaneController implements Initializable {

	@FXML
	private TextArea normalTextArea;

	@FXML
	private TextArea reverseTextArea;

	public TextArea getNormalTextArea() {
		return normalTextArea;
	}

	public void setNormalTextArea(TextArea normalTextArea) {
		this.normalTextArea = normalTextArea;
	}

	public TextArea getReverseTextArea() {
		return reverseTextArea;
	}

	public void setReverseTextArea(TextArea reverseTextArea) {
		this.reverseTextArea = reverseTextArea;
	}

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {

	}

	public void switchTextArea() {
		String tempText = normalTextArea.getText();
		normalTextArea.setText(reverseTextArea.getText());
		reverseTextArea.setText(tempText);
	}

	public void toLowerCase() {
		normalTextArea.setText(normalTextArea.getText().toLowerCase());
		reverseTextArea.setText(reverseTextArea.getText().toLowerCase());
	}

	public void toUpperCase() {
		normalTextArea.setText(normalTextArea.getText().toUpperCase());
		reverseTextArea.setText(reverseTextArea.getText().toUpperCase());
	}

	public void clearTextArea() {
		normalTextArea.clear();
		reverseTextArea.clear();
	}

	public void reverseText(TextArea textArea, TextArea reversedTextArea) {
		StringBuilder text = new StringBuilder();
		text.append(textArea.getText());
		text.reverse();
		reversedTextArea.setText(text.toString());

	}

}
