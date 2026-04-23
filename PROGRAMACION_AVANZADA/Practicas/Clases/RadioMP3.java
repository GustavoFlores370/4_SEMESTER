package PROGRAMACION_AVANZADA.Practicas.Clases;

public class RadioMP3 {

    public float getFrecuencia() {
        return frecuencia;
    }

    public void setFrecuencia(float frecuencia) {
        this.frecuencia = frecuencia;
    }

    public int getVolumen() {
        return volumen;
    }

    public void setVolumen(int volumen) {
        this.volumen = volumen;
    }

    private float frecuencia;
    private int volumen;

    public RadioMP3(){
        frecuencia = 0.0f;
        volumen = 0;
    }

    public void aumentarFrecuencia(){
        frecuencia = frecuencia + 0.1f;
        System.out.println("Frecuencia: "+frecuencia);
    }

    public void disminuirFrecuencia(){
        frecuencia = frecuencia - 0.1f;
        System.out.println("Frecuencia: "+frecuencia);
    }

    public void subirVolumen(){
        volumen = volumen + 1;
        System.out.println("Volumen: "+volumen);
    }

    public void bajarVolumen(){
        volumen = volumen - 1;
        System.out.println("Volumen: "+volumen);
    }
}