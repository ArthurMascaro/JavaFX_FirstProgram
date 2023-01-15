module com.example.javafxtasks {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.javafxtasks to javafx.fxml;
    exports com.example.javafxtasks;
    exports com.example.javafxtasks.classes.bean;
    opens com.example.javafxtasks.classes.bean to javafx.fxml;
}