package com.company.exe6;

public class Pobre extends Pessoa{
    public double dinheiro, salario;

    public Pobre(String nome, int idade) {
        super(nome, idade);
        this.salario = salario;
    }

    public void trabalha() {
        this.dinheiro += this.salario;
    }

    public double getSalario() {
        return this.salario;
    }
}
