/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.prototipo;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class CadastroProdutoController implements Initializable {

    @FXML
    private TextField cxNome;
    @FXML
    private TextField cxCodigo;
    @FXML
    private TextField cxQuantidade;
    @FXML
    private TextField cxLocalizacao;
    @FXML
    private Button btSalvar;
    @FXML
    private Button btCancelar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleSalvar(ActionEvent event) {
        limparCaixas();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Sucesso");
        alert.setHeaderText(null);
        alert.setContentText("Produto cadastrado!");
        alert.showAndWait();  
    }

    @FXML
    private void handleCancelar(ActionEvent event) {
        limparCaixas();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cancelado");
        alert.setHeaderText(null);
        alert.setContentText("Operação cancelada.");
        alert.showAndWait();
    }
    
    private void limparCaixas(){
        cxNome.clear();
        cxCodigo.clear();
        cxQuantidade.clear();
        cxLocalizacao.clear();
    }
    
}
