package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class EMPLEADO_APP {
    public static void main(String[] args){
        EMPLEADO emp1 = new EMPLEADO();
        EMPLEADO emp2 = new EMPLEADO();

        emp1.nombre = "Juan";
        emp1.apellido = "Perez";
        emp1.salario = 8000;

        emp2.nombre = "Ana";
        emp2.apellido = "Lopez";
        emp2.salario = 10000;

        System.out.println("Salarios anuales actuales:");
        emp1.informacion();
        emp2.informacion();

        emp1.aumento();
        emp2.aumento();

        System.out.println("Salarios anuales con aumento del 10%:");
        emp1.informacion();
        emp2.informacion();
    }
    
}
