package com.projeto.Stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Carro> stackCarros = new Stack<>();

        stackCarros.push(new Carro("ford"));
        stackCarros.push(new Carro("Ferrari"));
        stackCarros.push(new Carro("Mitsubshi"));

        System.out.println(stackCarros);

        System.out.println(stackCarros.pop()); //Remove

        System.out.println(stackCarros.peek()); // Exibe Mas n retira


    }
}
