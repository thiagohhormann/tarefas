package com.company.exe1;

public class Chefe extends Empregado{
    private double beneficio;

    public Chefe (int codigo, String nome, String email, double salario, double beneficio) {
        super(codigo, nome, email, salario);
        this.beneficio = beneficio;
    }

    public void aumentoSalarial(double percentual) {
        percentual /= 100;
        this.salario += (percentual * this.salario) + this.beneficio;
    }
}
