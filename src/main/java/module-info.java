module com.project.javawordle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.project.javawordle to javafx.fxml;
    exports com.project.javawordle;
}