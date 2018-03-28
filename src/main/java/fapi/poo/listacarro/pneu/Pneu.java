package fapi.poo.listacarro.pneu;

public class Pneu {
    protected boolean furada;
    protected float durabilidade;
    protected float percorrido;

    public boolean percorrer(float km){
        percorrido += km;
        if(percorrido >= durabilidade){
            setFurada(true);
            return false;
        }else{
            return true;
        }
    }

    public boolean isFurada() {
        return furada;
    }

    public void setFurada(boolean furada) {
        this.furada = furada;
    }

    public float getDurabilidade() {
        return durabilidade;
    }

    public void setDurabilidade(float durabilidade) {
        this.durabilidade = durabilidade;
    }

    public Pneu(float durabilidade){
        furada = false;
        this.durabilidade = durabilidade;
    }
}
