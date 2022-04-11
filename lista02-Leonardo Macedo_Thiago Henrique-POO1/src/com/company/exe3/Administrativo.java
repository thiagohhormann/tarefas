package com.company.exe3;

public class Administrativo extends Assistente{
    String turno;
    double adicionalNoturno = 0;

    public Administrativo(String nome,
                          String endereco,
                          String telefone,
                          String email,
                          long numeroMatricula,
                          String turno,
                          double adicionalNoturno)
    {
        super(nome, endereco, telefone, email, numeroMatricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

}
