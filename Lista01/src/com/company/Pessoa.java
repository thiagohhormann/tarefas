package com.company;

public class Pessoa {
    private double peso, altura;
    private int idade;
    private String nome;

    public Pessoa(double peso, double altura, int idade, String nome) {
        this.peso = peso;
        this.altura = altura;
        this.idade = idade;
        this.nome = nome;
    }

    private void crescer() {
        this.altura += 0.5;
    }

    public void envelhecer() {
        this.idade ++;

        if (this.idade < 21) {
            this.crescer();
        }
    }

    public void engordar() {
        this.peso += 2;
    }

    public void emagrecer() {
        this.peso -= 1;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
