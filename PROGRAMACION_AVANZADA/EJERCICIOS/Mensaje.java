package PROGRAMACION_AVANZADA.EJERCICIOS;

public class Mensaje {
    private String msg;

    public Mensaje(){
        msg = "";
    }

    public Mensaje(String a){
        msg = a;
    }

    public void mostrar_mensaje(){
        System.out.println("Este es el mensaje: "+msg);
    }

    public void quitar_espacios(){
        String newmsg = msg.replace(' ', '\n');
        System.out.println("Mensaje sin espacios: "+newmsg);
    }

    public void convertir_minusculas(){
        String newmsG = msg.toLowerCase();
        System.out.println("Mensaje en minúsculas: "+newmsG);
    }
    
}
