package fapi.poo.listacarro.tanque;

public class FabricaTanque {
    public Tanque criaTanque(float litrosTanque){
        return new Tanque(litrosTanque);
    }
}
