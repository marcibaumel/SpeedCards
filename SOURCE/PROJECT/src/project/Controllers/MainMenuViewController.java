package project.Controllers;


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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.File;
import java.io.InputStream;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.stage.Stage;
import project.SoundManager;

public class MainMenuViewController implements Initializable {


    SoundManager musicObject=new SoundManager();


    @FXML
    private AnchorPane mainMenuAnchor;

    @FXML
    private Button exitButton;

    @FXML
    private Button optionButton;

    @FXML
    private Button playButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private ImageView imgview;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");

    }


    @FXML
    private void exitButtonEvent(ActionEvent event){
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    public void optionsButton(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/optionsView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static int playFunction(){
        return 1;
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

    public void setBackground()
    {
        File file= new File("src\\project\\media\\mainmenu.png");
        imgview.setFitWidth(720);
        imgview.setFitHeight(500);
        imgview.setPreserveRatio(false);
        Image image = new Image (file.toURI().toString());
        imgview.setImage(image);
    }

    public void setPlayButton(){

        playButton.setStyle("-fx-border-color: transparent");
        playButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");

    }

    public void setOptionButton(){

        optionButton.setStyle("-fx-border-color: transparent");
        optionButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");

    }

    public void setExitButton(){

        exitButton.setStyle("-fx-border-color: transparent");
        exitButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("logtset");
        setBackground();
        setPlayButton();
        setOptionButton();
        setExitButton();
        musicObject.playMusic("src\\project\\Controllers\\test2.wav");

    }



}
