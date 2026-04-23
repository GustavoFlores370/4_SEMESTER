package PROGRAMACION_AVANZADA.Practicas.Clases;

public class Factura {
    private String fecha;
    private int no_prod;
    private int no_prod_perec;
    private float total;

    public Factura(String fecha, int no_prod, int no_prod_perec, float total){
        this.fecha = fecha;
        this.no_prod = no_prod;
        this.no_prod_perec = no_prod_perec;
        this.total = total;
    }

    public void calcular_total(){
        System.out.println("\t\t\t\tSubtotal:");
        System.out.println("\t\t\t\tIVA:");
        System.out.println("\t\t\t\tTotal:");

    }
}
