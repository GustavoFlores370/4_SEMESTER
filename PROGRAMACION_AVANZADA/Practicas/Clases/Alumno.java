package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Alumno extends Persona{
    private String matricula;

    public Alumno(String n, String a, int e, String matricula){
        super(n, a, e);
        this.matricula = matricula;
    }

    public String toString(){
        return super.toString()+"\nMatricula: "+matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
