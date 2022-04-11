package com.company.exe2;

public class CamaroteInferior extends Vip{

    private int fileira, poltrona;

    CamaroteInferior(double valor, int adicional, int fileira, int poltrona) {
        super(valor, adicional);
        this.fileira = fileira;
        this.poltrona = poltrona;
    }

    public int getAssento() {
        return this.fileira + this.poltrona;
    }

    public void mudarAssento(int novaFileira, int novaPoltrona) {
        this.fileira = novaFileira;
        this.poltrona = novaPoltrona;
    }
}
