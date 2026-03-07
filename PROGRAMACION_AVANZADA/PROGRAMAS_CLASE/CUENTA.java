package PROGRAMACION_AVANZADA.PROGRAMAS_CLASE;

public class CUENTA {
    public float saldo;

    public void depositar(float monto){
        saldo = saldo + monto;
    }

    public void retirar(float monto){
        if(monto <= saldo){
            saldo = saldo - monto;
        } else {
            System.out.println("No hay saldo suficiente.");
        }
    }

    public float saldo_final(){
        return saldo;
    }
    
}
