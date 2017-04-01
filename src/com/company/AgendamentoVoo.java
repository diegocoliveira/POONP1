package com.company;

import java.util.Scanner;

public class AgendamentoVoo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CadastroTripulacaoPassageiros();

    }

    public static void CadastroTripulacaoPassageiros() {


        int opcao = 0, indexAtual = 0;

        Piloto pilotoDaniel = new Piloto("Daniel", "Carmo", 12);
        Piloto pilotoVinicus = new Piloto("Vinicius", "Carmo", 11);
        Piloto pilotoAlexandre = new Piloto("Alexandre", "Carmo", 15);

        CoPiloto coPilotoJoel = new CoPiloto("Joel", "Carmo", 13);
        CoPiloto coPilotoLuis = new CoPiloto("Luis", "Rios", 14);
        CoPiloto coPilotoYuri = new CoPiloto("Yuri", "Carmo", 25);

        ComissionarioBordo comissionariosDeBordoEquipe1[] = new ComissionarioBordo[]{
                new ComissionarioBordo("Dandara", "Carmo", 1),
                new ComissionarioBordo("Dandara", "Carmo", 2),
                new ComissionarioBordo("Dandara", "Carmo", 3),
                new ComissionarioBordo("Dandara", "Carmo", 4)
        };

        ComissionarioBordo comissionariosDeBordoEquipe2[] = new ComissionarioBordo[]{
                new ComissionarioBordo("Dandara", "Carmo", 1),
                new ComissionarioBordo("Dandara", "Carmo", 2),
                new ComissionarioBordo("Dandara", "Carmo", 3),
                new ComissionarioBordo("Dandara", "Carmo", 4)
        };

        ComissionarioBordo comissionariosDeBordoEquipe3[] = new ComissionarioBordo[]{
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
                    passageiros[indexAtual] = new Passageiro();
                    System.out.print("Digite o primeiro nome do passageiro: ");
                    passageiros[indexAtual].setFirstName(scan.next());
                    System.out.print("Digite o ultimo nome do passageiro: ");
                    passageiros[indexAtual].setLastName(scan.next());
                    System.out.print("Digite o id: ");
                    passageiros[indexAtual].setId(scan.nextInt());
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
            indexAtual++;
        } while (opcao != 0);
    }
}

