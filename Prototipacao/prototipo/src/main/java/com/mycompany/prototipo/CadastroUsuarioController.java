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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class CadastroUsuarioController implements Initializable {

    @FXML
    private Button btVoltar;
    @FXML
    private Button btCadastrar;
    @FXML
    private TextField cxUsuario;
    @FXML
    private PasswordField cxSenha;
    @FXML
    private PasswordField cxComfSenha;
    @FXML
    private TextField cxEmail;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleVoltar(ActionEvent event) {
        LoginController.hideCadastroUsuario();
        Main.showLogin();
    }

    @FXML
    private void handleCadastrar(ActionEvent event) {
        limparCaixas();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Cadastro");
        alert.setHeaderText(null);
        alert.setContentText("Usuário cadastrado!");
        alert.showAndWait();
    }
    
    private void limparCaixas(){
        cxUsuario.clear();
        cxEmail.clear();
        cxSenha.clear();
        cxComfSenha.clear();
    }
}
