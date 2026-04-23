package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Entrenador extends SeleccionFutbol{
    private String idFederacion;

    public String getIdFederacion() {
        return idFederacion;
    }

    public void setIdFederacion(String idFederacion) {
        this.idFederacion = idFederacion;
    }

    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion){
        super(id, nombre, apellidos, edad);
        this.idFederacion = idFederacion;
    }

    public void dirigirPartido(){
        System.out.println(nombre+ ""+apellidos+" está dirigiendo un partido.");
    }

    public void dirigirEntrenamiento(){
        System.out.println(nombre+ ""+apellidos+" está dirigiendo el entrenamiento del quipo.");
    }

    public String toString(){
        return super.toString()+"\tID Federacion: "+idFederacion;
    }
}
