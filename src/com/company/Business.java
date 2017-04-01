package com.company;

public class Business extends Assento {

    private double preco;
    private double taxaCancelamento;
    private int prioridade;

    Business(double preco, double taxaCancelamento, int prioridade, int num, char fileira, EnumAlimentacao tipoAlimentacao, double largura, double comprimento) {
        super(num, fileira, tipoAlimentacao, largura, comprimento);
        this.preco = preco;
        this.taxaCancelamento = taxaCancelamento;
        this.prioridade = prioridade;
    }

}
