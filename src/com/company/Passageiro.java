package com.company;


public class Passageiro extends Pessoa {
    private static int numPassageirosFirstClass;
    private static int numPassageirosSecondClass;
    private static int numPassageirosThirdClass;

    private ProgamaFidelidade programaFidelidade;

    Passageiro() {

    }

    Passageiro(String firstName, String lastName, int id) {
        super(firstName, lastName, id);
    }

    public static int getNumPassageirosFirstClass() {
        return numPassageirosFirstClass;
    }

    public static void incrementaNumPassageirosFirstClass() {
        Passageiro.numPassageirosFirstClass++;
    }

    public static int getNumPassageirosSecondClass() {
        return numPassageirosSecondClass;
    }

    public static void incrementaNumPassageirosSecondClass() {
        Passageiro.numPassageirosSecondClass++;
    }

    public static int getNumPassageirosThirdClass() {
        return numPassageirosThirdClass;
    }

    public static void incrementaNumPassageirosThirdClass() {
        Passageiro.numPassageirosThirdClass++;
    }
}
