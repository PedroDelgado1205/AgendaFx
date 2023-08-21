module com.example.agendafx {
    requires javafx.controls;
    requires javafx.fxml;



    requires com.dlsc.formsfx;
    requires java.sql;

    opens com.example.agendafx to javafx.fxml;
    exports com.example.agendafx;
    exports controller;
    opens controller to javafx.fxml;
}