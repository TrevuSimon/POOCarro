package fapi.poo.listacarro;

import fapi.poo.listacarro.carro.Carro;
import fapi.poo.listacarro.carro.FabricaCarro;
import fapi.poo.listacarro.pneu.Pneu;

public class Main {

    public static void main(String[] args) {

        FabricaCarro fabrica = new FabricaCarro();

        Carro meucarro = fabrica.criaCarro();
        Carro carrodohallyson = fabrica.criaCarro();



    }

}
