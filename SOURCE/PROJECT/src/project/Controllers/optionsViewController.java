package project.Controllers;

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
        cbResolution.setItems(FXCollections.observableArrayList(
                "1280x720", "1920x1080 ")
        );
        //cbResolution.setValue("1280x720");
        cbResolution.setValue(resolutionSetting(cbResolution));

    }

    public Object resolutionSetting(ChoiceBox cb){

        Object to= cb.getSelectionModel().getSelectedItem();

        String value = (String) cb.getValue();
        System.out.println(value);

        System.out.println(to);
        return to;

    }
}
