package com.company;

import java.util.Scanner;

public class AgendamentoVoo {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        cadastroTripulacaoPassageiros();

    }

    public static void cadastroTripulacaoPassageiros() {


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
                    passageiros[indexAtual] = Menu.cadastroPassageiro();
                    break;
                case 2:
                    Menu.listaDePassageiros(passageiros);
                    break;
            }
            indexAtual++;
        } while (opcao != 0);
    }
}

