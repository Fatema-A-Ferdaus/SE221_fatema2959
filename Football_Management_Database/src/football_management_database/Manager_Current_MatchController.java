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
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author Lenovo
 */
public class Manager_Current_MatchController implements Initializable {

    @FXML
    private TableColumn<Manager,String> Goal_Match_ID;
    @FXML
    private TableColumn<Manager,String> Goal_Player_ID;
    @FXML
    private TableColumn<Manager,Integer> Goal_No;
    @FXML
    private TableColumn<Manager,String> Goal_Match_Time;
    @FXML
    private TableColumn<Manager,String> Card_Match_ID;
    @FXML
    private TableColumn<Manager,String> Card_Player_ID;
    @FXML
    private TableColumn<Manager,String> Card_Type;
    @FXML
    private TableColumn<Manager,String> Card_Match_Time;
    @FXML
    private TableColumn<Manager,String> Injury_Match_ID;
    @FXML
    private TableColumn<Manager,String> Injury_Player_ID;
    @FXML
    private TableColumn<Manager,String> Injury_Match_Time;
    @FXML
    private TableView<Manager> Manager_Goal_View_Table;
    @FXML
    private TableView<Manager> Manager_Card_View_Table;
    @FXML
    private TableView<Manager> Manager_Injury_View_Table;

    ObservableList<Manager> pList = FXCollections.observableArrayList();
    ObservableList<Manager> pList1 = FXCollections.observableArrayList();
    ObservableList<Manager> pList2 = FXCollections.observableArrayList();

    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    
         
        
    }    
    
}
