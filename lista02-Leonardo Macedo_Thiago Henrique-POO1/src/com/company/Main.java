package com.company;

import com.company.exe3.Administrativo;
import com.company.exe3.Tecnico;

public class Main {

    public static void main(String[] args) {

        Administrativo assistenteAdm = new Administrativo(
                "Herbert",
                "R. tal",
                "998565684",
                "email@dominio.com",
                202101001,
                "Noturno",
                120.00);

        Tecnico assistenteTec = new Tecnico(
                "Richers",
                "R. tal",
                "984654654",
                "email@dominio.com",
                202102001,
                200.00);

        System.out.print(assistenteAdm.getNome());
        System.out.println(", possui o número de matrícula: " + assistenteAdm.getNumeroMatricula());

        System.out.print(assistenteTec.getNome());
        System.out.println(", possui o número de matrícula: " + assistenteTec.getNumeroMatricula());
    }
}
