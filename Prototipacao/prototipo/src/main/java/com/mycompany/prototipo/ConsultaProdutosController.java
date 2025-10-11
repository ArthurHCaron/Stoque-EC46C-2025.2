/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.prototipo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 * FXML Controller class
 *
 * @author arthur
 */
public class ConsultaProdutosController implements Initializable {

    @FXML
    private TableView<Produto> tbProdutos;
    @FXML
    private TableColumn<Produto, String> tbColNome;
    @FXML
    private TableColumn<Produto, String> tbColCod;
    @FXML
    private TableColumn<Produto, Float> tbColPrec;
    @FXML
    private TableColumn<Produto, Integer> tbColQtde;
    @FXML
    private TableColumn<Produto, String> tbColLoc;
    @FXML
    private Button btSair;
    
    ObservableList<Produto> lista = FXCollections.observableArrayList(
            new Produto("Arroz 5Kg", "A101", "Setor Alimentos", 22.90f, 40),
            new Produto("Detergente Neutro", "L205", "Setor Limpeza", 2.49f, 150),
            new Produto("Refrigerante Cola 2L", "B310", "Setor Bebidas", 6.99f, 80),
            new Produto("Sabonete Hidratante", "H415", "Setor Higiene", 3.75f, 200),
            new Produto("Batata Frita 500g", "S520", "Setor Snacks", 7.50f, 60)
    );

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        tbColNome.setCellValueFactory(new PropertyValueFactory<Produto, String>("nome"));
        tbColCod.setCellValueFactory(new PropertyValueFactory<Produto, String>("codigo"));
        tbColPrec.setCellValueFactory(new PropertyValueFactory<Produto, Float>("preco"));
        tbColQtde.setCellValueFactory(new PropertyValueFactory<Produto, Integer>("qtde"));
        tbColLoc.setCellValueFactory(new PropertyValueFactory<Produto, String>("localizacao"));
        
        tbProdutos.setItems(lista);
    }    

    @FXML
    private void handleActionTbSair(ActionEvent event) {
    }
    
}
