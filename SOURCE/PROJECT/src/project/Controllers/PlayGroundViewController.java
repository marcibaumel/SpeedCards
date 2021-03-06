package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import project.ClipManager;
import project.Model.AffectCard;
import project.Model.CardObject;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.Timer;
import java.util.TimerTask;


public class PlayGroundViewController implements Initializable {

    @FXML
    private Button ground1;

    @FXML
    private Button ground2;

    @FXML
    private Button ground3;

    @FXML
    private Button E_ground1;

    @FXML
    private Button E_ground2;

    @FXML
    private Button E_ground3;

    @FXML
    private Button air1;

    @FXML
    private Button air2;

    @FXML
    private Button air3;

    @FXML
    private Button air4;

    @FXML
    private Button E_air1;

    @FXML
    private Button E_air2;

    @FXML
    private Button E_air3;

    @FXML
    private Button card1;

    @FXML
    public Button card2;

    @FXML
    private Button card3;

    @FXML
    private Button exit_Button;

    @FXML
    private Button end_Button;

    @FXML
    private Label won_Label;

    @FXML
    private ImageView imageview;

    @FXML
    private ProgressBar healthBar;

    @FXML
    private ProgressBar enemyHealthBar;

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
    public AnchorPane cardDes_Pane;

    @FXML
    public ImageView card_Img;

    @FXML
    public AnchorPane cardObject_Pane;

    @FXML
    public Label objectDes_Label;

    @FXML
    public Label objectName_Label;

    @FXML
    public Button objectDownButton;

    @FXML
    public Button play_Button;

    @FXML
    public Label crystal_Label;

    @FXML
    public ImageView objectCard_Img;

    @FXML
    public AnchorPane cardObject_Pane2;

    @FXML
    public Label objectDes_Label2;

    @FXML
    public Label objectName_Label2;

    @FXML
    public Button objectDownButton2;

    @FXML
    public Button play_Button2;

    @FXML
    public Label crystal_Label2;

    @FXML
    public ImageView objectCard_Img2;

    @FXML
    public AnchorPane cardObject_Pane3;

    @FXML
    public Label objectDes_Label3;

    @FXML
    public Label objectName_Label3;

    @FXML
    public Button objectDownButton3;

    @FXML
    public Button play_Button3;

    @FXML
    public Label crystal_Label3;

    @FXML
    public ImageView objectCard_Img3;



    CardObject groundObject1=new CardObject(10,15,"Pista","src\\project\\media\\gb.jpg", "Solider Ground Unite");
    CardObject airCard=new CardObject(0, 3, "Air Card", "src\\project\\media\\air.jpg", "Air Unite");
    AffectCard ac1=new AffectCard("Give +1 dmg for ground unite", 1, 0, 75, "Booster", "src\\project\\media\\card2.jpg");
    AffectCard ac2=new AffectCard("Give +3 dmg for ground unite", 3, 0, 10, "Booster", "src\\project\\media\\card1.jpg");
    ClipManager clipManager=new ClipManager();

    public void playThat(int bonus, Button button) {
        int base=this.groundObject1.getAttackPoint();
        this.groundObject1.setAttackPoint(bonus+base);
        button.setVisible(false);
        cardObject_Pane.setVisible(false);
        cardObject_Pane2.setVisible(false);
        cardObject_Pane3.setVisible(false);
        System.out.println(bonus);
        System.out.println(groundObject1.getAttackPoint());
    }

    @FXML
    public void play2(ActionEvent event){
        System.out.println(ac2.getModderAttack());
        playThat(1, card2);

    }

    @FXML
    public void play(ActionEvent event){
        playThat(3,card1);

    }

    @FXML
    public void play3(ActionEvent event){
        playThat(3,card3);
    }


    private void setCardStyle(Button button, String path)
    {
        File file= new File(path);
        Image image = new Image (file.toURI().toString());
        ImageView view = new ImageView(image);
        view.setFitHeight(70);
        view.setFitWidth(50);
        //view.setPreserveRatio(true);
        button.setGraphic(view);
    }

    private void setButtons(){
        setButtonStyle(air1);
        setButtonStyle(air2);
        setButtonStyle(air3);
        setButtonStyle(air4);
        setButtonStyle(E_air1);
        setButtonStyle(E_air2);
        setButtonStyle(E_air3);
        setButtonStyle(E_ground1);
        setButtonStyle(E_ground2);
        setButtonStyle(E_ground3);
        setButtonStyle(ground1);
        setButtonStyle(ground2);
        setButtonStyle(ground3);
        setCardStyle(card1,"src\\project\\media\\card1.jpg");
        setCardStyle(card3,"src\\project\\media\\card1.jpg");
        setCardStyle(card2,"src\\project\\media\\card2.jpg");
    }



    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //imgLoad(card1_1Button);
        //dealDamage(healthBar, 0.2);

        exit_Button.setVisible(false);
        won_Label.setVisible(false);
        setButtons();
        setProgressBars();
        cardDes_Pane.setVisible(false);
        cardObject_Pane.setVisible(false);
        cardObject_Pane2.setVisible(false);
        cardObject_Pane3.setVisible(false);

    }

    public void LabelWithout(CardObject card)
    {
        name_Label.setText(card.getCardName());
        des_Label.setText(card.getDes());
        attackPoint.setText(String.valueOf(card.getAttackPoint()));
        healthPoint.setText(String.valueOf(card.getHealth()));
        setCardStyle(card_Img, card.getImgPath());
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


    @FXML
    public void openCardGround1(ActionEvent event) {
        LabelWithout(groundObject1);
        cardDes_Pane.setVisible(true);
    }

    @FXML
    public void putDownCard(ActionEvent event)
    {
        cardDes_Pane.setVisible(false);
        cardObject_Pane.setVisible(false);
        cardObject_Pane2.setVisible(false);
        cardObject_Pane3.setVisible(false);

    }

    public void setProgressBars()
    {
        healthBar.setStyle("-fx-accent: red;");
        enemyHealthBar.setStyle("-fx-accent: red; ");
        healthBar.setProgress(1);
        enemyHealthBar.setProgress(1);
        System.out.println("Player HP: "+healthBar.getProgress());
        System.out.println("Enemy HP: "+enemyHealthBar.getProgress());
    }

    public void setButtonStyle(Button givenButton)
    {
        givenButton.setStyle("-fx-border-color: transparent;\n" +
                "-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "-fx-background-color: transparent;");
    }

    @FXML
    public void endGame(ActionEvent event)
    {
        if(counter()<50)
        {
            won_Label.setText("You lost");
        }
        won_Label.setVisible(true);
        exit_Button.setVisible(true);
    }

    public int counter()
    {
        int count=(groundObject1.getAttackPoint()*4);
        System.out.println(count);
        return count;
    }

    @FXML
    public void exitGame(ActionEvent event)
    {
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }


    @FXML
    public void openCardDes(ActionEvent event) {
        LabelWithout(airCard);
        cardDes_Pane.setVisible(true);
    }


    @FXML
    public void openCardObject(ActionEvent event) {
            LabelWithoutObject(ac1);
            cardObject_Pane.setVisible(true);
    }


    public void LabelWithoutObject(AffectCard card)
    {
        objectName_Label.setText(card.getName());
        objectDes_Label.setText(card.getDescription());
        crystal_Label.setText(String.valueOf(card.getPrice()));
        setCardStyle(objectCard_Img, card.getImgPath());
    }

    public void LabelWithoutObject2(AffectCard card)
    {
        objectName_Label2.setText(card.getName());
        objectDes_Label2.setText(card.getDescription());
        crystal_Label2.setText(String.valueOf(card.getPrice()));
        setCardStyle(objectCard_Img2, card.getImgPath());
    }

    @FXML
    public void openCardObject2(ActionEvent event) {

        LabelWithoutObject2(ac2);
        cardObject_Pane2.setVisible(true);

    }

    public void LabelWithoutObject3(AffectCard card)
    {
        objectName_Label3.setText(card.getName());
        objectDes_Label3.setText(card.getDescription());
        crystal_Label3.setText(String.valueOf(card.getPrice()));
        setCardStyle(objectCard_Img3, card.getImgPath());
    }


    @FXML
    public void openCardObject3(ActionEvent event) {

        LabelWithoutObject3(ac2);
        cardObject_Pane3.setVisible(true);

    }



}
