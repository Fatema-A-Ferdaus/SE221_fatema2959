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
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 *
 * @author Lenovo
 */
public class Default_PageController implements Initializable {
    
    @FXML
    private AnchorPane Default_Content;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try {
            
            Parent root = FXMLLoader.load(getClass().getResource("Log_In_Page.fxml"));
            Default_Content.getChildren().setAll(root);
        
        }
        catch (IOException ex) {
            Logger.getLogger(Default_PageController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }    
    
}
