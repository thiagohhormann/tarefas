package com.company.exe2;

public class CamaroteSuperior extends Vip{
    private int adicionalSuperior;

    public CamaroteSuperior (double valor, int adicional, int adicionalSuperior) {
        super(valor, adicional);
        this.adicionalSuperior = adicionalSuperior;

        double valorVipSuperior= valor + (valor * (adicional / 100));
        setValor(valorVipSuperior);
    }
}
