package ex1;

public class CPoupanca extends CCorrente {

    private double saldoMinimo;

    public CPoupanca(int numero, double saldo, Clientes cliente, double SaldoMinimo) {
        super(numero, saldo, cliente);
        this.saldoMinimo = saldoMinimo;
    }

    @Override

    public void debitar(double valor){
        if (valor <= super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
            if (super.getSaldo() < this.saldoMinimo){
                this.saldoMinimo = super.getSaldo();
            }
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void atualizarSaldo(){
        super.setSaldo((float) (super.getSaldo() + (this.saldoMinimo * 0.05)));
        this.saldoMinimo = super.getSaldo();
    }

    public float getSaldoMinimo(){
        return (float) this.saldoMinimo;
    }
}
