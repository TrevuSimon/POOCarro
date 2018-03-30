package fapi.poo.listacarro;

import fapi.poo.listacarro.carro.Carro;
import fapi.poo.listacarro.carro.FabricaCarro;

import java.io.IOException;
import java.util.Scanner;

public class Controller {
    private Scanner scanner = new Scanner(System.in);
    private Carro carro;

    public void criarCarro(){
        System.out.printf("KM/l>");
        float autonomia = scanner.nextFloat();

        System.out.printf("Durabilidade dos pneus>");
        float durabilidade = scanner.nextFloat();

        System.out.printf("Tanque em L>");
        float litrosTanque = scanner.nextFloat();

        System.out.printf("Com step(S/N)>");
        String step = scanner.next();

        System.out.printf("Com bluetooth(S/N)>");
        String bluetooth = scanner.next();

        System.out.printf("Com tetoSolar(S/N)>");
        String tetoSolar = scanner.next();

        FabricaCarro fabricaCarro = new FabricaCarro();
        carro = fabricaCarro.criaCarro(litrosTanque,autonomia,durabilidade, step, bluetooth, tetoSolar);

        System.out.println("Agora que esta tudo OK, vamos prosseguir!");
    }

    public void start(){
        System.out.println("Bom dia, qual seu nome?");
        String nome = scanner.nextLine();

        System.out.println("Ok "+nome+", pedimos para que digite os dados do seu carro:");
        criarCarro();



        while(carro.getKilometragem() <= 500){
            System.out.println();
            System.out.println("-  -  -  -  -  -  - ");
            System.out.println();
            int check = carro.andar(10);

            if(check > 0){
                System.out.println("Opa! carro não pode andar mais");
                if(check == 1){
                    System.out.println("Seus pneus não aguentam mais, sua jornada ja era!");
                    break;
                }
                if(check == 2){
                    System.out.println("Sem gasolina meu amigo, Ja era pra você!");
                    break;
                }
            }

            System.out.println("Seu carro ja rodou:"+carro.getKilometragem()+"km");
            System.out.println("Com gasolina restante ele pode percorrer mais "+carro.faltaKmGasolina()+"km");

            System.out.print("... Pressine qualquer tecla para andar + 10km...");
            try {
                System.in.read();
            } catch (IOException e) {
                e.printStackTrace();
            }


            if(carro.getKilometragem() == 220){
                if(carro.getTetoSolar() == null){
                    System.out.println("Seu carro nao tem teto solar!");
                }else{
                    carro.toggleTetosolar();
                }
            }else if(carro.getKilometragem() == 240){
                if(carro.getTetoSolar() == null){
                    System.out.println("Seu carro nao tem teto solar!");
                }else{
                    carro.toggleTetosolar();
                }
            }else if(carro.getKilometragem() == 350){
                if(carro.getTetoSolar() == null){
                    System.out.println("Seu carro nao tem teto solar!");
                }else{
                    carro.toggleTetosolar();
                }
            }else if(carro.getKilometragem() == 390){
                if(carro.getTetoSolar() == null){
                    System.out.println("Seu carro nao tem teto solar!");
                }else{
                    carro.toggleTetosolar();
                }
            }else if(carro.getKilometragem() == 370){
                if(carro.getBluetooth() == null){
                    System.out.println("Seu carro não tem bluetooth");
                }else{
                    carro.toggleConnectarBluetooth();
                }
            }else if(carro.getKilometragem() == 400){
                if(!carro.furarPneu()){
                    System.out.println("Sem step para trocar o pneu furado! sua viagem acaba aqui meu amigo.");
                    break;
                }
            }
        }
        System.out.println("Fim da viagem!");
        carro.relatorioFimViagem();
        System.out.print("... Pressine qualquer sair...");
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
