package project.Controllers;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.transform.Translate;
import project.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Scene;

import javax.swing.event.ChangeEvent;
import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;
import java.net.URL;
import java.util.ResourceBundle;

public class OptionsViewController implements Initializable {

    String test;


    @FXML
    private ChoiceBox cbResolution;

    @FXML
    private Slider volumeSlider;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        String res;

        cbResolution.setItems(FXCollections.observableArrayList(
                "1280x720","1920x1080"
                ));
        res="1280x720";
        cbResolution.setValue(res);
        System.out.println(cbResolution.getItems());
        cbResolution.setTooltip(new Tooltip("Select the resolution"));

            cbResolution.getSelectionModel().selectedIndexProperty().addListener(new ChangeListener<Number>() {
                @Override
                public void changed(ObservableValue ov, Number value, Number new_value) {
                    cbResolution.setValue(new_value);
                    System.out.println(new_value);
                    System.out.println("You play in HD");
                }
                });
            showVolumeNumber();
    }

    public void showVolumeNumber()
    {

        double newNumber;
        Translate translate = new Translate();

        volumeSlider.valueProperty().addListener(new ChangeListener<Number>() {
            public void changed(ObservableValue <?extends Number>observable, Number oldValue, Number newValue){
                //translate.setX((double) newValue);
                //translate.setY(50);
                //translate.setZ(100);

                changeVolume(newValue);

            }


        });

        //System.out.println(volumeSlider.getValue());
    }
    public void changeVolume(Number newValue){

        volumeSlider.setValue(newValue.doubleValue());
        System.out.println(newValue);
        //return (int)newValue;
    }


}
