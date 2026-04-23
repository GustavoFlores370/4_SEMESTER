package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Masajista extends SeleccionFutbol{
    private String titulacion;
    private int añosExperiencia;

public Masajista(int id, String nombre, String apellidos, int edad, String titulacion, int añosExperiencia) {
        super(id, nombre, apellidos, edad);
        this.titulacion = titulacion;
        this.añosExperiencia = añosExperiencia;
    }

    public void darMasaje() {
        System.out.println(nombre + " está dando un masaje regenerativo a un jugador.");
    }

    @Override
    public String toString() {
        return super.toString() + "\tTitulación: " + titulacion + "\tAños de Experiencia: " + añosExperiencia;
    }
}
