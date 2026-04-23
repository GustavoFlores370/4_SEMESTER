package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Avion_premium extends Transporte{
    
    private int no_pisos;

    public Avion_premium(String nombre, String modelo, String aerolinea, int no_asientos, int no_pisos){
        super(nombre, modelo, aerolinea, no_asientos);
        this.no_pisos = no_pisos;
    }

    public void mostrar_informacion(){
        System.out.println(super.toString()+"\nNumero de pisos: "+no_pisos);
    }

    public void mostrar_avion(){
        for(int i = 0; i < getNo_asientos(); i++){
            String estado = getEstado_asiento()[i] ? "[Ocupado]" : "[Libre]";
            System.out.printf("Asiento %02d: %s\t", (i+1),estado);
            
            if((i+1) % 4 == 0){
                System.out.println();
            }
        }
    }
}
