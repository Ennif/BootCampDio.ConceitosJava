package com.projeto.DuplamenteEncadeada;

public class ListaDuplamenteEncadeada<T> {

    private NoDuplo<T> primeiroNo;
    private NoDuplo<T> ultimoNo;

    private int tamanhoLista;
    ///////////////////////////////////

    public ListaDuplamenteEncadeada(){
        primeiroNo = null;
        ultimoNo = null;
        tamanhoLista = 0;
    }

    public T get(int value){
        return this.getNO(value).getConteudo();
    }

    private NoDuplo<T> getNO(int value){
        NoDuplo<T> noAuxiliar = primeiroNo;
        for (int i = 0; (i < value)&&(noAuxiliar != null); i++) {
            noAuxiliar = noAuxiliar.getNoProximo();
        }
        return  noAuxiliar;
    }

    private int Size(){
        return tamanhoLista;
    }

}
