package com.company.exe1;


public class Empregado {
    private int codigo;
    private String nome, email;
    double salario;

    public Empregado(int codigo, String nome, String email, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.email = email;
        this.salario = salario;
    }

    public double getSalario() {
        return this.salario;
    }

    public void aumentoSalarial(double percentual) {
        percentual /= 100;
        this.salario += (percentual * this.salario);
    }
}
