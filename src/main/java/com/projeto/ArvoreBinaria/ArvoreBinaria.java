package com.projeto.ArvoreBinaria;

public class ArvoreBinaria<T extends Comparable<T>>{
    private BinNO<T> raiz;


    public ArvoreBinaria(){
        this.raiz = null;
    }

    public void inserir(T conteudo){
        BinNO<T> novoNo = new BinNO<>(conteudo);
        raiz = inserir(raiz, novoNo);
    }

    private BinNO<T> inserir(BinNO<T> atual, BinNO<T> novoNo){

        if(atual == null){
            return novoNo;
        }else if (novoNo.getConteudo().compareTo(atual.getConteudo()) < 0){
            atual.setNoEsq(inserir(atual.getNoEsq(), novoNo));
        }else{
            atual.setNoDir(inserir(atual.getNoDir(), novoNo));
        }

        return atual;
    }
}
