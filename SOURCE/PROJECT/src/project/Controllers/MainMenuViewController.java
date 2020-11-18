package project.Controllers;

import com.sun.media.jfxmediaimpl.platform.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuViewController implements Initializable {

    //private Media me;

    /*
    String path=new File("src/project.media/test.mp3").getAbsolutePath();
    Media me = new Media(new File(path).toURI().toString());
    MediaPlayer mediaPlayer=new MediaPlayer(me);
    */

    @FXML
    private AnchorPane mainMenuAnchor;

    @FXML
    private Button exitButton;

    @FXML
    private Button playButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private ImageView imgview;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");
        //MediaPlayer.play();
    }



    /*
    *Ha a felhasználó rányom a exitButton-ra bezárodik a program
    *
    */

    @FXML
    private void exitButtonEvent(ActionEvent event){
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    public void optionsButton(ActionEvent event) {
        try {
            //Stage stage = javafx.stage.Window.getWindows();

            //stage.close();
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/optionsView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void playButton(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/playGroundView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("logtset");
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\testpic.jpg");
        imgview.setFitWidth(1000);
        imgview.setFitHeight(480);
        imgview.setPreserveRatio(false);
        Image image = new Image (file.toURI().toString());
        imgview.setImage(image);

    }
}
