/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package football_management_database;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Player_View_IncomeController implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    ObservableList<Player> pList = FXCollections.observableArrayList();
    @FXML
    private TableView<Player> Player_Income_Table;
    @FXML
    private TableColumn<Player,Integer> Income;
    @FXML
    private TableColumn<Player,Integer> Bonus;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
         
        
    }    
    
}
