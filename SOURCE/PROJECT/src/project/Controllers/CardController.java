package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.application.Application;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CardController extends Application implements Initializable {

    /*
    A metódussal rendelkező kártyákat kezeli
     */

    @FXML
    private Button card1;

    @FXML
    private Button downButton;

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

    @FXML
    private void downFunction(ActionEvent event)
    {
        Stage stage = (Stage) downButton.getScene().getWindow();
        stage.close();
    }
}
