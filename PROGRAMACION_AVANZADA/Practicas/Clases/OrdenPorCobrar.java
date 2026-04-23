package PROGRAMACION_AVANZADA.Practicas.Clases;

public class OrdenPorCobrar extends Orden{
    private String fecha_cobro;

    public OrdenPorCobrar(String num_orden, String fecha_orden, String fecha_cobro, float monto_orden){
        super(num_orden,fecha_orden,monto_orden);
        this.fecha_cobro = fecha_cobro;
    }

    public String toString(){
        return super.toString()+"\tFecha de cobro: "+fecha_cobro;
    }

    public void mostrarOrden(){
        System.out.println(toString());
    }

    public String getFecha_cobro() {
        return fecha_cobro;
    }

    public void setFecha_cobro(String fecha_cobro) {
        this.fecha_cobro = fecha_cobro;
    }
}
