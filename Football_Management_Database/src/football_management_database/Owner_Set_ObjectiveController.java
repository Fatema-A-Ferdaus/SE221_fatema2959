/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_management_database;

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
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Owner_Set_ObjectiveController implements Initializable {

    @FXML
    private TextField Owner_ID;
    @FXML
    private TextArea Objectives;
    @FXML
    private TextField Manager_ID;
    @FXML
    private Label Submission_Failed_Text;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
      Owner_ID.setText("Your ID is "+Log_In_PageController.userID);
    }    

    @FXML
    private void Done(ActionEvent event) throws SQLException {
       String OID = Log_In_PageController.userID;
       String MID = Manager_ID.getText();
       String OBJ = Objectives.getText();
          
    }
    
}
