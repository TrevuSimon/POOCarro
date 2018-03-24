package fapi.poo.listacarro.carro;

import fapi.poo.listacarro.pneu.FabricaPneu;

public class FabricaCarro {
    public Carro criaCarro(){
        Carro carro = new Carro();
        FabricaPneu pneuFabrica = new FabricaPneu();

        return carro;
    }
}
