module com.example.docker {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.docker to javafx.fxml;
    exports com.example.docker;
}