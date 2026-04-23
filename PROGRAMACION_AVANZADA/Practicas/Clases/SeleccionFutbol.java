package PROGRAMACION_AVANZADA.Practicas.Clases;

public class SeleccionFutbol {
    protected int id;
    protected String nombre;
    protected String apellidos;
    protected int edad;


    public SeleccionFutbol(int id, String nombre, String apellidos, int edad){
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
    }

    public void Concentrarse(){
        System.out.println(nombre+" "+apellidos+" está en concentración");
    }

    public void Viajar(){
        System.out.println(nombre+" "+apellidos+" está viajando");
    }

    public String toString(){
        return "ID: "+id+"\tNombre: "+nombre+"\nApellidos: "+apellidos+"\nEdad: "+edad;
    }
}
