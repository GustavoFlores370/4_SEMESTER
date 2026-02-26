package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

import java.util.Scanner;

public class EJERCICIO_FUNCIONES {
    /* 
    public static int suma(int a, int b){

        int res = a+b;
        return res;

}

public static void main(String[] args) {

int valor = suma(7,10);

System.out.println("Valor: "+valor);

}*/




public static double calcularDescuento(double total){
    if(total>=100 && total<=300){
        double descuento = total*0.15;
        return descuento;
    }
    else if(total>300){
        double descuento = total*0.20;
        return descuento;
    }
    else{
        return 0;
    }



}
public static void main(String[] args){
    Scanner lee = new Scanner(System.in);

    System.out.println("Ingresa el total de tu compra: ");
    double total = lee.nextDouble();

double preciofinal = total - calcularDescuento(total);
System.out.println("Precio final: "+preciofinal);



}
    
}
