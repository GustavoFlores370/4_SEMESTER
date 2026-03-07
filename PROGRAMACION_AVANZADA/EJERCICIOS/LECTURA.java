package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;
public class LECTURA {
    public static void main(String [] args){
        Scanner lee = new Scanner (System.in);
        int opcion;
        System.out.println("Ejercicios de lectura de datos");
        System.out.println("\n1. Suma, promedio, mayor y menor de 3 números.");
        System.out.println("2. Diametro, Circunferencia y Area de un circulo.");
        System.out.println("3.Digitos Separados");
        System.out.println("Escoge la opicón a la que quieres ingresar:");
        opcion = lee.nextInt();
        switch (opcion){
            case 1:
                    Scanner lee2 = new Scanner (System.in);
                    int a;
                    int b;
                    int c;
                System.out.println("Ingresa el Numero 1: ");
                    a = lee2.nextInt();
                System.out.println("Ingresa el Numero 2: ");
                    b = lee2.nextInt();
                System.out.println("Ingresa el Numero 3: ");
                    c = lee2.nextInt();
                    int sum = a+b+c;
                    float prom = sum/3f;
                System.out.println("La suma de los números es: " +sum);
                System.out.println("El promedio de los números es:" +prom);
             
                    if (a > b && a > c){
                        System.out.println("El número mayor es: " +a);
                    } else if (b > a && b > c){
                        System.out.println("El número mayor es: " +b);
                    } else {
                        System.out.println("El número mayor es: " +c);
                    }

                    if (a < b && a < c){
                        System.out.println("El número menor es: " +a);
                    } else if (b < a && b < c){
                        System.out.println("El número menor es: " +b);
                    } else {
                        System.out.println("El número menor es: " +c);
                    }
            break;
            case 2:
                    Scanner lee3 = new Scanner (System.in);
                    double radio;
                System.out.println("Ingresa el radio del circulo: ");
                    radio = lee3.nextDouble();
                    double diametro = 2*radio;
                    double peri = 2*3.14159*radio;
                    double area = 3.14159 * Math.pow(radio, 2);
                System.out.println("El diametro del circulo es: " +diametro);
                System.out.println("La circunferencia es de: "+peri);
                System.out.println("El area del circulo es: " +area);
            break;
            case 3: 
                    Scanner lee4 = new Scanner (System.in);
                    System.out.print("Ingrese un número entero de cinco dígitos: ");
                    int numero = lee4.nextInt();

                        if (numero < 10000 || numero > 99999) {
                            System.out.println("Error: Debe ingresar exactamente cinco dígitos.");
                        } else {
                    int d1 = numero / 10000;
                    int d2 = (numero % 10000) / 1000;
                    int d3 = (numero % 1000) / 100;
                    int d4 = (numero % 100) / 10;
                    int d5 = numero % 10;

                System.out.println(d1 + "   " + d2 + "   " + d3 + "   " + d4 + "   " + d5);
            break;
        }


    }
}
}
