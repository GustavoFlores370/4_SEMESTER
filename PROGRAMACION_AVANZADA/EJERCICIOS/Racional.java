package PROGRAMACION_AVANZADA.EJERCICIOS;

public class Racional {
    private int denominador;
    private int numerador;

    public void asignar(int num, int den) {
        this.numerador = num;
        if (den == 0) {
            System.out.println("Error: El denominador no puede ser 0. Se asignará 1 por defecto.");
            this.denominador = 1;
        } else {
            this.denominador = den;
        }
    }


    public double convertir() {
        return (double) numerador / denominador;
    }

    public void invertir() {
        if (numerador == 0) {
            System.out.println("No se puede invertir: el numerador es 0 (generaría división por cero).");
        } else {
            int aux = numerador;
            numerador = denominador;
            denominador = aux;
            System.out.println("Fracción invertida con éxito.");
        }
    }

    public void imprimir() {
        System.out.println("Fracción actual: " + numerador + "/" + denominador);
    }
}
