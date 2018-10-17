package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage stage) throws Exception {
		Parent parent = (Parent) FXMLLoader.load(getClass().getResource("/view/NewPane.fxml"));
		Scene scene = new Scene (parent);
		stage.setScene(scene);
		stage.setTitle("Inicjalizator");
		stage.show();
	}

}