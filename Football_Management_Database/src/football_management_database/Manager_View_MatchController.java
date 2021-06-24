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
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Manager_View_MatchController implements Initializable {

    @FXML
    private TextField Goal_Player_ID;
    @FXML
    private TextField Goal_No;
    @FXML
    private TextField Goal_Match_Time;
    @FXML
    private Text Error1;
    @FXML
    private TextField Card_Player_ID;
    @FXML
    private TextField Card_Match_Type;
    @FXML
    private TextField Card_Match_Time;
    @FXML
    private Text Error2;
    @FXML
    private TextField Injury_Player_ID;
    @FXML
    private TextField Injury_Match_Time;
    @FXML
    private Text Error3;
    @FXML
    private TextField Goal_Match_ID;
    @FXML
    private TextField Card_Match_ID;
    @FXML
    private TextField Injury_Match_ID;

   
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Goal_Done(ActionEvent event) throws SQLException {
        String MID = Goal_Match_ID.getText();
        String PID = Goal_Player_ID.getText();
        String GN = Goal_No.getText();
        String MT = Goal_Match_Time.getText();
        
       
    }

    @FXML
    private void Card_Done(ActionEvent event) throws SQLException {
        String MID = Card_Match_ID.getText();
        String PID = Card_Player_ID.getText();
        String CT = Card_Match_Type.getText();
        String MT = Card_Match_Time.getText();
   
    }

    @FXML
    private void Injury_Done(ActionEvent event) throws SQLException {
    
        String MID = Injury_Match_ID.getText();
        String PID = Injury_Player_ID.getText();
        String MT = Injury_Match_Time.getText();
        
    }
    
}
