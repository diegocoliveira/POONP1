package com.company;


public class Passageiro extends Pessoa {
    private static int numPassageirosFirstClass;
    private static int numPassageirosSecondClass;
    private static int numPassageirosThirdClass;
    private double codigoVoo;
    private String origem;
    private String destino;
    private String Assento;

    Passageiro() {

    }

    Passageiro(String firstName, String lastName, int id, int cpf, int numero) {
        super(firstName, lastName, id, cpf, numero);

    }

    public static int getNumPassageirosFirstClass() {
        return numPassageirosFirstClass;
    }

    public static void setNumPassageirosFirstClass(int numPassageirosFirstClass) {
        Passageiro.numPassageirosFirstClass += numPassageirosFirstClass;
    }

    public static int getNumPassageirosSecondClass() {
        return numPassageirosSecondClass;
    }

    public static void setNumPassageirosSecondClass(int numPassageirosSecondClass) {
        Passageiro.numPassageirosSecondClass += numPassageirosSecondClass;
    }

    public static int getNumPassageirosThirdClass() {
        return numPassageirosThirdClass;
    }

    public static void setNumPassageirosThirdClass(int numPassageirosThirdClass) {
        Passageiro.numPassageirosThirdClass += numPassageirosThirdClass;
    }

    public double getCodigoVoo() {
        return codigoVoo;
    }

    public void setCodigoVoo(double codigoVoo) {
        this.codigoVoo = codigoVoo;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }
}
