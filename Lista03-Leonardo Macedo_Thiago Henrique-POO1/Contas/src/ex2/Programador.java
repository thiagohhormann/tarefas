package ex2;

public class Programador extends Funcionario{
    final double porcentagemAumento = 20;

    public Programador(String nome, double salario) {
        super(nome, salario);
    }

    public void aumentaSalario() {
        double salario = getSalario();
        salario += salario * porcentagemAumento/100;
        setSalario(salario);
    }
}
