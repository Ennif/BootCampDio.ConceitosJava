package com.projeto.HashSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {

        Set<Carro> hashSetCarros = new HashSet<>();  // Hash Set n preserva Orde de inserção. PrintAleatorio

        hashSetCarros.add(new Carro("Ford"));
        hashSetCarros.add(new Carro("Chevrolet"));
        hashSetCarros.add(new Carro("Jeep"));
        hashSetCarros.add(new Carro("Ferrari"));
        hashSetCarros.add(new Carro("Jaguar"));
        hashSetCarros.add(new Carro("Mitsubish"));

        System.out.println(hashSetCarros);

        Set<Carro> treeSetCarros = new TreeSet<>();     // Por ser uma arvore. A classe carro precisa imprementar
                                                        // o "Comparable<Carro>" para ter a comparação de tamanho
                                                        // e ser inserido na arvore.
        treeSetCarros.add(new Carro("Ford"));
        treeSetCarros.add(new Carro("Chevrolet"));
        treeSetCarros.add(new Carro("Jeep1"));
        treeSetCarros.add(new Carro("Ferrari"));
        treeSetCarros.add(new Carro("Jaguar"));
        treeSetCarros.add(new Carro("Mitsubish1"));

        System.out.println(treeSetCarros);




    }
}
