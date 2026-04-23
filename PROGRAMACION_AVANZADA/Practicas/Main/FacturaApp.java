package PROGRAMACION_AVANZADA.Practicas.Main;
import java.util.Scanner;
import PROGRAMACION_AVANZADA.Practicas.Clases.Producto;
import PROGRAMACION_AVANZADA.Practicas.Clases.Factura;
import PROGRAMACION_AVANZADA.Practicas.Clases.ProductoPerecedero;
;

public class FacturaApp {
    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        int no_prod;
        int no_prod_perec;
        String codigo;
        String descripcion;
        float precio;
        int cantidad;
        String fecha_cad;
        float total1=0;
        float total2=0;
        float Total;
        String fecha;

        System.out.println("Cuántos productos no perecederos llevará: ");
        no_prod = lee.nextInt();
        System.out.println("Cuántos productos perecederos llevará: ");
        no_prod_perec = lee.nextInt();
        lee.nextLine();

        Producto productos[] = new Producto[no_prod];
        ProductoPerecedero producto_perecedero []= new ProductoPerecedero[no_prod_perec];

        for(int i = 0; i < no_prod; i++){
            System.out.println("----Datos de Productos----");
            System.out.println("Codigo del producto: ");
            codigo = lee.nextLine();
            System.out.println("Descripcion del producto: ");
            descripcion = lee.nextLine();
            System.out.println("Precio unitario: ");
            precio = lee.nextFloat();
            System.out.println("Cantidad: ");
            cantidad = lee.nextInt();
            lee.nextLine();
            productos[i] = new Producto(codigo, descripcion, cantidad, precio);
            System.out.println("----Datos de Productos Perecederos----");
            System.out.println("Codigo del producto: ");
            codigo = lee.nextLine();
            System.out.println("Descripcion del producto: ");
            descripcion = lee.nextLine();
            System.out.println("Precio unitario: ");
            precio = lee.nextFloat();
            System.out.println("Cantidad: ");
            cantidad = lee.nextInt();
            System.out.println("Fecha de caducidad: ");
            fecha_cad = lee.nextLine();
            lee.nextLine();
            producto_perecedero[i] = new ProductoPerecedero(codigo,descripcion,cantidad,precio,fecha_cad);
            Total =+ precio;
        }

        System.out.println("----Factura----");
        System.out.println("\nCódigo\tDescripcion\tCantidad\tPU\tPrecio");
        for(int z = 0; z < no_prod; z++){
            System.out.println(productos[z].toString());
            System.out.println(producto_perecedero[z].toString());

        }
    }
}
