package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class playGroundViewController extends Application implements Initializable {

    @FXML
    private Button card1_1Button;



    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");
        //MediaPlayer.play();
    }

    @FXML
    private void imgLoad(){
        String path="Views/testpic.jpg";
        Image img = new Image(path);
        ImageView view = new ImageView(img);
        card1_1Button.setGraphic(view);
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    //imgLoad();

    }

    @Override
    public void start(Stage stage) throws Exception {
        String path="Views/testpic.jpg";
        Image img = new Image(path);
        ImageView view = new ImageView(img);
        card1_1Button.setGraphic(view);
    }
}
