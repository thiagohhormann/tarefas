package com.company.exe2;

public class CamaroteInferior extends Vip{

    private int fileira, poltrona;

    public CamaroteInferior(double valor, double adicional, int fileira, int poltrona) {
        super(valor, adicional);
        this.fileira = fileira;
        this.poltrona = poltrona;

        adicional = (adicional / 100) * valor;
        double valorVip = valor + adicional;
        setValor(valorVip);
    }

    public String getAssento() {
        return String.format("assento %o fila %o ", this.fileira, this.poltrona);
    }

    public void mudarAssento(int novaFileira, int novaPoltrona) {
        this.fileira = novaFileira;
        this.poltrona = novaPoltrona;
    }
}
