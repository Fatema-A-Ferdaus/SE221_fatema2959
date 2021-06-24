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
public class Manager_Personal_InfoController implements Initializable {

    @FXML
    private TableColumn<Manager,String> Manager_ID;
    @FXML
    private TableColumn<Manager,String> Name;
    @FXML
    private TableColumn<Manager,Integer> Age;
    @FXML
    private TableColumn<Manager,String> Country;
    @FXML
    private TableView<Manager> Manager_Personal_Info_Table;

    
    
    ObservableList<Manager> pList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Manager_Personal_Info_Table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        pList.clear();
        
        
      
    }    
    
}