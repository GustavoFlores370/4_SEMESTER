package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Transporte {
    private int no_pasajeros;
    private String nombre;
    private String modelo;
    private String aerolinea;
    public int getNo_pasajeros() {
        return no_pasajeros;
    }

    public void setNo_pasajeros(int no_pasajeros) {
        this.no_pasajeros = no_pasajeros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getNo_asientos() {
        return no_asientos;
    }

    public void setNo_asientos(int no_asientos) {
        this.no_asientos = no_asientos;
    }

    public boolean[] getEstado_asiento() {
        return estado_asiento;
    }

    public void setEstado_asiento(boolean[] estado_asiento) {
        this.estado_asiento = estado_asiento;
    }

    private int no_asientos;
    private boolean[] estado_asiento;

    public Transporte(String nombre, String modelo, String aerolinea, int no_asientos){
        this.nombre = nombre;
        this.modelo = modelo;
        this.aerolinea =aerolinea;
        this.no_asientos = no_asientos;
        this.estado_asiento = new boolean[no_asientos];
        no_pasajeros = 0;
    }

    public void comprar_asiento(){
       if(no_asientos > no_pasajeros){
        for(int i = 0; i < no_asientos; i++){
            if(estado_asiento[i] == false){
                estado_asiento[i] = true;
                no_pasajeros ++;
                System.out.println("\nBoleto comprado.\nSu número de asiento es: "+(i+1));
                return;
            }
        }
       }
       else{
        System.out.println("\nLo sentimos, no hay asientos disponibles.");  
       }
    }

    public String toString(){
        return "Aerolínea: "+aerolinea+"\nNombre: "+nombre+"\nModelo: "+modelo+"\nMáxima carga: "+no_asientos+"\nPasajeros Actuales: "+no_pasajeros;
    }
}
