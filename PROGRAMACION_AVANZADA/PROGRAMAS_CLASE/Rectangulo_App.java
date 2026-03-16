package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class Rectangulo_App {
    public static void main(String[] args){

        Rectangulo salon = new Rectangulo(7f,6.5f);
        Rectangulo alf1 = new Rectangulo(3.8f,4.6f);
        Rectangulo alf2 = new Rectangulo(4.5f,2.3f);

        double area_cub = alf1.calcular_area()+alf2.calcular_area();
        double area_des = salon.calcular_area()-area_cub;

        System.out.println("El area cubierta por las alfombras es: "+area_cub+" m2");
        System.out.println("El area descubierta será de: "+area_des+" m2");



    }
    
}