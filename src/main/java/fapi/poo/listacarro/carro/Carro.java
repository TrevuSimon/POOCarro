package fapi.poo.listacarro.carro;

import fapi.poo.listacarro.banco.Banco;
import fapi.poo.listacarro.bluetooth.Bluetooth;
import fapi.poo.listacarro.motor.Motor;
import fapi.poo.listacarro.pneu.Pneu;
import fapi.poo.listacarro.porta.Porta;
import fapi.poo.listacarro.roda.Roda;
import fapi.poo.listacarro.tanque.Tanque;
import fapi.poo.listacarro.tetosolar.TetoSolar;

public class Carro {
    protected Motor motor;
    protected Roda roda[] = new Roda[4];
    protected Pneu pneu[] = new Pneu[4];
    protected Banco banco[] = new Banco[3];
    protected Porta porta[] = new Porta[4];
    protected Tanque tanque;
    protected float kilometragem;
    protected Roda stepRoda;
    protected Pneu stepPneu;
    protected Bluetooth bluetooth;
    protected TetoSolar tetoSolar;



    public Carro(Motor motor, Roda[] roda, Pneu[] pneu, Banco[] banco, Porta[] porta, Tanque tanque){
        this.motor = motor;
        this.roda = roda;
        this.pneu = pneu;
        this.banco = banco;
        this.porta = porta;
        this.tanque = tanque;
        this.kilometragem = 0;
    }


    public float faltaKmGasolina(){
        return (this.motor.getAutonomia() * this.tanque.getCapacidade());
    }

    public boolean andar(float km){
        kilometragem += km;
        for (int i = 0;i < 4;i++){
            if(!this.pneu[i].percorrer(km)){
                return false;
            }
            if(!this.tanque.queimar(km,this.motor.getAutonomia())){
                return false;
            }
        }
        return true;
    }

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

    public float getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(float kilometragem) {
        this.kilometragem = kilometragem;
    }

    public Roda getStepRoda() {
        return stepRoda;
    }

    public void setStepRoda(Roda stepRoda) {
        this.stepRoda = stepRoda;
    }

    public Pneu getStepPneu() {
        return stepPneu;
    }

    public void setStepPneu(Pneu stepPneu) {
        this.stepPneu = stepPneu;
    }

    public Bluetooth getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Bluetooth bluetooth) {
        this.bluetooth = bluetooth;
    }

    public TetoSolar getTetoSolar() {
        return tetoSolar;
    }

    public void setTetoSolar(TetoSolar tetoSolar) {
        this.tetoSolar = tetoSolar;
    }
}
