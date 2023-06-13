package Clasess;
import java.io.Serializable;

public class Profesor implements Serializable{
    private String codigo;
    private String nombre;
    private String apellido;
    private String curso;

    public Profesor() {
    }

    public Profesor(String codigo, String nombre, String apellido, String curso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
    

    
}


