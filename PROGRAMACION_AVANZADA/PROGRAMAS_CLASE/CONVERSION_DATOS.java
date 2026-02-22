package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;
import java.util.Scanner;
public class CONVERSION_DATOS {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner lee = new Scanner(System.in);

        String  cadena = Integer.toString(1000);
        int v1 = Integer.parseInt(cadena);
        double v2 = Double.parseDouble(cadena);
        float v3 =  Float.parseFloat(cadena);
        String hex = Integer.toHexString(v1);
        String oct = Integer.toOctalString(v1);
        
        System.out.println(cadena);
        System.out.println(v1);
        System.out.println(v2);
        System.out.println(v3);
        System.out.println(hex);
        System.out.println(oct);

        String dolarT;
        String euroT;
        System.out.println("Ingresa la cantidad de dolares: ");
        dolarT = lee.nextLine();
        System.out.println("Ingresa la cantidad de euros: ");
        euroT = lee.nextLine();

        double dolar = Double.parseDouble(dolarT);
        double euro = Double.parseDouble(euroT);

        double tasaDolar = 17.12;
        double tasaEuro = 20.16;

        double pesoDolar = dolar * tasaDolar;
        double pesoEuro = euro * tasaEuro;

        System.out.println("\n "+euro+" euros equivalen a: " + pesoEuro + " pesos");
        System.out.println("\n "+dolar+" dolares equivalen a: " + pesoDolar + " pesos");




    }
    
}
