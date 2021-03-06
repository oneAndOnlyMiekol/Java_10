package pl.javastart.mp3player.controller;

import java.io.File;
import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.Slider;
import javafx.scene.control.TableView;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.DirectoryChooser;
import javafx.stage.FileChooser;
import javafx.stage.FileChooser.ExtensionFilter;
import javafx.stage.Stage;
import pl.javastart.mp3player.mp3.Mp3Parser;
import pl.javastart.mp3player.mp3.Mp3Player;
import pl.javastart.mp3player.mp3.Mp3Song;

public class MainController implements Initializable {

	@FXML
	private ContentPaneController contentPaneController;
	@FXML
	private ControlPaneController controlPaneController;
	@FXML
	private MenuPaneController menuPaneController;

	private Mp3Player mp3Player;
	private Mp3Parser mp3Parser;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		mp3Player = new Mp3Player();
		mp3Parser = new Mp3Parser();
		configControlPaneAction();
		configureVolume();
		configureTable();
		configureMenu();
	}

	private void configureMenu() {
		MenuItem openFile = menuPaneController.getFileMenuItem();
		MenuItem openDir = menuPaneController.getDirMenuItem();

		openFile.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				FileChooser fileChooser = new FileChooser();
				fileChooser.getExtensionFilters().add(new ExtensionFilter("Mp3", "*.mp3"));
				File file = fileChooser.showOpenDialog(new Stage());
				mp3Player.getMp3Collection().clear();
				mp3Player.getMp3Collection().addSong(mp3Parser.createMp3Song(file));

			}
		});

		openDir.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				DirectoryChooser directoryChooser = new DirectoryChooser();
				File dir = directoryChooser.showDialog(new Stage());
				mp3Player.getMp3Collection().clear();
				mp3Player.getMp3Collection().addSongs(mp3Parser.createMp3Songs(dir));

			}
		});
	}

	private void configureTable() {
		TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
		contentTable.setItems(mp3Player.getMp3Collection().getSongList());
		contentTable.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent event) {
				if (event.getClickCount() == 2) {
					mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
					configureProgressBar();
					controlPaneController.getPlayButton().setSelected(true);
				}
			}
		});

	}

	void configureProgressBar() {
		Slider songSlider = controlPaneController.getSongSlider();
		mp3Player.getMediaPlayer().setOnReady(new Runnable() {

			@Override
			public void run() {
				songSlider.setMax(mp3Player.getLoadedSongLength());

			}
		});
		mp3Player.getMediaPlayer().currentTimeProperty().addListener(new ChangeListener<Duration>() {

			@Override
			public void changed(ObservableValue<? extends Duration> observable, Duration oldValue, Duration newValue) {
				songSlider.setValue(newValue.toSeconds());
			}
		});
		songSlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				if (songSlider.isValueChanging()) {
					mp3Player.getMediaPlayer().seek(Duration.seconds(newValue.doubleValue()));
				}
			}
		});

	}

	private void configureVolume() {
		Slider volSlider = controlPaneController.getVolumeSlider();
		final double minVolumne = 0;
		final double maxVolumne = 1;
		volSlider.setMin(minVolumne);
		volSlider.setMax(maxVolumne);
		volSlider.setValue(maxVolumne);
		volSlider.valueProperty().addListener(new ChangeListener<Number>() {

			@Override
			public void changed(ObservableValue<? extends Number> obsevrable, Number oldValue, Number newValue) {
				mp3Player.setVolume(newValue.doubleValue());

			}
		});

	}

	private void configControlPaneAction() {
		TableView<Mp3Song> contentTable = contentPaneController.getContentTable();
		ToggleButton playButton = controlPaneController.getPlayButton();
		Button prevButton = controlPaneController.getPrevButton();
		Button nextButton = controlPaneController.getNextButton();

		playButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (playButton.isSelected()) {
					mp3Player.play();
				} else {
					mp3Player.stop();
				}

			}
		});

		nextButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() + 1);
				mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
				configureProgressBar();

			}
		});

		prevButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				contentTable.getSelectionModel().select(contentTable.getSelectionModel().getSelectedIndex() - 1);
				mp3Player.loadSong(contentTable.getSelectionModel().getSelectedIndex());
				configureProgressBar();
			}
		});
	}
}