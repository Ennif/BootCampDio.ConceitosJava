package com.projeto.NOencadeamentoNO;

public class Main {
    public static void main(String[] args) {

        No<String> no1 = new No<>("Conteudo Primeiro Nó");
        No<String> no2 = new No<>("Conteudo Segundo Nó");

        no1.setProximoNo(no2);

        No<String> no3 = new No<>("Conteudo Terceiro Nó");
        no2.setProximoNo(no3);

        No<String> no4 = new No<>("Conteudo Quarto Nó");
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no2);

        System.out.println(no1);
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());

    }
}
