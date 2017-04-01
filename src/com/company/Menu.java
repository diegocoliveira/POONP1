package com.company;

import java.util.Scanner;

public class Menu {

    public static Passageiro cadastroPassageiro() {
        Scanner scan = new Scanner(System.in);
        Passageiro passageiro = new Passageiro();
        System.out.print("Digite o primeiro nome do passageiro: ");
        passageiro.setFirstName(scan.next());
        System.out.print("Digite o ultimo nome do passageiro: ");
        passageiro.setLastName(scan.next());
        System.out.print("Digite o id: ");
        passageiro.setId(scan.nextInt());
        return passageiro;
    }

    public static void listaDePassageiros(Passageiro passageiros[]) {
        System.out.println("\nPassageiros: ");
        for (int i = 0; i < passageiros.length; i++) {
            if (passageiros[i] != null) {
                System.out.println("\t" + passageiros[i].getFirstName());
            }
        }
        System.out.println();

    }
}
