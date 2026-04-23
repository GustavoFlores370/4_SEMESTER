package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Producto {
    private String codigo;
    private String descripcion;
    private float precio;
    private int cantidad;
    private float pu;

    public Producto(String codigo, String descripcion, int cantidad, float precio){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
        pu = precio * cantidad;
    }

    public String toString(){
        return ""+codigo+"\t"+descripcion+"\t"+cantidad+"\t"+precio+"\t"+pu;
    }
    
}
