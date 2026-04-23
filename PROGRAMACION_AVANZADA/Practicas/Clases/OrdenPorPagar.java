package PROGRAMACION_AVANZADA.Practicas.Clases;

public class OrdenPorPagar extends Orden{
    private String fecha_pago;

    public OrdenPorPagar(String a, String b, String fecha_pago, float c){
        super(a,b,c);
        this.fecha_pago = fecha_pago;
    }

    public String toString(){
        return super.toString()+"\tFecha de pago: "+fecha_pago;
    }

    public void mostrarOrden(){
        System.out.println(toString());
    }

    public String getFecha_pago() {
        return fecha_pago;
    }

    public void setFecha_pago(String fecha_pago) {
        this.fecha_pago = fecha_pago;
    }
}
