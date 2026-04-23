package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Profesor extends Persona{
    private String cedula;

    public Profesor(String n, String a, int e, String cedula){
        super(n, a, e);
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String toString(){
        return super.toString()+"\nCedula: "+cedula;
    }
}
