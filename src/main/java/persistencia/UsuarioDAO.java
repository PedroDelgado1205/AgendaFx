package persistencia;

public class UsuarioDAO {

    private  int id;
    private String nombre;
    private String clave;

    public UsuarioDAO(int _id, String _nombre, String _clave){
        this.id = _id;
        this.nombre = _nombre;
        this.clave = _clave;
    }

    public String insertar(){
        String sql = String.format("insert into usuario(usu_nombre, usu_clave) values ('%s', '%s');", this.nombre, this.clave);
        return sql;
    }
    public String actualizar(){
        String sql = String.format("update usuario SET usu_nombre = '%s', usu_clave = '%s' WHERE (id_usuario = '%s');", this.nombre, this.clave, this.id);
        return sql;
    }
    public String borrar(){
        String sql = String.format("delete from usuario where id_usuario = '%s'", this.id);
        return sql;
    }
    public String leer(){
        String sql = "Select * from usuario;";
        return sql;
    }
}
