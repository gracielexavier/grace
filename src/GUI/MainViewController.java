package GUI;

import static GUI.util.Alertas.showAlert;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.VBox;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 55819
 */
public class MainViewController implements Initializable{
    
    @FXML
    private MenuItem menuItemSeller;
    
    @FXML
    private MenuItem menuItemDepartament;
    
    @FXML
    private MenuItem menuItemAbout;
    
    @FXML
    public void onMenuItemSellerAction(){
        System.out.println("oksel");
    }
    
    @FXML
    public void onMenuItemDepartamentAction(){
        System.out.println("okdep");
    }
    
    @FXML
    public void onMenuItemAboutAction(){
        System.out.println("okhelp");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }
    
    private void loadView(String absoluteName) {
      try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
        VBox newVBox = loader.load();
      }
      catch (IOException e){
          showAlert("IO Exception", "Error loading view", e.getMessage(),AlertType.ERROR);
      }
    }
}
