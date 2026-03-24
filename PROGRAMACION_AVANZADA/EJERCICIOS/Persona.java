package PROGRAMACION_AVANZADA.EJERCICIOS;


public class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    private double peso;
    private double altura;

    public Persona(){
        nombre = "";
        edad = 0;
        generarDNI();
        sexo = 'H';
        peso = 0;
        altura = 0;
    }

    public Persona(String a, int b, char c){
        nombre = a;
        edad = b;
        generarDNI();
        sexo = c;
        peso = 0;
        altura = 0;
    }

    public Persona(String a, int b, char c, double d, double e){
        nombre = a;
        edad = b;
        generarDNI();
        sexo = c;
        peso = d;
        altura = e;
    }

    public int calcularIMC(){
        double imc = peso / Math.pow(altura,2);
        int val =0;
            if(imc < 20){
                val= -1;
            }
            else if(imc >= 20 && imc <=25){
                val = 0;
            }
            else if(imc > 25){
                val= 1;
            }

        return val;
    }

    public boolean esMayorDeEdad(){
        boolean resultado;
        if(edad < 18){
            resultado = false;
        }
        else{
            resultado = true;
        }
    return resultado;
    }

    private char comprobarSexo(char sexo){
        char resultado =' ';
        if(sexo == 'H' || sexo == 'M'){
            resultado = sexo;
        }
        else{
            resultado = 'H'; 
        }

        return resultado;
    }

    public void imprimir(){
        System.out.println("Nombre: "+nombre+"\nEdad: "+edad+"\nDNI: "+dni+"\nSexo: "+comprobarSexo(sexo)+"\nPeso: "+peso+"\nAltura: "+altura);
    }

    private void generarDNI(){
        int dniNumero = (int)(Math.random() * 90000000) + 10000000;
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        char dniLetra = letras.charAt(dniNumero % 23);

        dni = dniNumero + ""+ dniLetra;

    }

    
}