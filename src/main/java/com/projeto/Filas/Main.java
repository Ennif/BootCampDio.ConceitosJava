package com.projeto.Filas;

public class Main {
    public static void main(String[] args) {

        Fila minhaFila = new Fila();

        minhaFila.enqueue(new No("primeiro Nó"));
        minhaFila.enqueue(new No("Segundo Nó"));
        minhaFila.enqueue(new No("Terceiro Nó"));
        minhaFila.enqueue(new No("Quarto Nó"));


        System.out.println(minhaFila.dequeue());
        System.out.println(minhaFila);

        minhaFila.enqueue(new No("ultimo"));

        System.out.println(minhaFila);
        System.out.println(minhaFila.first());



    }
}
