package com.company.exe3;

public class Assistente extends Funcionario {
    private long numeroMatricula;

    public Assistente (String nome, String endereco, String telefone, String email, long numeroMatricula) {
        super(nome, endereco, telefone, email);
        this.numeroMatricula = numeroMatricula;
    }

    public long getNumeroMatricula() {
        return numeroMatricula;
    }
}
