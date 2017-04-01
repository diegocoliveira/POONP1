package com.company;

import java.util.Scanner;

public class AgendamentoVoo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CadastroTripulacaoPassageiros();

    }

    public static void CadastroTripulacaoPassageiros() {


        int opcao = 0, aux1 = 0, aux2 = 0, aux3 = 0;

        Piloto piloto = new Piloto("Daniel", "Carmo", 12);

        CoPiloto copiloto = new CoPiloto("Joel", "Carmo", 13);

        ComissionarioBordo comissionariosDeBordo[] = new ComissionarioBordo[]{
                new ComissionarioBordo("Dandara", "Carmo", 1),
                new ComissionarioBordo("Dandara", "Carmo", 2),
                new ComissionarioBordo("Dandara", "Carmo", 3),
                new ComissionarioBordo("Dandara", "Carmo", 4)
        };

        Passageiro passageiros[] = new Passageiro[303];

        do {
            System.out.println("***************************");
            System.out.println("*          AirFor         *");
            System.out.println("***************************");
            System.out.println();
            System.out.println("1. Cadastrar passageiro. ");
            System.out.println("2. Listar passageiros. ");
            System.out.print("Digite sua opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (Passageiro.getNumPassageirosFirstClass() == 8) {
                        System.out.println("Primeira Classe lotada");
                    } else {
                        passageiros[aux1] = new Passageiro();
                        System.out.print("Digite o primeiro nome do passageiro: ");
                        passageiros[aux1].setFirstName(scan.next());
                        System.out.print("Digite o ultimo nome do passageiro: ");
                        passageiros[aux1].setLastName(scan.next());
                        System.out.print("Digite o id: ");
                        passageiros[aux1].setId(scan.nextInt());
                        Passageiro.incrementaNumPassageirosFirstClass();
                    }
                    break;
                case 2:
                    System.out.println("\nPassageiros: ");
                    for (int i = 0; i < passageiros.length; i++) {
                        if (passageiros[i] != null) {
                            System.out.println("\t" + passageiros[i].getFirstName());
                        }
                    }
                    System.out.println();
                    break;
            }

        } while (opcao != 0);
    }
}

