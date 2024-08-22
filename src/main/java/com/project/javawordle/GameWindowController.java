package com.project.javawordle;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import java.util.Random;

public class GameWindowController {

    @FXML
    private TextField guessInput;

    @FXML
    private Label welcomeText;

    @FXML
    private Label box00, box01, box02, box03, box04,
            box10, box11, box12, box13, box14,
            box20, box21, box22, box23, box24,
            box30, box31, box32, box33, box34,
            box40, box41, box42, box43, box44;

    @FXML
    private Label[][] gameBoard = new Label[5][5];

    private int currentRow = 0;

    private final String[] words = {"bunny", "renew", "trash", "melon", "ocean", "smart", "earth", "water", "games", "zebra", "spoon", "plant", "salad"};

    Random random = new Random();

    @FXML
    private Button tryAgainButton = new Button();

    @FXML
    private Button checkGuessBtn = new Button();

    private String word = words[random.nextInt(words.length)];

    @FXML
    protected void initialize() {
        welcomeText.setText("Welcome to JavaWordle!");
        gameBoard[0] = new Label[]{box00, box01, box02, box03, box04};
        gameBoard[1] = new Label[]{box10, box11, box12, box13, box14};
        gameBoard[2] = new Label[]{box20, box21, box22, box23, box24};
        gameBoard[3] = new Label[]{box30, box31, box32, box33, box34};
        gameBoard[4] = new Label[]{box40, box41, box42, box43, box44};
    }

    @FXML
    protected void checkGuess() {
        welcomeText.setText("Waiting for your input...");
        if (currentRow < 5) {
            String guess = guessInput.getText();

            if (guess.isEmpty()) {
                welcomeText.setText("Please input at least 1 letter.");
            } else {
            for (int i = 0; i < Math.min(guess.length(), 5); i++) {
                String letter = guess.substring(i, i + 1);
                gameBoard[currentRow][i].setText(letter);

                if (!guess.equals(word)) {
                    if (letter.equals(word.substring(i, i + 1))) {
                        gameBoard[currentRow][i].setStyle("-fx-background-color: #7cb870");
                    } else if (word.contains(letter)) {
                        gameBoard[currentRow][i].setStyle("-fx-background-color: #e8ab6d");
                    }
                    else {
                        gameBoard[currentRow][i].setStyle("-fx-background-color: white");
                    }

                    if (currentRow == 4) {
                        welcomeText.setText("Game over!\nThe correct word was: " + word);
                        guessInput.setDisable(true);
                        checkGuessBtn.setDisable(true);
                    }
                } else {
                    welcomeText.setText("Congrats! You guessed the right word!");
                    guessInput.setDisable(true);
                    checkGuessBtn.setDisable(true);
                    gameBoard[currentRow][i].setStyle("-fx-background-color: #7cb870");
            }}
            guessInput.setText("");
            currentRow++;
        }}}

    @FXML
    protected void tryAgain() {
        currentRow = 0;
        for (Label[] labels : gameBoard) {
            for (Label label : labels) {
                label.setText(" ");
                label.setStyle("-fx-background-color: white");
                guessInput.setDisable(false);
                checkGuessBtn.setDisable(false);
                welcomeText.setText("Let's play another round of JavaWordle!");
                guessInput.setText("");
            }
            word = words[random.nextInt(words.length)];
    }
        }
}