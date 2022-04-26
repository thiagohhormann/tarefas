package ex1;

public class CCorrente {
    private int numero;
    private double saldo;
    private Clientes cliente;

    public CCorrente(int numero, double saldo, Clientes cliente) {
        this.numero = numero;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public void creditar(double valor){
        this.saldo = this.saldo + valor;
    }

    public void debitar(double valor){
        if (valor <= this.saldo){
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public String toString(){
        return ("Conta:" + this.numero + " Saldo:" + this.saldo + this.cliente);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

}
