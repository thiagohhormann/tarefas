package com.company;

public class Bola {
    private String cor, material;
    private double circunferencia;

    Bola (String cor, String material, double circunferencia) {

        this.cor = cor;
        this.material = material;
        this.circunferencia = circunferencia;
    }

    public void trocaCor(String cor) {
        this.cor = cor;
    }

    public String mostraCor() {
        return this.cor;
    }
}
