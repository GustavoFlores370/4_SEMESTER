package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class ESTRUCTURAS_CONTROL {
    public static void main(String[] args){

        int option;
        @SuppressWarnings("resource")
        Scanner lee = new Scanner(System.in);
   
        System.out.println("Ejercicios de estructuras de control");
        System.out.println("\n1. Ciclo FOR");
        System.out.println("2. Ciclo WHILE");
        System.out.println("3. Ciclo DO-WHILE");
        System.out.println("Escoge el programa al que deseas acceder: ");
        option = lee.nextInt();

        switch (option){
            case 1:
                double monto;
                double interes;
                int años;

                System.out.println("EJERCICIO USANDO CICLO FOR");
                System.out.println("\nEscribe el monto a invertir: ");
                monto = lee.nextDouble();
                System.out.println("Escribe el porcentaje de interés anal: ");
                interes = lee.nextDouble();
                System.out.println("Escribe el número de años a invertir: ");
                años = lee.nextInt();

                for (int i = 1; i <= años; i++){
                    monto = monto * (1+(interes/100));
                    System.out.println("El monto al año " + i + " es: " + monto);

                }
                break;
            case 2:
                int i = 2;
                System.out.println("EJERCICIO USANDO CICLO WHILE");
                System.out.println("\n\n1 elefante se columpiaba \nsobre la tela de una araña, \ncomo veía que resistía \nFueron a llamar a otro elefante...");
                while (i<=10){
                    System.out.println("\n " + i + " elefantes se columpiaban \nsobre la tela de una araña, \ncomo veían que resistía \nFueron a llamar a otro elefante...");
                    i++;
                }
                break;
            case 3:
                int totalInvitados = 0;
                String respuesta;
                String nombre;

                  do {
                    System.out.print("Ingresa el nombre del invitado: ");
                    nombre = lee.nextLine();
                    lee.nextLine();

                    System.out.print("¿Cuántas personas extras llevará " + nombre + "? ");
                    int extras = lee.nextInt();
                    lee.nextLine();        
                    totalInvitados += 1 + extras;

                    System.out.print("¿Desea agregar más invitados? (si/no): ");
                    respuesta = lee.nextLine();

                } while (respuesta.equals("si"));

                System.out.println("El número total de invitados es: " + totalInvitados);
                break;  
        }
    }
    
}
