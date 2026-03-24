package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;

public class Persona_App {

    public static void IMC(int a){
        if(a == -1){
            System.out.println("Está desnutrido");
        }
        else if(a == 0){
            System.out.println("Está por debaj0 de su peso ideal");
        }
        else if(a == 1){
            System.out.println("Tiene sobrepeso");
        }
    }

    public static void edad(boolean b){
        if(b == true){
            System.out.println("Es mayor de Edad");
        }
        else{
            System.out.println("Es menor de Edad");
        }
    }

    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        String nombre;
        int edad;
        char sexo;
        double peso;
        double altura;

        System.out.println("Ingresa tu nombre: ");
        nombre = lee.nextLine();
        System.out.println("Ingresa tu edad: ");
        edad = lee.nextInt();
        System.out.println("Ingresa tu sexo (M/H): ");
        sexo = lee.next().charAt(0);
        System.out.println("Ingresa tu peso: ");
        peso = lee.nextDouble();
        System.out.println("Ingresa tu altura: ");
        altura = lee.nextDouble();

        lee.close();

        Persona persona1 = new Persona(nombre,edad,sexo,peso,altura);
        Persona persona2 = new Persona(nombre,edad,sexo);
        Persona persona3 = new Persona();


        System.out.println("Datos de IMC de la persona 1:");
        IMC(persona1.calcularIMC());
        edad(persona1.esMayorDeEdad());
    
        System.out.println("\nDatos de IMC de la persona 2:");
        IMC(persona2.calcularIMC());
        edad(persona2.esMayorDeEdad());

        System.out.println("\nDatos de IMC de la persona 3:");
        IMC(persona3.calcularIMC());
        edad(persona3.esMayorDeEdad());

        System.out.println("\nDatos Generales de la Persona");
        persona1.imprimir();
        System.out.println("\nDatos Generales de la Persona");
        persona2.imprimir();
        System.out.println("\nDatos Generales de la Persona");
        persona3.imprimir();

    }
    
}