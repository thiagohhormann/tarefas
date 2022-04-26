package ex2;

public class Gerente extends Funcionario{
    final double porcentagemAumento = 10;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    public void aumentaSalario() {
        double salario = getSalario();
        salario += salario * porcentagemAumento/100;
        setSalario(salario);
    }
}
