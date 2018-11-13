package app;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

public class MainController implements Initializable {
	@FXML
	private MediaView mediaView;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		Media media = new Media("file:///C:/Users/Miekol/Desktop/oow2010-2.flv");
		MediaPlayer player = new MediaPlayer(media);
		player.setAutoPlay(true);
		mediaView.setMediaPlayer(player);
	}
}
