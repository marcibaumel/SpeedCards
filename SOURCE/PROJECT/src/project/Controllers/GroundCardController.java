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
import project.Model.CardObject;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class GroundCardController extends Application implements Initializable {

    @FXML
    private Button downButton;

    @FXML
    private Label name_Label;

    @FXML
    private Label des_Label;

    @FXML
    private Label attackPoint;

    @FXML
    private Label healthPoint;

    @FXML
    private ImageView card_Img;

    CardObject groundUnite=new CardObject(3, 2, "Solider Card", "src\\project\\media\\gb.jpg", "Solider Ground Unite");

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

        LabelWithout (groundUnite);
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

    public void LabelWithout(CardObject card)
    {
        name_Label.setText(card.getCardName());
        des_Label.setText(card.getDes());
        attackPoint.setText(String.valueOf(card.getAttackPoint()));
        healthPoint.setText(String.valueOf(card.getHealth()));
        setCardStyle(card_Img, card.getImgPath());
    }
}
