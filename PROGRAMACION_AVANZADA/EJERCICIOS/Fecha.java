package PROGRAMACION_AVANZADA.EJERCICIOS;

import java.time.LocalDateTime;

public class Fecha {
    private int dia;
    private int mes;
    private int año;

    public int getDia() { return dia; }
    public void setDia(int dia) { this.dia = dia; }

    public int getMes() { return mes; }
    public void setMes(int mes) { this.mes = mes; }

    public int getAño() { return año; }
    public void setAño(int anio) { this.año = anio; }

    public void iniciar_fecha() {
        LocalDateTime ahora = LocalDateTime.now();
        this.dia = ahora.getDayOfMonth();
        this.mes = ahora.getMonthValue();
        this.año = ahora.getYear();
    }

    public void imprimir() {
        System.out.println("Fecha actual: " + dia + "/" + mes + "/" + año);
    }
    
}
