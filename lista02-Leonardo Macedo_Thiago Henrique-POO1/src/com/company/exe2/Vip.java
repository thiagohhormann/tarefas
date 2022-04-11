package com.company.exe2;

import com.company.exe2.Ingresso;

public class Vip extends Ingresso {
    private double adicional;

    public Vip (double valor, double adicional) {
        super(valor);
        this.adicional = adicional / 100;

        double valorVip = valor + (valor * this.adicional);
        setValor(valorVip);
    }


}
