package com.company;

public class Assento {
    private int num;
    private char fileira;
    private EnumAlimentacao tipoAlimentacao;
    private double largura;
    private double comprimento;

    Assento(int num, char fileira, EnumAlimentacao tipoAlimentacao, double largura, double comprimento) {
        this.num = num;
        this.fileira = fileira;
        this.tipoAlimentacao = tipoAlimentacao;
        this.largura = largura;
        this.comprimento = comprimento;
    }
}
