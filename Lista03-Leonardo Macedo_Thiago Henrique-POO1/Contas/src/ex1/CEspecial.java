package ex1;

public class CEspecial extends CCorrente {
    private double limite;

    public CEspecial(int numero, double saldo, Clientes cliente, double limite) {
        super(numero, saldo, cliente);
        this.limite = limite;
    }

    @Override

        public void debitar(double valor){
        if (valor <= (super.getSaldo()+this.limite)){
            super.setSaldo(super.getSaldo() - valor);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

}
