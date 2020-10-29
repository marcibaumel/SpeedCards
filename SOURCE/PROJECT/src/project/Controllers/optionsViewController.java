package project.Controllers;

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
import javax.swing.event.ChangeListener;
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


        String resolution[] = { "1280x720","1920x1080" };

        ChoiceBox cbResolution (FXCollections.observableArrayList(resolution));






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
