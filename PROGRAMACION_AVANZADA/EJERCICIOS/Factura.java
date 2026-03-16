package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.util.Scanner;

public class Factura {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Arreglos para almacenar los datos de 3 productos
        String[] nombres = new String[3];
        int[] unidades = new int[3];
        double[] precios = new double[3];
        double[] totalesProducto = new double[3];
        double totalFactura = 0;

        // 1. Entrada de datos
        System.out.println("--- INGRESO DE DATOS DE LA FACTURA ---");
        for (int i = 0; i < 3; i++) {
            System.out.println("\nProducto nro " + (i + 1) + ":");
            System.out.print("Nombre del producto: ");
            nombres[i] = sc.nextLine();
            
            System.out.print("Unidades: ");
            unidades[i] = sc.nextInt();
            
            System.out.print("Precio por unidad: ");
            precios[i] = sc.nextDouble();
            sc.nextLine(); // Limpiar el buffer del scanner

            // Calcular el total de esta línea
            totalesProducto[i] = unidades[i] * precios[i];
            // Acumular el gran total
            totalFactura += totalesProducto[i];
        }

        // 2. Presentación de la factura por pantalla
        System.out.println("\n\n=====================================================");
        System.out.println("                  FACTURA DE VENTA                   ");
        System.out.println("=====================================================");
        
        // CABECERA
        // %-15s: String de 15 espacios alineado a la izquierda
        // %-10s: String de 10 espacios
        System.out.printf("%-15s %-10s %-15s %-10s%n", "PRODUCTO", "UNIDADES", "PRECIO/UNID", "TOTAL");
        System.out.println("-----------------------------------------------------");

        // CUERPO (Las 3 líneas de productos)
        for (int i = 0; i < 3; i++) {
            System.out.printf("%-15s %-10d %-15.2f %-10.2f%n", 
                nombres[i], unidades[i], precios[i], totalesProducto[i]);
        }

        // PIE DE FACTURA
        System.out.println("-----------------------------------------------------");
        System.out.printf("%-42s %.2f%n", "TOTAL FACTURA:", totalFactura);
        System.out.println("=====================================================");
    }
    
}
