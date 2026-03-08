package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;
public class Ejercicio_while {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);

        double ventas;
        double salario;

        System.out.println("Ingrese las ventas brutas del vendedor: ");
        ventas = lee.nextDouble();

        while(ventas >= 0){
            salario=200+(ventas*0.09);
            System.out.println("El ingreso del vendedor es:" +salario);

            System.out.println("Ingrese las ventas brutas del siguiente vendedor: ");
            ventas = lee.nextDouble();
        }
        System.out.println("Se ingresó un valor inválido");
    }
    
}
