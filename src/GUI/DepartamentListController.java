/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cadastro.Cadastro;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import static javax.management.Query.value;
import model.entities.Departament;

/**
 *
 * @author 55819
 */
public class DepartamentListController implements Initializable {
    
    @FXML
    private TableView<Departament> tableViewDepartament;
    
    @FXML
    private TableColumn<Departament, Integer> tableColumnId;
    
    @FXML
    private TableColumn<Departament, String> tableColumnName;
    
    @FXML
    private Button btNew;
    
    @FXML
    public void onBtNewAction(){
        System.out.println("onBtNewAction");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        initializeNodes();
    }

    private void initializeNodes() {
       
       tableColumnId.setCellValueFactory(new PropertyValueFactory<>("id")); //macete para inicializar as colunas da tabela
       tableColumnName.setCellValueFactory(new PropertyValueFactory<>("name")); //macete para inicializar as colunas da tabela
       
       Stage stage =(Stage) Cadastro.getMainScene().getWindow(); //macete para a tabela acompanhar o tamanho do VBOX
       tableViewDepartament.prefHeightProperty().bind(stage.heightProperty()); //macete para a tabela acompanhar o tamanho do VBOX
       
    }
    
}
