package com.project.javawordle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class HelloViewController {

    @FXML
public Label labelMain;

    @FXML
    public Button startGameButton;


    @FXML
    protected void handleStartGame() {
    try {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("game-window.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        Stage stage = new Stage();
        stage.setTitle("JavaWordle");
        stage.setScene(scene);
        stage.show();

        Stage mainStage = (Stage) startGameButton.getScene().getWindow();
        mainStage.close();

    } catch (Exception e) {
        System.out.println("Can't load new window.");
    }
}

}
