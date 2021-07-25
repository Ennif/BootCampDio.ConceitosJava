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

    public void add(T elemento){
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(null);
        novoNo.setNoPrevio(ultimoNo);
        if (primeiroNo == null){
            primeiroNo = novoNo;
        }
        if (ultimoNo != null){
            ultimoNo.setNoPrevio(novoNo);
        }
        ultimoNo = novoNo;
        tamanhoLista++;
    }

    public void add(int index, T elemento){
        NoDuplo<T> noAuxilar = getNO(index);
        NoDuplo<T> novoNo = new NoDuplo<>(elemento);
        novoNo.setNoProximo(noAuxilar);

        if (novoNo.getNoProximo() != null){
            novoNo.setNoPrevio(noAuxilar.getNoPrevio());
            novoNo.getNoProximo().setNoPrevio(novoNo);
        }else{
            novoNo.setNoProximo(ultimoNo);
            ultimoNo = novoNo;
        }

        if (index == 0){
            primeiroNo = novoNo;
        }else{
            novoNo.getNoPrevio().setNoProximo(novoNo);

        }
        tamanhoLista ++;

    }

    public void remove(int index){
        if(index == 0){
            primeiroNo = primeiroNo.getNoProximo();
            if (primeiroNo != null){
                primeiroNo.setNoPrevio(null);
            }
        }else {
            NoDuplo<T> noAuxilar = getNO(index);
            noAuxilar.getNoPrevio().setNoProximo(noAuxilar.getNoProximo());
            if (noAuxilar != ultimoNo){
                noAuxilar.getNoProximo().setNoPrevio(noAuxilar.getNoPrevio());
            }
            ultimoNo = noAuxilar;
        }
        this.tamanhoLista --;

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

    @Override
    public String toString() {
        String strRetorno = "";

        NoDuplo<T> noAuxilar = primeiroNo;

        for (int i = 0; i < Size(); i++){
            strRetorno += "[" + noAuxilar.getConteudo() +"] //|";

            noAuxilar = noAuxilar.getNoProximo();
        }

        strRetorno += "null";

        return strRetorno;
    }
}
