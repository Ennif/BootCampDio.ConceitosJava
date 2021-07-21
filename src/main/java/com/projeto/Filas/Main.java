package com.projeto.Filas;

public class Main {
    public static void main(String[] args) {

        Fila<String> minhaFila = new Fila <String>();

        minhaFila.enqueue("primeiro ");
        minhaFila.enqueue("Segundo ");
        minhaFila.enqueue("Terceiro ");
        minhaFila.enqueue("Quarto ");


        System.out.println(minhaFila);

        minhaFila.enqueue("ultimo");

        System.out.println(minhaFila);

        System.out.println(minhaFila.first());




    }
}
