package com.company;

import com.company.exe1.Chefe;
import com.company.exe1.Empregado;
import com.company.exe1.Estagiario;
import com.company.exe2.CamaroteInferior;
import com.company.exe2.CamaroteSuperior;
import com.company.exe2.Ingresso;
import com.company.exe2.Vip;
import com.company.exe3.Administrativo;
import com.company.exe3.Tecnico;
import com.company.exe4.Cachorro;
import com.company.exe4.Gato;
import com.company.exe6.Pobre;
import com.company.exe6.Rica;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("***** Exe 1 *****");

        Empregado empregado = new Empregado(1, "James", "email@dominio.com", 1500.00);
        Chefe chefe = new Chefe(2, "Bond", "email@dominio.com", 2000.00, 150.00);
        Estagiario estagiario =  new Estagiario(3,"007", "email@dominio.com", 1000.00, 10);

        System.out.println("Empregado - Salário antigo: " + empregado.getSalario());
        empregado.aumentoSalarial(10);
        System.out.println("Empregado - Salário novo: " + empregado.getSalario());
        System.out.println();

        System.out.println("Chefe - Salário antigo: " + chefe.getSalario());
        chefe.aumentoSalarial(10);
        System.out.println("Chefe - Salário novo: " + chefe.getSalario());
        System.out.println();

        System.out.println("Estagiário - Salário antigo: " + estagiario.getSalario());
        estagiario.aumentoSalarial(30);
        System.out.println("Estagiário - Salário novo: " + estagiario.getSalario());
        System.out.println();

        System.out.println("***** Exe 2 *****");

        Ingresso ingresso = new Ingresso(50.00);
        System.out.println("valor ingresso: R$" + ingresso.imprimeValor());
        System.out.println();

        Vip ingressoVip = new Vip(50, 40);
        System.out.println("Valor ingresso vip: R$" + ingressoVip.imprimeValor());
        System.out.println();

        CamaroteInferior camaroteInferior = new CamaroteInferior(100.00, 20, 10, 5);
        System.out.println("Valor ingresso camarote inf: R$" + camaroteInferior.imprimeValor());
        System.out.println(camaroteInferior.getAssento());
        System.out.println();

        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(100.00, 20, 20);
        System.out.println("Valor ingresso camarote sup: R$" + camaroteSuperior.imprimeValor());
        System.out.println();

        System.out.println("***** Exe 3 *****");

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
        System.out.println();

        System.out.println("***** Exe 4 *****");

        Cachorro dog = new Cachorro("bull", "Shih Tzu");
        Gato cat = new Gato("Dog", "Persa");

        System.out.println("cachorro late: " + dog.late());
        System.out.println(dog.caminha());

        System.out.println("gato mia: " + cat.mia());
        System.out.println(cat.caminha());
        System.out.println();

        System.out.println("***** Exe 6 *****");

        Pobre pobre = new Pobre("pessoa", 20);
        System.out.println(pobre.trabalha());

        Rica rica = new Rica("pessoa rica", 20, 10000);
        System.out.println(rica.fazerCompras(1000));
        System.out.println(rica.fazerCompras(20000));
    }
}
