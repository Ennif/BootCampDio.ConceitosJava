package com.projeto.DuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;
    //////////////////////////////////
    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimoNo = null;
        tamanhoLista = 0;
    }

    private int Size(){
        return tamanhoLista;
    }

}
