package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;

public class Password_App {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);

        System.out.println("Cuántas contraseñas desea generar?: ");
        int tamaño = lee.nextInt();
        System.out.println("Escribe la longitud de los passwords: ");
        int longitud = lee.nextInt();

        Password contraseñas [] = new Password[tamaño];
        boolean[] fuertes = new boolean[tamaño];

        for(int i = 0; i < tamaño; i++){
            if(i == 0){
                contraseñas[i] = new Password();
            }
            else{
                contraseñas[i] = new Password(longitud);
            }
            fuertes[i] = contraseñas[i].esFuerte();
        }

        for (int i = 0; i < tamaño; i++) {
            System.out.println(contraseñas[i].getContraseña() + " " + fuertes[i]);
        }
            lee.close();
    }
    
}