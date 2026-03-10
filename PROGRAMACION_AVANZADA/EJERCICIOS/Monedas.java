package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.util.Random;

public class Monedas {
    static Random random = new Random();


    public static int tirar() {
        return random.nextInt(2); 
    }

    public static void main(String[] args) {

        int caras = 0;
        int cruces = 0;

        for (int i = 1; i <= 100; i++) {

            int resultado = tirar();

            if (resultado == 0) {
                System.out.println("Lanzamiento " + i + ": Cara");
                caras++;
            } else {
                System.out.println("Lanzamiento " + i + ": Cruz");
                cruces++;
            }
        }

        System.out.println("\nResultados finales:");
        System.out.println("Caras: " + caras);
        System.out.println("Cruces: " + cruces);
    
    }
}
