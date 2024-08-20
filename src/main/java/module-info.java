module com.example.javawordle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javawordle to javafx.fxml;
    exports com.example.javawordle;
}