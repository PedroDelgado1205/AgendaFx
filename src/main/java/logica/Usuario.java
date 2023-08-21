package logica;

import persistencia.*;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Usuario {
    public String getNombre() {
        return nombre;
    }

    public String getClave() {
        return clave;
    }

    public int getId() {
        return id;
    }

    private  int id;
    private String nombre;
    private String clave;

    public Usuario(int _id, String _nombre, String _clave){
        this.id = _id;
        this.nombre = _nombre;
        this.clave = _clave;
    }

    public String insertar(){
        Conexion con = new Conexion();
        UsuarioDAO userDAO = new UsuarioDAO(this.id, this.nombre, this.clave);
        return con.ejecutar(userDAO.insertar());
        //return userDAO.insertar();
    }

    public String editar(){
        Conexion con = new Conexion();
        UsuarioDAO userDAO = new UsuarioDAO(this.id, this.nombre, this.clave);
        return con.ejecutar(userDAO.insertar());
        //return userDAO.insertar();
    }

    public String eliminar(){
        Conexion con = new Conexion();
        UsuarioDAO userDAO = new UsuarioDAO(this.id, this.nombre, this.clave);
        return con.ejecutar(userDAO.insertar());
        //return userDAO.insertar();
    }

    public ArrayList leer() {
        ArrayList datos = new ArrayList<String>();
        Conexion con = new Conexion();
        UsuarioDAO userDAO = new UsuarioDAO(this.id, this.nombre, this.clave);
        ResultSet rs = con.consultar(userDAO.leer());
        //try {
            //rs.last();
           // datos = new String[rs.getRow()][3];
          //  rs.first();
         //   int f=0;
        //    while (rs.next()){
            //    datos[f][0]=rs.getString(0);
           //     datos[f][1]=rs.getString(1);
          //      datos[f][2]=rs.getString(2);
         //       f++;
        //    }
        try {
            //rs.last();
            //datos = new String[rs.getRow()][3];
            while (rs.next()){
                System.out.println("id: "+rs.getString(1));
                System.out.println("nombre: "+rs.getString(2));
                System.out.println("clave: "+rs.getString(3));
                datos.add(rs.getString(1));
                datos.add(rs.getString(2));
                datos.add(rs.getString(3));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return datos;
    }
}
