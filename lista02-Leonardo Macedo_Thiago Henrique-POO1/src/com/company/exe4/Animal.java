package com.company.exe4;

public class Animal {
    private String nome, raca;

    public Animal(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String caminha() {
        return this.nome + " Caminha";
    }
}
