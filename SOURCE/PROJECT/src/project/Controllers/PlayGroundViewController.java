package project.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import project.Model.CardObject;
import java.awt.image.*;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PlayGroundViewController extends Application implements Initializable {

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
    private Button card2;

    @FXML
    private Button card3;

    @FXML
    private ImageView imageview;

    @FXML
    private ProgressBar healthBar;

    @FXML
    private ProgressBar enemyHealthBar;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");
        //MediaPlayer.play();
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\testpic.jpg");
        Image image = new Image (file.toURI().toString());
        imageview.setImage(image);
    }

    /*
    @FXML
    private void imgLoad(Button button){
        //String path="/Views/testpic.jpg";

        /*
        Image img = new Image("/Views/testpic.jpg");
        ImageView view = new ImageView(img);

        //Teszt Miatt
        button.setTranslateX(200);
        button.setTranslateY(25);
        //Setting the size of the button
        button.setPrefSize(80, 80);
        //Setting a graphic to the button
        button.setGraphic(view);

        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\testpic.jpg");
        Image image = new Image (file.toURI().toString());
        ImageView view = new ImageView(image);
        view.setFitHeight(70);
        view.setPreserveRatio(true);
        card1_1Button.setGraphic(view);
    }
    */

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

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //imgLoad(card1_1Button);
        setProgressBars();
        //dealDamage(healthBar, 0.2);
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

    public void dealDamage(ProgressBar pb, double value)
    {
        double current= pb.getProgress();
        pb.setProgress(current-value);
    }

    public void setButtonStyle(Button givenButton)
    {
        givenButton.setStyle("-fx-border-color: transparent;\n" +
                "-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "-fx-background-color: transparent;");
    }

    @Override
    public void start(Stage stage) throws Exception {

    }



    @FXML
    public void openCardDes(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/cardDes.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }

    }

}
