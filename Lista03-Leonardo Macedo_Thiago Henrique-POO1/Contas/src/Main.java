import ex1.*;
import ex2.Gerente;
import ex2.Programador;
import ex3.Divisao;
import ex3.Multiplicacao;
import ex3.Soma;
import ex3.Subtracao;
import ex4.Triatleta;

import static java.lang.Thread.sleep;

public class Main{

    public static void main(String[]args){
        Clientes cli1 = new Clientes("james", 111111111);
        CCorrente cc1 = new CCorrente(1, 1500.00, cli1);

        Clientes cli2 = new Clientes("Bond", 222222222);
        CCorrente cc2 = new CCorrente(21, 2000, cli2);
        CPoupanca cp2 = new CPoupanca(22, 2500, cli2, 500);

        Clientes cli3 = new Clientes("Tom", 333333333);
        CEspecial ce3 = new CEspecial(31, 3000, cli3, 10000);
        CInvestimento ci3 = new CInvestimento(32, 3500, cli3, 10, 5);

        Clientes cli4 = new Clientes("Cruise", 444444444);
        CInvestimento ci4 = new CInvestimento(4, 4000, cli4, 10, 5);

        Clientes cli5 = new Clientes("Unknown", 555555555);

        System.out.println("Cliente: " + cli1.getNome() + " possui as seguintes contas:");
        System.out.println(cc1);

        System.out.println();

        System.out.println("Cliente: " + cli2.getNome() + " possui as seguintes contas:");
        System.out.println(cc2 + "\n" + cp2);

        System.out.println();

        System.out.println("Cliente: " + cli3.getNome() + " possui as seguintes contas:");
        System.out.println(ce3 + "\n" + ci3);

        System.out.println();

        System.out.println("Cliente: " + cli4.getNome() + " possui as seguintes contas:");
        System.out.println(ci4);

        System.out.println();

        System.out.println("Cliente: " + cli5.getNome() + " possui as seguintes contas:");
        System.out.println("Nenhuma, estaria interessado em alguns de nossos planos?");

        System.out.println("------------------------");

        Gerente gerente = new Gerente("Napolitano", 2000);
        System.out.println("Salário atual do gerente:" + gerente.getSalario());
        gerente.aumentaSalario();
        System.out.println("Novo salário " + gerente.getSalario());

        System.out.println();

        Programador programador = new Programador("Icecream", 2000);
        System.out.println("Salário atual do programador: " + programador.getSalario());
        programador.aumentaSalario();
        System.out.println("Novo salário " + programador.getSalario());

        System.out.println("-----------------------------");

        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();

        System.out.println(soma.calcula(10, 10));
        System.out.println(subtracao.calcula(10, 10));
        System.out.println(multiplicacao.calcula(10, 10));
        System.out.println(divisao.calcula(10, 10));
        System.out.println(divisao.calcula(10, 0));
        System.out.println(soma.calcula(10, 50));

        System.out.println("--------------------------");

        Triatleta triatleta = new Triatleta("Dom", "casa");
        triatleta.aquecer();
        triatleta.correr();
        triatleta.pedalar();
        triatleta.nadar();
    }
}