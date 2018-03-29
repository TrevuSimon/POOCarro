package fapi.poo.listacarro.tetosolar;

public class TetoSolar {
    protected boolean pronto;
    protected boolean aberto;

    public TetoSolar(){
        this.pronto = true;
        this.aberto = false;
    }

    public void toggleTetoSolar(){
        if(!this.aberto){
            this.aberto = true;
            System.out.println("Teto solar aberto");
        }else{
            this.aberto = false;
            System.out.println("Teto solar Fechado");
        }
    }
}