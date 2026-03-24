package PROGRAMACION_AVANZADA.EJERCICIOS;
import java.util.Random;

public class Password {
    private int longitud;
    private String contraseña;

    public Password(){
        longitud = 8;
        generarPassword();
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Password(int a){
        longitud = a;
        generarPassword();
    }

    public boolean esFuerte(){
        boolean seguridad;
        int mayus = 0;
        int minus = 0;
        int num = 0;
        for(int i = 0; i < longitud; i++){
            char c = contraseña.charAt(i);

            if(Character.isUpperCase(c)){
                mayus++;
            }
            else if(Character.isLowerCase(c)){
                minus++;
            }
            else if(Character.isDigit(c)){
                num++;
            }
        }
        if(mayus>2 && minus>1 && num>5){
            seguridad = true;
        }
        else{
            seguridad = false;
        }
        return seguridad;
    }

    public String generarPassword(){
        String caracteres = "ABCDEFGHIJKLMNÑOPQRSTUVWXYZ"
                          + "abcdefghijklmnñopqrstuvwxyz"
                          + "0123456789";
        Random random = new Random();
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < longitud; i++){
            int indice = random.nextInt(caracteres.length());
            sb.append(caracteres.charAt(indice));
        }
        contraseña = sb.toString();
        return contraseña;
    }
    
}
