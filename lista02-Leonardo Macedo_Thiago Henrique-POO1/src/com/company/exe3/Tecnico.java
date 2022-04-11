package com.company.exe3;

public class Tecnico extends Assistente {
    private double bonusSalarial;

    public Tecnico(
            String nome,
            String endereco,
            String telefone,
            String email,
            long numeroMatricula,
            double bonusSalarial)
    {
        super(nome, endereco, telefone, email, numeroMatricula);
        this.bonusSalarial = bonusSalarial;
    }




}
