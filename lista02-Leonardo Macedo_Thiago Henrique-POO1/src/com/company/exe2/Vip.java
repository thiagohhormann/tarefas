package com.company.exe2;

import com.company.exe2.Ingresso;

public class Vip extends Ingresso {
    private int adicional;

    public Vip (double valor, int adicional) {
        super(valor);
        this.adicional = adicional;

        double valorVip = valor + (valor * (adicional / 100));
        setValor(valorVip);
    }
}
