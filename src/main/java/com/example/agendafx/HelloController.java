package com.example.agendafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import logica.Usuario;

public class HelloController {
    @FXML //decoradores
    private Label welcomeText;

    @FXML //decoradores
    private Button btnSaludo;

    @FXML
    protected void btnHola(){
        btnSaludo.setText("chao");
    }

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Hola Mundo JavaFXML");
        Usuario user = new Usuario(10, "ass", "asd");
        user.leer();
        //System.out.println(user.insertar());
    }

}