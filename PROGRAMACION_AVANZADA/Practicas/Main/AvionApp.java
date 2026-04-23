package PROGRAMACION_AVANZADA.Practicas.Main;
import java.util.Scanner;
import PROGRAMACION_AVANZADA.Practicas.Clases.Avion;
import PROGRAMACION_AVANZADA.Practicas.Clases.Avion_premium;

public class AvionApp {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        Avion avionEstandar = new Avion("Comercial V1", "Boeing 737", "AeroMexico", 20);
        Avion_premium avionPremium = new Avion_premium("Luje V2", "Airbus A380", "Emirates", 12, 2 );
        int opc1;
        int opc2;

        do{
            System.out.println("----Menu Principal----");
            System.out.println("\n1. Boleto Estandar.");
            System.out.println("2. Boleto Premium.");
            System.out.println("3. Salir.");
            System.out.println("Escoge una opción: ");
            opc1 = lee.nextInt();

            switch(opc1){
                case 1:
                    do{
                        System.out.println("----Boleto Estandar----");
                        System.out.println("\n1. Mostrar informacion del avion.");
                        System.out.println("2. Comprar boleto.");
                        System.out.println("3. Mostrar Avion.");
                        System.out.println("4. Regresar.");
                        System.out.println("Escoge una opcion: ");
                        opc2 = lee.nextInt();

                        switch(opc2){
                            case 1:
                                avionEstandar.mostrar_informacion();
                                break;
                            case 2:
                                avionEstandar.comprar_asiento();
                                break;
                            case 3:
                                avionEstandar.mostrar_avion();
                                break;
                        }
                    }while(opc2 != 4);
                    break;
                case 2:
                    do{
                        System.out.println("----Boleto Premium----");
                        System.out.println("\n1. Mostrar informacion del avion.");
                        System.out.println("2. Comprar boleto.");
                        System.out.println("3. Mostrar Avion.");
                        System.out.println("4. Regresar.");
                        System.out.println("Escoge una opcion: ");
                        opc2 = lee.nextInt();

                        switch(opc2){
                            case 1:
                                avionPremium.mostrar_informacion();
                                break;
                            case 2:
                                avionPremium.comprar_asiento();
                                break;
                            case 3:
                                avionPremium.mostrar_avion();
                                break;
                        }
                    }while(opc2 != 4);
                    break;  
            }
        }while(opc1 != 3);
    }
}
