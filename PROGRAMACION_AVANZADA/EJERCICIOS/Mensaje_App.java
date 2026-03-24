package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;
import java.util.Random;

public class Mensaje_App {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        int opc;
        Random r = new Random();
        int aleatorio = r.nextInt(0,5);

        Mensaje mensajes[] = new Mensaje[5];
        for(int i = 0; i < 5; i++){
            if(i == 0){
                mensajes[i] = new Mensaje();
            }
            else if(i == 1){
                mensajes[i] = new Mensaje("Hola Como Estas");
            }
            else if(i == 2){
                mensajes[i] = new Mensaje("Muy bien");
            }
            else if(i == 3){
                mensajes[i] = new Mensaje("Que bien");
            }
            else if(i == 4){
                mensajes[i] = new Mensaje("Bueno Adios");
            }
        }

        System.out.println("Menú: ");
        System.out.println("1. Mostrar un mensaje al azar.");
        System.out.println("2. Quitar espacios de un mensaje al azar.");
        System.out.println("3. Cambiar un mensaje a minúsculas al azar.");
        System.out.println("Selecciones la opción: ");
        opc = lee.nextInt();

        switch(opc){
            case 1:
                    mensajes[aleatorio].mostrar_mensaje();
                break;
            case 2:
                    mensajes[aleatorio].quitar_espacios();
                break;
            case 3:

                    mensajes[aleatorio].convertir_minusculas();
                break;
        }
    }
    
}
