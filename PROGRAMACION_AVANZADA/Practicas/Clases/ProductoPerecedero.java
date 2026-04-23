package PROGRAMACION_AVANZADA.Practicas.Clases;

public class ProductoPerecedero extends Producto{
    private String fecha_cad;

    public ProductoPerecedero(String codigo, String descripcion, int cantidad, float precio, String fecha_cad){
        super(codigo, descripcion, cantidad, precio);
        this.fecha_cad = fecha_cad;
    }

    public String toString(){
        return super.toString()+""+fecha_cad;
    }
}
