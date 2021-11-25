module com.example.tutorial_1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;

    opens com.example.tutorial_1 to javafx.fxml;
    exports com.example.tutorial_1;
}