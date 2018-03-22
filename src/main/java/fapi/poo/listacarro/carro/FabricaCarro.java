package fapi.poo.listacarro.carro;

import fapi.poo.listacarro.pneu.Pneu;

public class FabricaCarro {
    public Carro criaCarro(){
        Carro carro = new Carro();

        Pneu pneu0 = new Pneu();
        Pneu pneu1 = new Pneu();
        Pneu pneu2 = new Pneu();
        Pneu pneu3 = new Pneu();

        carro.pneu[0] = pneu0;
        carro.pneu[1] = pneu1;
        carro.pneu[2] = pneu2;
        carro.pneu[3] = pneu3;


        
        return carro;
    }
}
