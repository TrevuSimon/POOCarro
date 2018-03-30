package fapi.poo.listacarro.bluetooth;

public class Bluetooth {
    protected boolean pronto;
    protected boolean conectado;

    public void toggleConnectarBluetooth(){
        if(!this.conectado){
            this.conectado = false;
            System.out.println("Celular conectado!");
        }else{
            this.conectado = true;
            System.out.println("Celular desconectado!");
        }
    }

    public Bluetooth(){
        this.pronto = true;
        this.conectado = false;
    }
}
