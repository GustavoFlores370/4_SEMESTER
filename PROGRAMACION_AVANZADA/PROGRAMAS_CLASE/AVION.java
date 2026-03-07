package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class AVION {
    public float velocidad_inicial;
    public float velocidad_final;
    public float tiempo;
    public float aceleracion;

    public float calcular_aceleracion(){
        aceleracion=(velocidad_final-velocidad_inicial)/tiempo;
        return aceleracion;

    }

    public void imprimir_informacion(){
        System.out.println("Velocidad Inicial: "+velocidad_inicial);
        System.out.println("Velocidad Final: "+velocidad_final);
        System.out.println("Tiempo: "+tiempo);
        System.out.println("Aceleracion: "+aceleracion);

    }
    
}
