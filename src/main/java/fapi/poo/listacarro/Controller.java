package fapi.poo.listacarro;

import fapi.poo.listacarro.carro.Carro;
import fapi.poo.listacarro.carro.FabricaCarro;

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
        String step = scanner.nextLine();

        System.out.printf("Com bluetooth(S/N)>");
        String bluetooth = scanner.nextLine();

        System.out.printf("Com tetoSolar(S/N)>");
        String tetoSolar = scanner.nextLine();

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
            System.out.println("Seu carro ja rodou:"+carro.getKilometragem()+"km");
            System.out.println("Com gasolina restante ele pode percorrer mais "+carro.faltaKmGasolina()+"km");
            if(!carro.andar(10)){
                System.out.println("");
            }
        }
    }
}
