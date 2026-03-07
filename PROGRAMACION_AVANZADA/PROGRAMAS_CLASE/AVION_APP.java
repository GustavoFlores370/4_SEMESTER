package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class AVION_APP {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);


        AVION boeing = new AVION();
        AVION airbus = new AVION();

        System.out.println("Datos del primer avion");
        System.out.println("Velocidad Inicial: ");
            boeing.velocidad_inicial=lee.nextFloat();
        System.out.println("Velocidad Final: ");
            boeing.velocidad_final=lee.nextFloat();
        System.out.println("Tiempo: ");
            boeing.tiempo=lee.nextFloat();
        boeing.calcular_aceleracion();

        System.out.println("Datos del segundo avion");
        System.out.println("Velocidad Inicial: ");
            airbus.velocidad_inicial=lee.nextFloat();
        System.out.println("Velocidad Final: ");
            airbus.velocidad_final=lee.nextFloat();
        System.out.println("Tiempo: ");
            airbus.tiempo=lee.nextFloat();
        airbus.calcular_aceleracion();

        System.out.println("PRIMER AVION");
        boeing.imprimir_informacion();
        System.out.println("SEGUNDO AVION");
        airbus.imprimir_informacion();




    }
    
}
