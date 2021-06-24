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
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class User_Sign_Up_FormController implements Initializable {

    @FXML
    private TextField User_Mail_Address;
    @FXML
    private TextField User_Name;
    @FXML
    private PasswordField Password;
    @FXML
    private PasswordField Confirm_Password;
    @FXML
    private Label Sign_Up_Failed;
    MediaPlayer mediaPlayer;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }    

    @FXML
    private void Submission(ActionEvent event) throws SQLException {
       
          
}

    @FXML
    private void Reset(ActionEvent event) {
        
        User_Mail_Address.clear();  
        User_Name.clear(); 
        Password.clear();
        Confirm_Password.clear();
        Sign_Up_Failed.setTextFill(Color.web("#ffffff"));
    }

    @FXML
    private void Back_To_Log_In(ActionEvent event) throws IOException {
        
        Parent root = FXMLLoader.load(getClass().getResource("Log_In_Page.fxml")); 
        Scene scene = new Scene(root);
        Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        stage.setScene(scene);
        stage.show();
    }
    
}
