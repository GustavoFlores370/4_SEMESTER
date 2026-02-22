package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

import java.util.Scanner;

public class POSITIVOS_NEGATIVOS {
    public static void main(String[] args){
        @SuppressWarnings("resource")
        Scanner lee = new Scanner(System.in);
        float Num1;
        float Num2;
        
        System.out.println("Ingresa el primer valoru: ");
        Num1 = lee.nextFloat();
        System.out.println("Ingresa el segundo valor: ");
        Num2 = lee.nextFloat();
        
        if (Num1>0 && Num2>0)
            System.out.println("Los valores son positivos");
        else if (Num1<0 && Num2<0)
            System.out.println("Los valores son negativos");
        else if(Num1>0 && Num2<0)
            System.out.println("El primer valor es positivo y el segundo negativo");
        else if (Num1<0 && Num2>0)
            System.out.println("El primer valor es negativo y el segundo positivo");
        else 
            System.out.println("Alguno de los valores es igual a 0");

    }
    
}
