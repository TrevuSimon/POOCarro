package fapi.poo.listacarro.tanque;

public class Tanque {
    protected boolean pronto;
    protected float capacidade;

    public boolean queimar(float km, float autonomia){
        capacidade = capacidade - km/autonomia;
        if(capacidade > 0){
            return true;
        }else {
            return false;
        }
    }

    public float getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(float capacidade) {
        this.capacidade = capacidade;
    }

    public Tanque(float capacidade){
        pronto = true;
        this.capacidade = capacidade;
    }
}
