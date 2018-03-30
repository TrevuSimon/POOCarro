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

    public void relatorioFimViagem(){
        System.out.println(" -  -  -  -  -");
        System.out.println("Você ainda tem "+this.tanque.getGasolinaTanque()+"L sobrando");
        for (int i = 0;i<4;i++){
            System.out.println("Pneu["+i+"] tem ainda "+(this.pneu[i].getDurabilidade()-this.pneu[i].getPercorrido())+"km para andar!");
        }
    }

    public boolean furarPneu(){
        pneu[0] = null;
        if(!(stepPneu == null)){
            pneu[0] = stepPneu;
            stepPneu = null;
            System.out.println("Seu pneu furou mas você tinha um step e ja foi trocado!");
            return true;
        }
        return false;
    }

    public void toggleConnectarBluetooth(){
        this.bluetooth.toggleConnectarBluetooth();
    }

    public void toggleTetosolar(){
        this.tetoSolar.toggleTetoSolar();
    }

    public float faltaKmGasolina(){
        return (this.motor.getAutonomia() * this.tanque.getGasolinaTanque());
    }

    public int andar(float km){
        int check = 0;
        kilometragem += km;
        for (int i = 0;i < 4;i++){
            if(!this.pneu[i].percorrer(km)){
                if(check == 0){check = 1}
            }
        }
        if(check == 1) return 1;
        if(!this.tanque.queimar(km,this.motor.getAutonomia())){
            return 2;
        }
        return 0;
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
