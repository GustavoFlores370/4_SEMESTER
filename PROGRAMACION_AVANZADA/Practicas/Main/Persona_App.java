package PROGRAMACION_AVANZADA.Practicas.Main;
import PROGRAMACION_AVANZADA.Practicas.Clases.Profesor;
import PROGRAMACION_AVANZADA.Practicas.Clases.Alumno;
import java.util.Scanner;
import java.util.ArrayList;

public class Persona_App {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        ArrayList<Profesor> profesores = new ArrayList<>();
        ArrayList<Alumno> alumnos = new ArrayList<>();
        int opc;

        do{
        System.out.println("-----Menú-----");
        System.out.println("1. Agregar Profesor.");
        System.out.println("2. Agregar Alumno.");
        System.out.println("3. Mostrar Profesores.");
        System.out.println("4. Mostrar Alumnos.");
        System.out.println("5. Salir.");
        System.out.println("\nSelecciona una opción: ");
        opc = lee.nextInt();
        lee.nextLine();

        switch(opc){
            case 1:
                System.out.println("Escribe tu nombre:");
                String nP = lee.nextLine();
                System.out.println("Escribe tus apellidos: ");
                String aP = lee.nextLine();
                System.out.println("Escribe tu edad: ");
                int eP = lee.nextInt();
                lee.nextLine();
                System.out.println("Escribe tu cédula: ");
                String cP = lee.nextLine();
                profesores.add(new Profesor(nP, aP, eP, cP));
                break;
            case 2:
                System.out.println("Escribe tu nombre:");
                String nA = lee.nextLine();
                System.out.println("Escribe tus apellidos: ");
                String aA = lee.nextLine();
                System.out.println("Escribe tu edad: ");
                int eA = lee.nextInt();
                lee.nextLine();
                System.out.println("Escribe tu cédula: ");
                String mA = lee.nextLine();
                alumnos.add(new Alumno(nA, aA, eA, mA));
                break;
            case 3:
                System.out.println("\n----Lista de Profresores----");
                for(int i = 0; i < profesores.size(); i++){
                    Profesor p = profesores.get(i);
                    System.out.println(p.toString());
                }
                break;
            case 4:
                System.out.println("\n----Lista de Alumnos----");
                for(int k = 0; k < alumnos.size(); k++){
                    Alumno p = alumnos.get(k);
                    System.out.println(p.toString());
                }
        }
        }while(opc != 5);
    }
}
