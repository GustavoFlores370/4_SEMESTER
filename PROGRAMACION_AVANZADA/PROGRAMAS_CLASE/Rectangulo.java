package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class Rectangulo {

    private float base;
    private float altura;

    public Rectangulo() {
        base = 2.4f;
        altura = 3.1f;
    }

    public Rectangulo(float a, float b) {
        base = b;
        altura = a;
    }

    public double calcular_area() {
        return base * altura;
    }

    public double calcular_perimetro() {
        return 2 * (base + altura);
    }

    public void imprimir() {
        System.out.println("Base: " + base + "\nAltura: " + altura);

    }

}
