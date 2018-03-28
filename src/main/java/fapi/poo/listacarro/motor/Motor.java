package fapi.poo.listacarro.motor;

public class Motor {
    protected boolean pronto;

    public float getAutonomia() {
        return autonomia;
    }

    public void setAutonomia(float autonomia) {
        this.autonomia = autonomia;
    }

    protected float autonomia;

    public Motor(float autonomia){
        pronto = true;
        this.autonomia = autonomia;
    }
}
