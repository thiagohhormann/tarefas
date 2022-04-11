package com.company.exe1;

public class Estagiario extends Empregado {
    private double descontos;

    public Estagiario(int codigo, String nome, String email, double salario, double descontos) {
        super(codigo, nome, email, salario);
        this.descontos = descontos;
    }

    public void aumentoSalarial(double percentual) {
        percentual /= 100;
        this.descontos /= 100;
        this.salario += (percentual  * this.salario) - (this.descontos);
    }
}
