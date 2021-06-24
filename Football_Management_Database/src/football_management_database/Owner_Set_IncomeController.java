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
public class Owner_Set_IncomeController implements Initializable {

    @FXML
    private TextField Manager_Income;
    @FXML
    private TextField Manager_Bonus;
    @FXML
    private Text Error1;
    @FXML
    private TextField Player_ID;
    @FXML
    private TextField Player_Income;
    @FXML
    private TextField Player_Bonus;
    @FXML
    private Text Error2;
    @FXML
    private TextField Manager_ID;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void Done1(ActionEvent event) throws SQLException {
        String OID = Log_In_PageController.userID;
       
    }
    
}
