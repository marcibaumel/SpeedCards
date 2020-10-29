package project.Controllers;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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

import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.ResourceBundle;

public class optionsViewController implements Initializable {

    String test;


    @FXML
    private ChoiceBox cbResolution;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        //String resolution[] = { "1280x720","1920x1080" };


        cbResolution.setItems(FXCollections.observableArrayList(
                "1280x720","1920x1080"
                ));

        System.out.println(cbResolution.getItems());

        cbResolution.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {

            @Override

            public void changed(ObservableValue ov, Number value, Number new_value) {
                cbResolution.setValue(new_value);
                System.out.println(new_value);
            }
        });



    }


/*
    public void setElem(ChoiceBox cb)
    {
        String value;
        //System.out.println(cb.getItems());

        if(cb.getValue()!="1280x720"){
            value = (String) cb.getValue();
        }
        else
        {
            value= "1280x720";
        }
        System.out.println(value);
        cb.setValue(value);

    }

 */
}
