module com.example.agendafx {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.agendafx to javafx.fxml;
    exports com.example.agendafx;
}