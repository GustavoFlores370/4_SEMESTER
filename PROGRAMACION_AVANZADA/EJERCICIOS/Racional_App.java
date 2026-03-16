package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.util.Scanner;

public class Racional_App {
    public static void main(String[] args){
        Scanner leer = new Scanner(System.in);
        Racional miFraccion = new Racional();
        int opcion = 0;

        miFraccion.asignar(1, 1);

        while (opcion != 5) {
            System.out.println("\n--- MENÚ RACIONAL ---");
            System.out.println("1. Asignar valores (num/den)");
            System.out.println("2. Convertir a decimal");
            System.out.println("3. Invertir fracción");
            System.out.println("4. Imprimir fracción");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese numerador: ");
                    int n = leer.nextInt();
                    System.out.print("Ingrese denominador: ");
                    int d = leer.nextInt();
                    miFraccion.asignar(n, d);
                    break;
                case 2:
                    System.out.println("Valor decimal: " + miFraccion.convertir());
                    break;
                case 3:
                    miFraccion.invertir();
                    break;
                case 4:
                    miFraccion.imprimir();
                    break;
                case 5:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        leer.close();
    }
    
}
