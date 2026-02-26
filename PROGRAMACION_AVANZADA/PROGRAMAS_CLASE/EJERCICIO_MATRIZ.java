package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

import java.util.Scanner;

public class EJERCICIO_MATRIZ {
    public static void main(String[] args){

        String producto[][]= {{"Chocolates", "Papas", "Galletas"}, 
            {"Gomitas", "Refrescos", "Cacahuates"}, {"Chicles", "Jugos", "Barritas"}};
        int precio[][]= {{25, 20, 28}, {10, 24, 5}, {2, 26, 10}};
        System.out.println("\nSeleccione la fila y colmna del producto que desea comprar\n");
        for(int i=0; i<3; i++)
            System.out.println("["+i+",0]"+producto[i][0]+""
                    + "\t["+i+",1]"+producto[i][1]+"\t["+i+",2]"+producto[i][2]+"");
        
        Scanner sel = new Scanner(System.in);
        int a;
        int b;
        System.out.print("\nIngresa la fila: ");
        a = sel.nextInt();
        System.out.print("Ingresa la columna: ");
        b = sel.nextInt();
        
        System.out.println("\nProducto sleccionado: "+producto[a][b]+"");
        System.out.println("Precio del producto: "+precio[a][b]+" Pesos");



    }
    
}
