package project;

import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import project.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;
import javafx.scene.control.Slider;
import java.net.URL;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.ResourceBundle;

public class optionsViewController implements Initializable {

    @FXML
    private ChoiceBox cbResolution;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        cbResolution.setValue("1280x720");
        cbResolution.setItems(FXCollections.observableArrayList(
                "1280x720", "1920x1080 ")
        );



    }
}
