package fapi.poo.listacarro.carro;

import fapi.poo.listacarro.banco.Banco;
import fapi.poo.listacarro.banco.FabricaBanco;
import fapi.poo.listacarro.motor.FabricaMotor;
import fapi.poo.listacarro.pneu.FabricaPneu;
import fapi.poo.listacarro.pneu.Pneu;
import fapi.poo.listacarro.porta.FabricaPorta;
import fapi.poo.listacarro.porta.Porta;
import fapi.poo.listacarro.roda.FabricaRoda;
import fapi.poo.listacarro.roda.Roda;
import fapi.poo.listacarro.tanque.FabricaTanque;

public class FabricaCarro {
    public Carro criaCarro(){
        Carro carro = new Carro();
        FabricaBanco fabricaBanco = new FabricaBanco();
        FabricaMotor fabricaMotor = new FabricaMotor();
        FabricaPneu fabricaPneu = new FabricaPneu();
        FabricaTanque fabricaTanque = new FabricaTanque();
        FabricaPorta fabricaPorta = new FabricaPorta();
        FabricaRoda fabricaRoda = new FabricaRoda();

        //Banco
        Banco banco[] = new Banco[3];
        banco[0] = fabricaBanco.criaBanco();
        banco[1] = fabricaBanco.criaBanco();
        banco[2] = fabricaBanco.criaBanco();
        carro.setBanco(banco);

        //motor
        carro.setMotor(fabricaMotor.criaMotor());

        //pneu
        Pneu pneu[] = new Pneu[4];
        pneu[0] = fabricaPneu.criaPneu();
        pneu[1] = fabricaPneu.criaPneu();
        pneu[2] = fabricaPneu.criaPneu();
        pneu[3] = fabricaPneu.criaPneu();
        carro.setPneu(pneu);

        //tanque
        carro.setTanque(fabricaTanque.criaTanque());

        //Porta
        Porta porta[] = new Porta[4];
        porta[0] = fabricaPorta.criaPorta();
        porta[1] = fabricaPorta.criaPorta();
        porta[2] = fabricaPorta.criaPorta();
        porta[3] = fabricaPorta.criaPorta();
        carro.setPorta(porta);

        //Roda
        Roda roda[] = new Roda[4];
        roda[0] = fabricaRoda.criaRoda();
        roda[1] = fabricaRoda.criaRoda();
        roda[2] = fabricaRoda.criaRoda();
        roda[3] = fabricaRoda.criaRoda();
        carro.setRoda(roda);


        return carro;
    }
}
