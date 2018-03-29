package fapi.poo.listacarro.tanque;

public class Tanque {
    protected boolean pronto;
    protected float capacidade;
    protected float gasolinaTanque;

    public boolean queimar(float km, float autonomia){
        gasolinaTanque = gasolinaTanque - km/autonomia;
        if(gasolinaTanque > 0){
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
        this.gasolinaTanque = capacidade;
    }

    public float getGasolinaTanque() {
        return gasolinaTanque;
    }

    public void setGasolinaTanque(float gasolinaTanque) {
        this.gasolinaTanque = gasolinaTanque;
    }
}
