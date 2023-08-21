package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import logica.Usuario;

import java.util.ArrayList;

public class LoginController {
    /*@FXML
    private TextField usuarioText;

    @FXML
    private TextField claveText;

    @FXML
    private TextField idText;*/

    @FXML
    private ListView<Usuario> lista;

    @FXML
    protected Button mostar = new Button();

    @FXML
    protected void onBtnClick(){
        Usuario usuario = new Usuario(25, "pedro", "delgado");
        //usuario.insertar();
        usuario.leer();
        ArrayList<Usuario> usuarioList = usuario.leer();

        ObservableList<Usuario> observableList = FXCollections.observableArrayList(usuarioList);
        lista.setItems(observableList);

    }
}
