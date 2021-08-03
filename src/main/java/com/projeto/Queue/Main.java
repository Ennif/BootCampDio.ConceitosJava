package com.projeto.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //FIFO
        Queue<Carro> queueCarros = new LinkedList<>();

        queueCarros.add(new Carro("Ferrari"));
        queueCarros.add(new Carro("Mitsubishi"));
        queueCarros.add(new Carro("Chevrolet"));

        System.out.println(queueCarros.add(new Carro("Jeep"))); // Retorna true se conseguir ADD se n ERROR
        System.out.println(queueCarros);


        System.out.println(queueCarros.offer(new Carro("Jaguar"))); // RETORNA true ou false dependendo do Result
        System.out.println(queueCarros);

        System.out.println(queueCarros.peek()); // REtorna primeiro elemento da fila sem remover
        System.out.println(queueCarros);

        System.out.println(queueCarros.poll()); // REtorna primeiro elemento da fila E o REMOVE
        System.out.println(queueCarros);


        System.out.println(queueCarros.isEmpty());
        System.out.println(queueCarros.size());

    }
}
