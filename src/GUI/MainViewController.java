package GUI;

import GUI.util.Alertas;
import static GUI.util.Alertas.showAlert;
import cadastro.Cadastro;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.DepartamentService;

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
        loadView2("/GUI/DepartamentList.fxml");
    }
    
    @FXML
    public void onMenuItemAboutAction(){
        loadView("/GUI/About.fxml");
    }
    
    @Override
    public void initialize(URL uri, ResourceBundle rb) {
       
    }
    
    private synchronized void loadView(String absoluteName) {
      try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
        VBox newVBox = loader.load();
        Scene mainScene = Cadastro.getMainScene();
        VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
        
        Node mainMenu = mainVBox.getChildren().get(0);
        mainVBox.getChildren().clear();
        mainVBox.getChildren().add(mainMenu);
        mainVBox.getChildren().addAll(newVBox.getChildren());
      }
      catch (IOException e){
          Alertas.showAlert("IO Exception", "Error loading view", e.getMessage(),AlertType.ERROR);
      }
    }
    
    private synchronized void loadView2(String absoluteName) {
      try{
        FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
        VBox newVBox = loader.load();
        Scene mainScene = Cadastro.getMainScene();
        VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();
        
        Node mainMenu = mainVBox.getChildren().get(0);
        mainVBox.getChildren().clear();
        mainVBox.getChildren().add(mainMenu);
        mainVBox.getChildren().addAll(newVBox.getChildren());
        
        DepartamentListController controller = loader.getController();
        controller.setService(new DepartamentService());
        controller.updateTableView();
      }
      catch (IOException e){
          Alertas.showAlert("IO Exception", "Error loading view", e.getMessage(),AlertType.ERROR);
      }
    }
}
