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

        Passageiro passageiroFirst[] = new Passageiro[9];
        Passageiro passageiroSecond[] = new Passageiro[32];
        Passageiro passageiroThird[] = new Passageiro[64];

        do {

            System.out.println("1. Cadastrar um passageiro de primeira classe; ");
            System.out.println("2. Cadastrar um passageiro de segunda classe: ");
            System.out.println("3. Cadastrar um passageiro de terceira classe: ");
            System.out.println("4. Listar passageiros: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (Passageiro.getNumPassageirosFirstClass() == 8) {
                        System.out.println("Primeira Classe lotada");
                    } else {
                        passageiroFirst[aux1] = new Passageiro();
                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroFirst[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroFirst[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroFirst[aux1].setId(scan.nextInt());
                        Passageiro.incrementaNumPassageirosFirstClass();
                    }
                    break;
                case 2:
                    if (Passageiro.getNumPassageirosSecondClass() == 31)
                        System.out.println("Segunda Classe lotada");
                    else {
                        passageiroSecond[aux1] = new Passageiro();
                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroSecond[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroSecond[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroSecond[aux1].setId(scan.nextInt());
                        Passageiro.incrementaNumPassageirosSecondClass();
                    }
                    break;
                case 3:
                    if (Passageiro.getNumPassageirosThirdClass() == 63) {
                        System.out.println("Terceira Classe lotada");
                    } else {
                        passageiroThird[aux1] = new Passageiro();
                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroThird[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroThird[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroThird[aux1].setId(scan.nextInt());
                        Passageiro.incrementaNumPassageirosThirdClass();
                    }
                    break;
                case 4:
                    System.out.println("Primeira classe: ");
                    for (int i = 0; i < passageiroFirst.length; i++) {
                        if (passageiroFirst[i] != null) {
                            System.out.println("\t" + passageiroFirst[i].getFirstName());
                        }
                    }
                    System.out.println("Segunda classe: ");
                    for (int i = 0; i < passageiroSecond.length; i++) {
                        if (passageiroSecond[i] != null) {
                            System.out.println("\t" + passageiroSecond[i].getFirstName());
                        }
                    }
                    System.out.println("Terceira classe: ");
                    for (int i = 0; i < passageiroThird.length; i++) {
                        if (passageiroThird[i] != null) {
                            System.out.println("\t" + passageiroThird[i].getFirstName());
                        }
                    }
                    System.out.println();
                    break;
            }

        } while (opcao != 0);
    }
}

