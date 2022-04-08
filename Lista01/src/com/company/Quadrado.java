package com.company;

public class Quadrado {

    private double lado;

    Quadrado(double lado) {
        this.lado = lado;
    }

    public void mudarLado(double lado) {
        this.lado = lado;
    }

    public double valorLado() {
        return this.lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }
}
