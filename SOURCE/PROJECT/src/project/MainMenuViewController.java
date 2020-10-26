package project;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuViewController implements Initializable {

    //private Media me;

    /*
    String path=new File("src/media/test.mp3").getAbsolutePath();
    Media me = new Media(new File(path).toURI().toString());
    MediaPlayer mediaPlayer=new MediaPlayer(me);
    */



    @FXML
    private Button playButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");
        //MediaPlayer.play();

    }

    @FXML
    public void optionsButton(ActionEvent event) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("optionsView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

            //main.stg.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("logtset");

    }
}
