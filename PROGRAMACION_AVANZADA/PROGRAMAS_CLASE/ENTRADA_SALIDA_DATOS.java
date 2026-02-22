package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class ENTRADA_SALIDA_DATOS {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner lee = new Scanner(System.in);

        /* 
        int claveAlumno;
        double calif;
        String nombreAlumno;

        System.out.println("Ingrese el nombre del alumno: ");
        nombreAlumno = lee.nextLine();
        System.out.println("Ingrese el numero de boleta: ");
        claveAlumno = lee.nextInt();
        System.out.println("Ingrese Calificacion: ");
        calif = lee.nextDouble();

        //CON FORMATO
        System.out.printf("Alumno: %s \tBoleta: %8d \tCalificaion: %.2f", nombreAlumno,claveAlumno,calif);
        //SIN FORMATO
        System.out.println("\nAlumno: " + nombreAlumno + "\tBoleta: " + claveAlumno + "\tCalificacion: " + calif);

        */

        String pelicula1;
        String pelicula2;
        String pelicula3;
        String clas1;
        String clas2;
        String clas3;
        float prize1;
        float prize2;
        float prize3;

        System.out.println("Ingresa el nombre de la primer película: ");
        pelicula1 = lee.nextLine();
        System.out.println("Ingresa el nombre de la segunda película: ");
        pelicula2 = lee.nextLine(); 
        System.out.println("Ingresa el nombre de la tercer película: ");
        pelicula3 = lee.nextLine();
        System.out.println("Ingresa la clasificación de la primer película: ");
        clas1= lee.nextLine();
        System.out.println("Ingresa la clasificación de la segunda película: ");
        clas2 = lee.nextLine();
        System.out.println("Ingresa la clasificación de la tercer película: ");
        clas3 = lee.nextLine();
        System.out.println("Ingresa el precio de la primer película: ");
        prize1 = lee.nextFloat();
        System.out.println("Ingresa el precio de la segunda película: ");
        prize2 = lee.nextFloat();
        System.out.println("Ingresa el precio de la tercer película: ");
        prize3 = lee.nextFloat();

        System.out.printf("\nPelícula 1: %s \tClasificación: %s \tPrecio: $%.2f", pelicula1, clas1, prize1);
        System.out.printf("\nPelícula 2: %s \tClasificación: %s \tPrecio: $%.2f", pelicula2, clas2, prize2);
        System.out.printf("\nPelícula 3: %s \tClasificación: %s \tPrecio: $%.2f", pelicula3, clas3, prize3);

    }
}