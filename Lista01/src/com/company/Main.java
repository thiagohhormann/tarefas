package com.company;

public class Main {

    public static void main(String[] args) {
        Bola bola = new Bola("vermelha", "borracha", 5);
        bola.trocaCor("preta");
        System.out.println("A bola é " + bola.mostraCor());
        System.out.println(" ");

        Quadrado quadrado = new Quadrado(4);
        quadrado.mudarLado(10);

        System.out.print("Um quadrado com um lado igual a " + quadrado.valorLado());
        System.out.println(" e uma área de " + quadrado.calcularArea());
        System.out.println(" ");

        Pessoa pessoa = new Pessoa(50, 100, 10, "James");
        System.out.print(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos, medindo " + pessoa.getAltura() + " cm");
        System.out.println(" e pesando " + pessoa.getPeso() + " kg");
        pessoa.envelhecer();
        pessoa.engordar();
        System.out.print(pessoa.getNome() + " tem " + pessoa.getIdade() + " anos, medindo " + pessoa.getAltura() + " cm");
        System.out.println(" e pesando " + pessoa.getPeso() + " kg");
        System.out.println(" ");

        Tv televisao = new Tv(4, 10);
        System.out.println("Volume: " + televisao.getVolume());
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.aumentarVolume();
        televisao.diminuirVolume();
        System.out.println("Volume: " + televisao.getVolume());
        televisao.trocarCanal(5);
        televisao.trocarCanal(2);
        televisao.trocarCanal(10);
        System.out.println("canal: " + televisao.getCanal());

    }
}
