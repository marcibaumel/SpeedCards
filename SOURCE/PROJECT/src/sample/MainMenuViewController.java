package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuViewController implements Initializable {

    @FXML
    private Button playButton;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("logtset");
    }
}
