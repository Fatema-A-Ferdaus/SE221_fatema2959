/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_management_database;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Player_Main_Content_PageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    MediaPlayer mediaPlayer;
    @FXML
    private VBox Player_Middle_Content;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
String path = "F:\\PrettyGirl.mp3";  
          
        //Instantiating Media class  
//        Media media = new Media(new File(path).toURI().toString());  
//          
//        //Instantiating MediaPlayer class   
//        mediaPlayer = new MediaPlayer(media);  
//          
//        //by setting this property to true, the audio will be played   
//        mediaPlayer.setAutoPlay(true);  
//       
//        
// TODO
    }    

    @FXML
    private void Log_Out(ActionEvent event) throws IOException {
      //  mediaPlayer.stop();
        Parent root = FXMLLoader.load(getClass().getResource("Log_In_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void Personal_Info(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Player_Personal_Info.fxml")); 
        Player_Middle_Content.getChildren().setAll(root);
    }

    @FXML
    private void View_Income(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Player_View_Income.fxml")); 
        Player_Middle_Content.getChildren().setAll(root);
    }

    @FXML
    private void Goals(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Player_View_Goals.fxml")); 
        Player_Middle_Content.getChildren().setAll(root);
    }
    
}
