package project.Controllers;

import com.sun.media.jfxmediaimpl.platform.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class MainMenuViewController implements Initializable {




    @FXML
    private AnchorPane mainMenuAnchor;

    @FXML
    private Button exitButton;

    @FXML
    private Button optionButton;

    @FXML
    private Button playButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private ImageView imgview;

    @FXML
    private void testButton(ActionEvent event){
        System.out.println("logButton");

    }


    @FXML
    private void exitButtonEvent(ActionEvent event){
        ((Stage)(((Button)event.getSource()).getScene().getWindow())).close();
    }

    @FXML
    public void optionsButton(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/optionsView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();


        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public static int playFunction(){
        return 1;
    }

    @FXML
    public void playButton(ActionEvent event) {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/project/Views/playGroundView.fxml"));
            Parent root = (Parent) fxmlLoader.load();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.show();

        } catch(Exception e) {
            e.printStackTrace();
        }

    }

    public void setBackground()
    {
        File file= new File("src\\project\\media\\mainmenu.png");
        imgview.setFitWidth(720);
        imgview.setFitHeight(500);
        imgview.setPreserveRatio(false);
        Image image = new Image (file.toURI().toString());
        imgview.setImage(image);
    }

    public void setPlayButton(){
        /*
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\startImg.png");
        Image img=new Image(file.toURI().toString());
        ImageView view= new ImageView(img);
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        playButton.setTranslateX(0);
        playButton.setTranslateY(20);
        //Setting the size of the button
        playButton.setPrefSize(80, 80);
        // playButton.setGraphic(view);
        //playButton.setStyle("-fx-background-color: #000000");
        */

        playButton.setStyle("-fx-border-color: transparent");
        playButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");

    }

    public void setOptionButton(){
        /*
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\optionsImg.png");
        Image img=new Image(file.toURI().toString());
        ImageView view= new ImageView(img);
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        optionButton.setTranslateX(0);
        optionButton.setTranslateY(10);
        //Setting the size of the button
        optionButton.setPrefSize(80, 80);
        optionButton.setGraphic(view);
         */
        optionButton.setStyle("-fx-border-color: transparent");
        optionButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");

    }

    public void setExitButton(){
       /*
        File file= new File("D:\\WORK\\EGYETEM\\3 FÉLÉV\\Swt\\PROJEKT FELADAT\\CODE\\SpeedCard\\SOURCE\\PROJECT\\src\\project\\media\\exitImg.png");
        Image img=new Image(file.toURI().toString());
        ImageView view= new ImageView(img);
        view.setFitHeight(80);
        view.setPreserveRatio(true);
        exitButton.setTranslateX(0);
        exitButton.setTranslateY(-20);
        //Setting the size of the button
        exitButton.setPrefSize(80, 80);
        exitButton.setGraphic(view);
        */
        exitButton.setStyle("-fx-border-color: transparent");
        exitButton.setStyle("-fx-border-width: 0;-fx-background-radius: 0;\n" +
                "    -fx-background-color: transparent;");
    }




    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        System.out.println("logtset");
        setBackground();
        setPlayButton();
        setOptionButton();
        setExitButton();


    }



}
