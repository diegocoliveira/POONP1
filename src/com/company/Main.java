package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        CadastroTripulaçãoPassageiros();

    }

    public static void CadastroTripulaçãoPassageiros() {


        int opcao = 0, aux1 = 0, aux2 = 0, aux3 = 0;

        Piloto piloto = new Piloto("Daniel", "Carmo", 12, 12, 12);

        CoPiloto copiloto = new CoPiloto("Joel", "Carmo", 13, 13, 24);

        ComissionarioBordo comissionarioBordo[] = new ComissionarioBordo[]{
                new ComissionarioBordo("Dandara", "Carmo", 14, 14, 25),
                new ComissionarioBordo("Dandara", "Carmo", 14, 14, 25),
                new ComissionarioBordo("Dandara", "Carmo", 14, 14, 25),
                new ComissionarioBordo("Dandara", "Carmo", 14, 14, 25)
        };

        Passageiro passageiroFirst[] = new Passageiro[9];
        Passageiro passageiroSecond[] = new Passageiro[32];
        Passageiro passageiroThird[] = new Passageiro[64];

        for (int i = 0; i < passageiroFirst.length; i++) {
            passageiroFirst[i] = new Passageiro();
        }
        for (int i = 0; i < passageiroSecond.length; i++) {
            passageiroSecond[i] = new Passageiro();
        }
        for (int i = 0; i < passageiroThird.length; i++) {
            passageiroThird[i] = new Passageiro();
        }
        do {

            System.out.println("Digite 1 para cadastrar um passageiro de primeira classe; ");
            System.out.println("Digite 2 para cadastrar um passageiro de segunda classe: ");
            System.out.println("Digite 3 para cadastrar um passageiro de terceira classe: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    if (Passageiro.getNumPassageirosFirstClass() == 8)
                        System.out.println("Primeira Classe lotada");

                    else {
                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroFirst[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroFirst[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroFirst[aux1].setId(scan.nextInt());
                        System.out.println("Digite o cpf: ");
                        passageiroFirst[aux1].setCpf(scan.nextInt());
                        System.out.println("Digite o numero para contato: ");
                        passageiroFirst[aux1].setNumero(scan.nextInt());
                        Passageiro.setNumPassageirosFirstClass(1);
                        // puxar numero do voo, origem, destino e assento de outras classes
                    }
                    break;
                case 2:
                    if (Passageiro.getNumPassageirosSecondClass() == 31)
                        System.out.println("Segunda Classe lotada");

                    else {

                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroSecond[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroSecond[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroSecond[aux1].setId(scan.nextInt());
                        System.out.println("Digite o cpf: ");
                        passageiroFirst[aux1].setCpf(scan.nextInt());
                        System.out.println("Digite o numero para contato: ");
                        passageiroSecond[aux1].setNumero(scan.nextInt());
                        Passageiro.setNumPassageirosSecondClass(1);
                    }
                    // puxar numero do voo, origem, destino e assento de outras classes
                    break;
                case 3:
                    if (Passageiro.getNumPassageirosThirdClass() == 63)
                        System.out.println("Terceira Classe lotada");

                    else {

                        System.out.println("Digite o primeiro nome do passageiro: ");
                        passageiroThird[aux1].setFirstName(scan.next());
                        System.out.println("Digite o ultimo nome do passageiro: ");
                        passageiroThird[aux1].setLastName(scan.next());
                        System.out.println("Digite o id: ");
                        passageiroThird[aux1].setId(scan.nextInt());
                        System.out.println("Digite o cpf: ");
                        passageiroThird[aux1].setCpf(scan.nextInt());
                        System.out.println("Digite o numero para contato: ");
                        passageiroThird[aux1].setNumero(scan.nextInt());
                        Passageiro.setNumPassageirosThirdClass(1);
                    }
                    // puxar numero do voo, origem, destino e assento de outras classes


                    break;
            }

        } while (opcao != 0);
    }
}

