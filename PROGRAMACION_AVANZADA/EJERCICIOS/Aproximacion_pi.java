package PROGRAMACION_AVANZADA.EJERCICIOS;

public class Aproximacion_pi {
    public static void main(String[] args){
        double pi = 0.0;
        int signo = 1;

        for (int i = 1; i <= 1000; i++) {

            int denominador = 2 * i - 1;

            pi += signo * (4.0 / denominador);

            System.out.println("Termino " + i + " -> Pi aproximado = " + pi);

            signo *= -1;
        }
    }
    
}
