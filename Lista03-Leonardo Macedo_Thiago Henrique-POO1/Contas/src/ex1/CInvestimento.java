package ex1;

import java.util.*;

public class CInvestimento extends  CCorrente {
    private int diaInvestimento;
    private int periodo;

    public CInvestimento(int numero, double saldo, Clientes cliente, int diaInvestimento, int periodo) {
        super(numero, saldo, cliente);
        this.diaInvestimento = diaInvestimento;
        this.periodo = periodo;
    }

    public void atualizarSaldo(){
        Calendar dataAtual = Calendar.getInstance();
        int dia = dataAtual.get(Calendar.DAY_OF_MONTH);
        System.out.println(dia);
        if (dia == (this.diaInvestimento+periodo)){
            super.setSaldo((float) (super.getSaldo() * 1.2));
        } else {
            System.out.println("Ainda nao é o dia do investimento");
        }
    }
}
