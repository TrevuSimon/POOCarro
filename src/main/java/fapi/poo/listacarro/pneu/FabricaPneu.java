package fapi.poo.listacarro.pneu;

public class FabricaPneu {
    public Pneu criaPneu(float durabilidade){
        return new Pneu(durabilidade);
    }
}
