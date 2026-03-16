package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class Celular_App {
    public static void main(String[] args) throws InterruptedException{
        Scanner lee = new Scanner(System.in);
        Celular cels[] = {new Celular(100,"5555555"), new Celular(200,"20223646")};
        int opcion,n;
        do{
            System.out.println("Menu:\n1.LLamar\n2.Enviar Mensaje\n3.Saldo\n4.Salir");
            opcion = lee.nextInt();
            System.out.println("Que celular quieres usar (1 o 2)? ");
            n = lee.nextInt();

            switch(opcion){
                case 1:
                    cels[n-1].llamar();;
                    break;

                case 2:
                    cels[n-1].enviarMensaje();
                    break;

                case 3:
                    cels[n-1].verSaldo();
                    break;

                case 4:
                    break;
            }
        }while(opcion != 4);
    }
    
}
