/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import cadastro.Cadastro;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import model.entities.Departament;
import model.services.DepartamentService;

/**
 *
 * @author 55819
 */
public class DepartamentListController implements Initializable {
    
    private DepartamentService service;
    
    private ObservableList<Departament> obsList;

    public void setService(DepartamentService service) {
        this.service = service;
    }
    
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
    
    public void updateTableView(){
        if(service == null){
            throw new IllegalStateException("Serviço nulo");
        }
        
        List<Departament> list = service.findAll();
        obsList = FXCollections.observableArrayList(list);
        tableViewDepartament.setItems(obsList);
    }

    void setDepartamentService(DepartamentService departamentService) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
