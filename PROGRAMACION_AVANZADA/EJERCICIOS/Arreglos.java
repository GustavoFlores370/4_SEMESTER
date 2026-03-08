package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.util.Scanner;

public class Arreglos {
    public static void main(String[] args){
                Scanner lee = new Scanner(System.in);
        int[] asientos = new int[10];
        int opcion;
        char respuesta;
        boolean asignado;

        while (true) {

            System.out.println("\nEstado de los asientos (0=libre, 1=ocupado):");

            for (int i = 0; i < 10; i++) {
                System.out.print(asientos[i] + " ");
            }

            System.out.println("\n\n1. Primera Clase (1-5)");
            System.out.println("2. Economico (6-10)");
            System.out.print("Seleccione una opcion: ");
            opcion = lee.nextInt();

            asignado = false;

            if (opcion == 1) {

                for (int i = 0; i < 5; i++) {
                    if (asientos[i] == 0) {

                        asientos[i] = 1;

                        System.out.println("\nPase de abordaje");
                        System.out.println("Seccion: Primera Clase");
                        System.out.println("Asiento: " + (i + 1));

                        asignado = true;
                        break;
                    }
                }

                if (!asignado) {

                    System.out.print("Primera clase llena. ¿Aceptar economico? (s/n): ");
                    respuesta = lee.next().charAt(0);

                    if (respuesta == 's') {

                        for (int i = 5; i < 10; i++) {
                            if (asientos[i] == 0) {

                                asientos[i] = 1;

                                System.out.println("\nPase de abordaje");
                                System.out.println("Seccion: Economico");
                                System.out.println("Asiento: " + (i + 1));

                                asignado = true;
                                break;
                            }
                        }
                    }

                    if (!asignado)
                        System.out.println("El proximo vuelo sale en 3 horas");
                }

            } else if (opcion == 2) {

                for (int i = 5; i < 10; i++) {
                    if (asientos[i] == 0) {

                        asientos[i] = 1;

                        System.out.println("\nPase de abordaje");
                        System.out.println("Seccion: Economico");
                        System.out.println("Asiento: " + (i + 1));

                        asignado = true;
                        break;
                    }
                }

                if (!asignado) {

                    System.out.print("Economico lleno. ¿Aceptar primera clase? (s/n): ");
                    respuesta = lee.next().charAt(0);

                    if (respuesta == 's') {

                        for (int i = 0; i < 5; i++) {
                            if (asientos[i] == 0) {

                                asientos[i] = 1;

                                System.out.println("\nPase de abordaje");
                                System.out.println("Seccion: Primera Clase");
                                System.out.println("Asiento: " + (i + 1));

                                asignado = true;
                                break;
                            }
                        }
                    }

                    if (!asignado)
                        System.out.println("El proximo vuelo sale en 3 horas");
                }
            }
        }

    }
    
}
