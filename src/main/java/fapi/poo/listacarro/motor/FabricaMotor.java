package fapi.poo.listacarro.motor;

public class FabricaMotor {
    public Motor criaMotor(float autonomia){
        return new Motor(autonomia);
    }
}
