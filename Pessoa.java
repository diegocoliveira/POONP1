package com.company;

public class Pessoa {

    private String firstName;
    private String lastName;
    private int id;
    private int cpf;
    private int numero;

    Pessoa() {

    }

    Pessoa(String firstName, String lastName, int id, int cpf, int numero) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.cpf = cpf;
        this.numero = numero;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
