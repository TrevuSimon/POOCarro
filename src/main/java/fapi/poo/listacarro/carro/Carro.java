package fapi.poo.listacarro.carro;

import fapi.poo.listacarro.banco.Banco;
import fapi.poo.listacarro.motor.Motor;
import fapi.poo.listacarro.pneu.Pneu;
import fapi.poo.listacarro.porta.Porta;
import fapi.poo.listacarro.roda.Roda;
import fapi.poo.listacarro.tanque.Tanque;

public class Carro {
    protected Motor motor;
    protected Roda roda[] = new Roda[4];
    protected Pneu pneu[] = new Pneu[4];
    protected Banco banco[] = new Banco[3];
    protected Porta porta[] = new Porta[4];
    protected Tanque tanque;

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public Roda[] getRoda() {
        return roda;
    }

    public void setRoda(Roda[] roda) {
        this.roda = roda;
    }

    public Pneu[] getPneu() {
        return pneu;
    }

    public void setPneu(Pneu[] pneu) {
        this.pneu = pneu;
    }

    public Banco[] getBanco() {
        return banco;
    }

    public void setBanco(Banco[] banco) {
        this.banco = banco;
    }

    public Porta[] getPorta() {
        return porta;
    }

    public void setPorta(Porta[] porta) {
        this.porta = porta;
    }

    public Tanque getTanque() {
        return tanque;
    }

    public void setTanque(Tanque tanque) {
        this.tanque = tanque;
    }
}
