package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Avion extends Transporte{

    public Avion(String nombre, String modelo, String aerolinea, int no_asientos){
        super(nombre, modelo, aerolinea, no_asientos);
    }

    public void mostrar_informacion(){
        System.out.println(super.toString());
    }

    public void mostrar_avion(){
        for(int i = 0; i < getNo_asientos(); i++){
            String estado = getEstado_asiento()[i] ? "[Ocupado]" : "[Libre]";
            System.out.printf("Asiento %02d: %s\t", (i+1),estado);
            
            if((i+1) % 4 == 0){
                System.out.println();
            }
        }
        System.out.println();
    }
}
