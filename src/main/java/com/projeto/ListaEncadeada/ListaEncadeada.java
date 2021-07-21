package com.projeto.ListaEncadeada;

public class ListaEncadeada<T> {

    No referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public int size(){
        int tamanhoLista = 0;
        No<T> refenciaAux = referenciaEntrada;

        while (true){
            if(refenciaAux != null){
                tamanhoLista++;
                if(refenciaAux.getProximoNo() != null){
                    refenciaAux = refenciaAux.getProximoNo();
                }else {
                    break;
                }
            }else{
                break;
            }
        }
        return  tamanhoLista;

    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;

    }



}
