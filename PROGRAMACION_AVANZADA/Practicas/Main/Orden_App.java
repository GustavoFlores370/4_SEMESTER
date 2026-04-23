package PROGRAMACION_AVANZADA.Practicas.Main;
import PROGRAMACION_AVANZADA.Practicas.Clases.OrdenPorPagar;
import PROGRAMACION_AVANZADA.Practicas.Clases.OrdenPorCobrar;
import java.util.Scanner;
import java.util.ArrayList;

public class Orden_App {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        int opcion;
        ArrayList<OrdenPorPagar> ordenes_pagar = new ArrayList<>();
        ArrayList<OrdenPorCobrar> ordenes_cobrar = new ArrayList<>();

        do{
            System.out.println("-----Menú-----");
            System.out.println("\n1. Agregar Orden por Pagar.");
            System.out.println("2. Agregar Orden por Cobrar.");
            System.out.println("3. Mostrar Ordenes por Pagar.");
            System.out.println("4. Mostrar Ordenes por Cobrar.");
            System.out.println("5. Salir");
            System.out.println("Escoge una opción: ");
            opcion = lee.nextInt();
            lee.nextLine();

            switch(opcion){
                case 1:
                    System.out.println("Número de Orden: ");
                    String noP = lee.nextLine();
                    System.out.println("Fecha de Orden: ");
                    String foP = lee.nextLine();
                    System.out.println("Monto de Orden: ");
                    float moP = lee.nextFloat();
                    lee.nextLine();
                    System.out.println("Fecha de pago: ");
                    String fpP = lee.nextLine();
                    ordenes_pagar.add(new OrdenPorPagar(noP, foP, fpP, moP));
                    break;
                case 2:
                    System.out.println("Número de Orden: ");
                    String noC = lee.nextLine();
                    System.out.println("Fecha de Orden: ");
                    String foC = lee.nextLine();
                    System.out.println("Monto de Orden: ");
                    float moC = lee.nextFloat();
                    lee.nextLine();
                    System.out.println("Fecha de cobro: ");
                    String fcC = lee.nextLine();
                    ordenes_cobrar.add(new OrdenPorCobrar(noC, foC, fcC, moC)); 
                    break;
                case 3:
                    System.out.println("----Lista de Ordenes por Pagar----");   
                    for(int i = 0; i < ordenes_pagar.size(); i++) {
                        OrdenPorPagar p = ordenes_pagar.get(i);
                        p.mostrarOrden();
                    }  
                    break;
                case 4:
                    System.out.println("----Lista de Ordenes por Cobrar----");
                    for(int k = 0; k < ordenes_cobrar.size(); k++) {
                        OrdenPorCobrar q = ordenes_cobrar.get(k);
                        q.mostrarOrden();
                    }  
            }
        }while(opcion !=5 );
    }
}
