package GUI;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.MenuItem;

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
}
