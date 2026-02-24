package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

import java.util.Scanner;

public class EJERCICIO_ARRAY {
    public static void main(String[] args){

Scanner lee = new Scanner(System.in);
        int a;
        int menu;
        do{
            System.out.print("Introduzca el numero de comensales: ");
            a = lee.nextInt();
     
            if(a<=5){
                int comensales[] = new int [a];
            
                for(int i=0; i<comensales.length; i++){
                    int b = i+1;
                    do{
                        System.out.print("Menu del comensal "+b+": ");
                        menu = lee.nextInt();
                        if(menu>3){
                            System.out.println("\nMenu inexistente, intente de nuevo");
                        }
                        else{
                            comensales [i] = menu; 
                        }
                    }while(menu>3);
                }
                for(int k=0; k<comensales.length; k++){
                    int c = k+1;
                    System.out.print("\nComensal "+c+": Menu "+comensales[k]+"");
                }   
            }
        
            else{
                System.out.println("\nMaximo 5 personas por mesa");
            }
        }while(a>5);


    }
    
}
