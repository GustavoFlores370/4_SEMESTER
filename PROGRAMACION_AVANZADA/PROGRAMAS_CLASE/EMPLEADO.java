package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class EMPLEADO {
    public String nombre;
    public String apellido;
    public float salario;

    public float salario_anual(){
        salario=salario*12;
        return salario;
    }

    public void aumento(){
        salario=salario+(salario*0.1f);
    }

    public void informacion(){
        System.out.println("Nombre: "+nombre+" "+apellido);
        System.out.println("Salario Mensual: "+salario);
        System.out.println("Salario Anual: "+salario_anual());
    }
    
}
