package project.Controllers;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.junit.Test;
import project.Model.CardObject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class CardObjectController extends Application implements Initializable {

    /*
    A normál kártyákat kezeli
     */

    CardObject MINTA=new CardObject(6, 7, "NÉV", "src\\project\\media\\card1.jpg", "String des");



    @FXML
    public Button downButton;

    @FXML
    public Label des_Label;

    @FXML
    public Label healthPoint;

    @FXML
    public Label attackPoint;

    @FXML
    public Label name_Label;

    @FXML
    public ImageView card_Img;

    //public static Label static_label;

    @Override
    public void start(Stage stage) throws Exception {

    }


    @FXML
    private void downFunction(ActionEvent event)
    {
        Stage stage = (Stage) downButton.getScene().getWindow();
        stage.close();
    }

    public void setCardStyle(ImageView viewImage, String path)
    {
        File file= new File(path);
        Image image = new Image (file.toURI().toString());
        viewImage.setImage(image);

    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //setLabels(MINTA, name_Label, des_Label, attackPoint, healthPoint, card_Img);
        LabelWithout(MINTA);


    }

    @FXML
    public void setLabels(CardObject card, Label nameLabel, Label desLabel, Label attackLabel, Label healtLabel, ImageView img){
        nameLabel.setText(card.getCardName());
        desLabel.setText(card.getDes());
        attackLabel.setText(String.valueOf(card.getAttackPoint()));
        healtLabel.setText(String.valueOf(card.getHealth()));
        setCardStyle(img, card.getImgPath());
    }

    @FXML
    public void LabelWithout(CardObject card)
    {
        name_Label.setText(card.getCardName());
        des_Label.setText(card.getDes());
        attackPoint.setText(String.valueOf(card.getAttackPoint()));
        healthPoint.setText(String.valueOf(card.getHealth()));
        setCardStyle(card_Img, card.getImgPath());
    }
}
