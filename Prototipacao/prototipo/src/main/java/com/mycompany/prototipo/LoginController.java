/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.prototipo;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author joaop
 */
public class LoginController implements Initializable {

    @FXML
    private TextField cxUsuario;
    @FXML
    private PasswordField cxSenha;
    @FXML
    private Button btEntrar;
    @FXML
    private Button btCadastrar;

    
    private Scene cadastro;
    private static Stage cadastroStage;
    
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void handleLogin(ActionEvent event) {
        limparCaixas();
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("Login");
        alert.setHeaderText(null);
        alert.setContentText("Login efetuado!");
        alert.showAndWait();
    }

    @FXML
    private void handleCadastro(ActionEvent event) throws IOException {
        if(cadastro==null) cadastro = new Scene(FXMLLoader.load(getClass().getResource("cadastroUsuario.fxml")));
        
        if(cadastroStage==null){
            cadastroStage = new Stage();
            cadastroStage.setScene(cadastro);
            cadastroStage.centerOnScreen();
            cadastroStage.setResizable(false);
        }
        Main.hideLogin();
        cadastroStage.sizeToScene();
        cadastroStage.setIconified(false);
        cadastroStage.requestFocus();
        cadastroStage.toFront();
        cadastroStage.show();
    }
    
    private void limparCaixas(){
        cxUsuario.clear();
        cxSenha.clear();        
    }
    
    public static void hideCadastroUsuario(){
        cadastroStage.close();
    }
}
