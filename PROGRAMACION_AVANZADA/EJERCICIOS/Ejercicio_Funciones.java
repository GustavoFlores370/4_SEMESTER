package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Scanner;
public class Ejercicio_Funciones {

    public static void main(String[] args){
        Scanner lee = new Scanner(System.in);
        double x = 0.0; 
        double y = 0.0; 
        double z = 0.0; 
        double totalh;
        double totalc;

        System.out.println("Escribe el número de horas de los 3 autos:");

        x = lee.nextDouble();
        y = lee.nextDouble();
        z = lee.nextDouble();
        
        System.out.println("Auto\tHoras\tCosto");
        System.out.println("Auto "+1+"\t"+x+"\t"+estacionamiento(x)+"");
        System.out.println("Auto "+2+"\t"+y+"\t"+estacionamiento(y)+"");
        System.out.println("Auto "+3+"\t"+z+"\t"+estacionamiento(z)+"");
        totalh=x+y+z;
        totalc=estacionamiento(x)+estacionamiento(y)+estacionamiento(z);
        System.out.println("Total\t"+totalh+"\t"+totalc+"");
  
    }
    
        public static double estacionamiento(double horas){
           double costo = 0.0;

            if(horas<=3){
                costo = 2.00;
            }
            else if(horas>3 && horas<24){
                costo = 2.00 + 0.5*(horas-3);
            }
            else if(horas>=24){
                costo = 10.0;
            }
        return costo;
    }
}
