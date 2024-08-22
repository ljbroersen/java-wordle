# JavaWordle
![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![JavaFX](https://img.shields.io/badge/javafx-%23FF0000.svg?style=for-the-badge&logo=javafx&logoColor=white)

JavaWordle is a small, interactive game of Wordle created with Java!<br>
JavaFX with its bundled Scene Builder were also used to create the interface of the app.

# How to download
In the repository, you will find a .zip file called "JavaWordleV2.zip". Please download the file.<br>
Next, inside this .zip file, you will find an .exe file called "java-wordle.exe". Please run the application and have fun playing!<br>
<br>
You will need a Java Runtime Environment (JRE) to be able to run the application!

# How to play
The interface is simple: you will see a welcome message ("Welcome to JavaWordle!"), 5 rows of each 5 columns, an input field, and two buttons: "Guess!" and "Try again!".
- If you open the application, you can directly start playing. Just input a word and press "Guess!". (The word will automatically be cut off after the 5th letter to fit the amount of columns.)
- If the letter is on the right place, the column will become green. If the letter is part of the word, but not on the spot you defined, the column will turn orange. If the letter does not appear in the word, the column stays white.
- You have 5 attempts.
- If you guess the word, or if you reached your 5th attempt, the input field gets disabled and the only button that works is "Try Again!"
- "Try Again!" triggers a new word, and you give it another shot!<br>

#### V2 addition
- Instead of directly starting a game, you first see a welcome window with the name of the application, and a "Start game!" button.
- The game now includes a "normal" and a "hard" difficulty. If you play on normal difficulty, you have 5 tries to guess the word, and if you play on hard difficulty you have only 3.

# Specs
Java version: 21<br>
Application size: ~9kb
