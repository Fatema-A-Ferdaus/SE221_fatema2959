/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_management_database;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Log_In_PageController implements Initializable {

    static String userID = "o001";

    @FXML
    private TextField User_Mail_Address;
    @FXML
    private PasswordField User_Password;
    @FXML
    private Label Log_In_Failed;
    @FXML
    private ImageView background;
    @FXML
    private AnchorPane login_container;
    

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//       background.fitWidthProperty().bind(login_container.widthProperty());
//       background.fitHeightProperty().bind(login_container.heightProperty());
    }    

    @FXML
    private void Owner_Button(ActionEvent event) throws IOException, SQLException {
       String logM = User_Mail_Address.getText();
       String logP = User_Password.getText();
        
       userID = logM;
       
           
        Log_In_Failed.setTextFill(Color.web("#47bcc6"));
        Parent root = FXMLLoader.load(getClass().getResource("Owner_Main_Content_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
       Log_In_Failed.setTextFill(Color.RED);

       
    }

    @FXML
    private void Manager_Button(ActionEvent event) throws IOException, SQLException {
       String logM = User_Mail_Address.getText();
       String logP = User_Password.getText();
    
       userID = logM;
       
       //Connection_To_Database dbc = new Connection_To_Database();
       
        
       
           
        Log_In_Failed.setTextFill(Color.web("#47bcc6"));
        Parent root = FXMLLoader.load(getClass().getResource("Manager_Main_Content_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
       
       Log_In_Failed.setTextFill(Color.RED);
    
    }

    @FXML
    private void Player_Button(ActionEvent event) throws IOException, SQLException {
       String logM = User_Mail_Address.getText();
       String logP = User_Password.getText();
       
       userID = logM;
       
    
        
      
           
        Log_In_Failed.setTextFill(Color.web("#47bcc6"));
        Parent root = FXMLLoader.load(getClass().getResource("Player_Main_Content_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
        
       
        System.out.print("failed");
        Log_In_Failed.setTextFill(Color.RED);
   
    
    }

    @FXML
    private void Others_Button(ActionEvent event) throws IOException, SQLException {   
       String logM = User_Mail_Address.getText();
       String logP = User_Password.getText();
       
       userID = logM;
       
           
        Log_In_Failed.setTextFill(Color.web("#47bcc6"));
        Parent root = FXMLLoader.load(getClass().getResource("Player_Main_Content_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
      
      
       Log_In_Failed.setTextFill(Color.RED);
   
    
    }

    @FXML
    private void Sign_Up(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("User_Sign_Up_Form.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    
    }
    
}
