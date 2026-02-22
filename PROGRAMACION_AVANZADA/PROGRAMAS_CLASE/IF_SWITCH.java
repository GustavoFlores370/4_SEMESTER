package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class IF_SWITCH {
    public static void main(String[] args){

        int option;
        @SuppressWarnings("resource")
        Scanner lee = new Scanner(System.in);

        System.out.println("Ejercicios de condicionales IF y SWITCH");
        System.out.println("\n1. Ejercicio usando IF-ELSE");
        System.out.println("2. Ejercicio usando SWITCH-CASE");
        System.out.println("Escoge el programa al que deseas acceder: ");
        option = lee.nextInt();

        switch (option){
            case 1:
        //EJERCICIO USANDO IF-ELSE
        String NOMBRE;
        String SEXO;
        System.out.println("Escribe tu nombre: ");
        NOMBRE= lee.nextLine();
        System.out.println("Escribe tu sexo: ");
        SEXO= lee.nextLine();
        
        char var = NOMBRE.charAt(0);
        if (var < 'M' && SEXO.equals("MUJER"))
            System.out.println("Grupo A");
        else if (var < 'M' && SEXO.equals("HOMBRE"))
            System.out.println("Grupo B");
        else if (var > 'M' && SEXO.equals("MUJER"))
            System.out.println("Grupo C");
        else if (var > 'M' && SEXO.equals("HOMBRE"))
            System.out.println("Grupo D");

        break;
            case 2:
        //EJERCICIO USANDO SWITCH-CASE
        int a;

        System.out.println("Calculadora de Funciones Trignometricas Basicas");
        System.out.println("\n\n1. Seno");
        System.out.println("2. Coseno");
        System.out.println("3. Tangente");
        System.out.println("Elige la operación que deseas realizar: ");
        a = lee.nextInt();

        switch (a){
            case 1:
                System.out.println("Ingresa el valor del ángulo: ");
                double anguloSeno = lee.nextDouble();
                double resultadoSeno = Math.sin(Math.toRadians(anguloSeno));
                System.out.println("El seno de " + anguloSeno + " grados es: " + resultadoSeno);
                break;
            case 2:
                System.out.println("Ingresa el valor del ángulo: ");
                double anguloCoseno = lee.nextDouble();
                double resultadoCoseno = Math.cos(Math.toRadians(anguloCoseno));
                System.out.println("El coseno de " + anguloCoseno + " grados es: " + resultadoCoseno);
                break;
            case 3:
                System.out.println("Ingresa el valor del ángulo: ");
                double anguloTangente = lee.nextDouble();
                double resultadoTangente = Math.tan(Math.toRadians(anguloTangente));
                System.out.println("La tangente de " + anguloTangente + " grados es: " + resultadoTangente);
                break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 3.");
        }  
    break;
            default:
                System.out.println("Opción no válida. Por favor, elige una opción entre 1 y 2.");
    
    }
}
}