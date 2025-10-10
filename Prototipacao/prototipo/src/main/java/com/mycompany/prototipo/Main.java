/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package com.mycompany.prototipo;

import java.io.IOException;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author joaop
 */
public class Main extends Application {
    private Scene login;
    private Scene cadastroP;
    private static Stage loginStage;
    private static Stage cadastroPStage;
    
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));                
                 
        VBox vr = new VBox(20);
        vr.setStyle("-fx-padding: 50; -fx-alignment: center;");
        
        Button btnLogin = new Button("Protótipo Login (US01)");
        btnLogin.setOnAction(e -> {
            try {                
                if(login==null) login = new Scene(FXMLLoader.load(getClass().getResource("login.fxml")));
                
                if(loginStage==null){ 
                    loginStage = new Stage();
                    loginStage.setScene(login);
                    loginStage.centerOnScreen();
                }
                loginStage.setIconified(false);
                loginStage.requestFocus();
                loginStage.toFront();                
                loginStage.show();                
                
            } catch (IOException ex) {}
        });
        
        Button btnCadastroProduto = new Button("Protótipo Cadastro de Produto (US02)");
        btnCadastroProduto.setOnAction(e -> {
            try {                
                if(cadastroP==null) cadastroP = new Scene(FXMLLoader.load(getClass().getResource("cadastroProduto.fxml")));
                
                if(cadastroPStage==null){
                    cadastroPStage = new Stage();
                    cadastroPStage.setScene(cadastroP);
                    cadastroPStage.centerOnScreen();
                }
                cadastroPStage.setIconified(false);
                cadastroPStage.requestFocus();
                cadastroPStage.toFront();
                cadastroPStage.show();
                
            } catch (IOException ex) {}
        });

        vr.getChildren().addAll(btnLogin, btnCadastroProduto);
        
        Scene scene = new Scene(vr);
        stage.setTitle("Seleção de Protótipo");
        stage.setScene(scene);       
        stage.show();
    }
    
    public static void hideLogin(){
        loginStage.hide();
    }
    public static void showLogin(){
        loginStage.setIconified(false);
        loginStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
