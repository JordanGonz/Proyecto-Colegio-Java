
package Clasess;


public class Parcial {
    private String trabajo;
    private String actividad;
    private String aprovechamiento;
    private String examen;

    public Parcial() {
    }

    public Parcial(String trabajo, String actividad, String aprovechamiento, String examen) {
        this.trabajo = trabajo;
        this.actividad = actividad;
        this.aprovechamiento = aprovechamiento;
        this.examen = examen;
    }

    public String getTrabajo() {
        return trabajo;
    }

    public void setTrabajo(String trabajo) {
        this.trabajo = trabajo;
    }

    public String getActividad() {
        return actividad;
    }

    public void setActividad(String actividad) {
        this.actividad = actividad;
    }

    public String getAprovechamiento() {
        return aprovechamiento;
    }

    public void setAprovechamiento(String aprovechamiento) {
        this.aprovechamiento = aprovechamiento;
    }

    public String getExamen() {
        return examen;
    }

    public void setExamen(String examen) {
        this.examen = examen;
    }
    
    
}
