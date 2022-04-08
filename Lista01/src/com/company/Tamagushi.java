package com.company;

public class Tamagushi {
    private String nome;
    private int idade;
    private double fome, saude;

    public Tamagushi(String nome, int idade, double fome, double saude){
        this.nome = nome;
        this.idade = idade;
        this.fome = fome;
        this.saude = saude;
    }

    public void alterarNome(String nome){
        this.nome = nome;
    }

    public void fome() {
        this.fome += 10;
        this.saude -= 5;
    }

    public void saude() {
        this.saude += 10;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getFome() {
        return fome;
    }

    public void setFome(double fome) {
        this.fome = fome;
    }

    public double getSaude() {
        return saude;
    }

    public void setSaude(double saude) {
        this.saude = saude;
    }
}
