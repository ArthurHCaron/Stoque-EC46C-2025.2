/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML.java to edit this template
 */
package com.mycompany.prototipo;

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
    
    @Override
    public void start(Stage stage) throws Exception {
        //Parent root = FXMLLoader.load(getClass().getResource("login.fxml"));                
                 
        VBox vr = new VBox(20);
        vr.setStyle("-fx-padding: 50; -fx-alignment: center;");
        
        Button btnLogin = new Button("Protótipo Login (US01)");
        btnLogin.setOnAction(e -> {
            try {
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("login.fxml"))));
            } catch (Exception ex) {
            }
        });
        
        Button btnCadastroProduto = new Button("Protótipo Cadastro de Produto (US02)");
        btnCadastroProduto.setOnAction(e -> {
            try {                
                stage.setScene(new Scene (FXMLLoader.load(getClass().getResource("cadastroProduto.fxml"))));
            } catch (Exception ex) {
            }
        });

        vr.getChildren().addAll(btnLogin, btnCadastroProduto);
        
        Scene scene = new Scene(vr);
        stage.setTitle("Seleção de Protótipo");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
