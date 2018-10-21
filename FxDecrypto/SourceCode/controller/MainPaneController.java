package controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainPaneController implements Initializable{

    @FXML
    private TextArea editableTextArea;

    @FXML
    private Label editableTextAreaLabel;

    @FXML
    private TextField keyExprecion;

    @FXML
    private Label resultTextAreaLabel;

    @FXML
    private CheckBox encryptCheckBox;

    @FXML
    private CheckBox decryptCheckBox;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}

}
