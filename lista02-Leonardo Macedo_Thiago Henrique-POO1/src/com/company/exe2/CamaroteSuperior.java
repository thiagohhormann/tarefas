package com.company.exe2;

public class CamaroteSuperior extends Vip{
    private double adicionalSuperior;

    public CamaroteSuperior (double valor, double adicional, double adicionalSuperior) {
        super(valor, adicional);
        this.adicionalSuperior = (adicionalSuperior / 100) * valor;
        adicional = (adicional / 100) * valor;

        double valorVipSuperior = valor + adicional + adicionalSuperior;
        setValor(valorVipSuperior);
    }
}
