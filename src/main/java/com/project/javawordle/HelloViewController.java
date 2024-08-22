package com.project.javawordle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class HelloViewController {

    @FXML
    private Button startGameButton;

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
