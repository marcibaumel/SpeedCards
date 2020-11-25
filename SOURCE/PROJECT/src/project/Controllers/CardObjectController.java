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

    CardObject MINTA=new CardObject();


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
    public Button rak_name;

    @FXML
    public ImageView card_Img;



    CardObject AirUnite=new CardObject(0, 3, "Air Card", "src\\project\\media\\air.jpg", "Air Unite");

    @Override
    public void start(Stage stage) throws Exception {

    }

    public void bonusHealth()
    {
        AirUnite.setHealth(5);
        System.out.println("Air units get 2 more hp");
        System.out.println(AirUnite.getHealth());
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
        viewImage.setPreserveRatio(false);
        viewImage.setFitWidth(150);
        viewImage.setFitHeight(250);
    }



    public void setMintaName(CardObject card)
    {
        MINTA.setCardName(card.getCardName());
        System.out.println(MINTA.getCardName());
    }



    int i=1;

    public void Modder(int i){
        if(i==1){
            bonusHealth();
        }
    }


    public void LabelWithout(CardObject card)
    {
        name_Label.setText(card.getCardName());
        des_Label.setText(card.getDes());
        attackPoint.setText(String.valueOf(card.getAttackPoint()));
        healthPoint.setText(String.valueOf(card.getHealth()));
        setCardStyle(card_Img, card.getImgPath());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        Modder(i);


        LabelWithout(AirUnite);


    }
}
