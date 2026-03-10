package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.util.Scanner;

public class Distancia_puntos {
    public static double distancia(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Ingrese x1: ");
        double x1 = input.nextDouble();

        System.out.print("Ingrese y1: ");
        double y1 = input.nextDouble();

        System.out.print("Ingrese x2: ");
        double x2 = input.nextDouble();

        System.out.print("Ingrese y2: ");
        double y2 = input.nextDouble();

        double resultado = distancia(x1, y1, x2, y2);

        System.out.printf("La distancia entre los puntos es: %.2f\n", resultado);

        input.close();
    
    }
}
