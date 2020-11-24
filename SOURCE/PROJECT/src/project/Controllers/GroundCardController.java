package project.Controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import project.Model.CardObject;

import java.net.URL;
import java.util.ResourceBundle;

public class GroundCardController extends Application implements Initializable {

    @FXML
    private Button downButton;

    @FXML
    private Label name_Label;

    CardObject cb=new CardObject(6, 7, "GroundCheck", "src\\project\\media\\card1.jpg", "String des");

    @FXML
    private void downFunction(ActionEvent event)
    {
        Stage stage = (Stage) downButton.getScene().getWindow();
        stage.close();
    }

    @Override
    public void start(Stage stage) throws Exception {

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        LabelWithout (cb);
    }

    public void LabelWithout(CardObject card)
    {
        name_Label.setText(card.getCardName());
        //des_Label.setText(card.getDes());
        //attackPoint.setText(String.valueOf(card.getAttackPoint()));
        //healthPoint.setText(String.valueOf(card.getHealth()));
        //setCardStyle(card_Img, card.getImgPath());
    }
}
