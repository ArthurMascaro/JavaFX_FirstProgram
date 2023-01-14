module com.example.javafxtasks {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxtasks to javafx.fxml;
    exports com.example.javafxtasks;
}