package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

import java.util.Scanner;

public class Celular {
    private float saldo;
    private String mi_num;

    public Celular(float s, String n){
        saldo = s;
        mi_num = n;
    }

    public void verSaldo() {
        System.out.println("El saldo es: " + saldo
                + "del telefono: " + mi_num);
    }

    public void llamar() throws InterruptedException {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce el numero a llamar: ");
        String num = lee.nextLine();
        if (saldo >= 5) {
            saldo -= 5;
            System.out.println("Llamando...");
            Thread.sleep(3000);
        } else {
            System.out.println("No tienes saldo.");
        }
    }

    public void enviarMensaje() throws InterruptedException {
        Scanner lee = new Scanner(System.in);
        System.out.println("Introduce el numero: ");
        String num = lee.nextLine();
        System.out.println("Introduce el mensaje: ");
        String msg = lee.nextLine();
        if (saldo >= 1) {
            saldo --;
            System.out.println("Enviando mensaje...");
            Thread.sleep(3000);
        } else {
            System.out.println("No tienes saldo.");
        }
    }



}
