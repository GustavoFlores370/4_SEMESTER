package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Orden {
    private String num_orden;
    public String getNum_orden() {
        return num_orden;
    }

    public void setNum_orden(String num_orden) {
        this.num_orden = num_orden;
    }

    public String getFecha_orden() {
        return fecha_orden;
    }

    public void setFecha_orden(String fecha_orden) {
        this.fecha_orden = fecha_orden;
    }

    public float getMonto_orden() {
        return monto_orden;
    }

    public void setMonto_orden(float monto_orden) {
        this.monto_orden = monto_orden;
    }

    private String fecha_orden;
    private float monto_orden;

    public Orden(String num_orden, String fecha_orden, float monto_orden){
        this.num_orden = num_orden;
        this.fecha_orden = fecha_orden;
        this.monto_orden = monto_orden;
    }

    public String toString(){
        return "Número de Orden: "+num_orden+"\tFecha de Orden: "+fecha_orden+"\tMonto de Orden: "+monto_orden;
    }
}
