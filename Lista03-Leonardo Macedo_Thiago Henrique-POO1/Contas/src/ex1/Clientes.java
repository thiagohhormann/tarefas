package ex1;

public class Clientes {
    private String nome;
    private int cpf;

    public Clientes(String nome, int cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public int getCpf() {
        return cpf;
    }

    public String toString(){
        return (" Cliente:" + this.nome);
    }
}
