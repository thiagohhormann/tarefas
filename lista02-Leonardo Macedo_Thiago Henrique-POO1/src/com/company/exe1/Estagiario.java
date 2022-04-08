package com.company.exe1;

public class Estagiario extends Empregado {
    private int descontos;

    public Estagiario(int codigo, String nome, String email, double salario, int descontos) {
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }

    public void aumentoSalarial(int percentual) {
        this.salario += ((percentual / 100) * this.salario) - (this.descontos / 100);
    }
}
