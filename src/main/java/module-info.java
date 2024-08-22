module com.project.javawordle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.project.javawordle to javafx.fxml;
    exports com.project.javawordle;
}