package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

import java.io.File;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("Views/mainMenuView.fxml"));
        primaryStage.setTitle("SpeedCards");
        primaryStage.setResizable(false);
        primaryStage.setScene(new Scene(root, 720, 480));

        primaryStage.show();


    }



    public static void main(String[] args) {
        launch(args);
    }
}
