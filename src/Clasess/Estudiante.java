package Clasess;

import java.io.Serializable;

public class Estudiante implements Serializable{
    
  private String cedula;
  private String nombre;
  private String Apellido;
  private int edad;
  private String direccion;
 private String estado_civil;

    public Estudiante() {
    }

    public Estudiante(String cedula, String nombre, String Apellido, int edad, String direccion, String estado_civil) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.Apellido = Apellido;
        this.edad = edad;
        this.direccion = direccion;
        this.estado_civil = estado_civil;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEstado_civil() {
        return estado_civil;
    }

    public void setEstado_civil(String estado_civil) {
        this.estado_civil = estado_civil;
    }


    
    
}
