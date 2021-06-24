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
public class Player_Personal_InfoController implements Initializable {

    @FXML
    private TableColumn<Player,String> Player_ID;
    @FXML
    private TableColumn<Player,String> Name;
    @FXML
    private TableColumn<Player,Integer> Age;
    @FXML
    private TableColumn<Player,String> Country;
    @FXML
    private TableColumn<Player,String> Position;
    @FXML
    private TableView<Player> Player_Info_Table;

   
    ObservableList<Player> pList = FXCollections.observableArrayList();

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Player_Info_Table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        pList.clear();
        
       
      
    }    
    
}
