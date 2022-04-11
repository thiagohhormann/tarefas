package com.company.exe6;

public class Rica extends Pessoa{
    private double dinheiro;

    public Rica(String nome, int idade, double dinheiro) {
        super(nome, idade);
        this.dinheiro = dinheiro;
    }

    public String fazerCompras(double valorCompra){
        if (valorCompra > 0 && valorCompra < this.dinheiro) {
            dinheiro -= valorCompra;
            return ("Compra no valor de %s realizada com sucesso" +
                    "\nSeu saldo: %s").formatted(valorCompra, this.dinheiro);
        } else {
            return "\nSaldo insuficiente";
        }
    }
}
