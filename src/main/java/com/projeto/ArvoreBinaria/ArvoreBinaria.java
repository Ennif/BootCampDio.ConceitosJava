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

    //IN ORDER
    public void exibirInOrder(){
        System.out.println("\n Exibindo InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirInOrder(BinNO<T> atual){
        if (atual == null){
            exibirInOrder(atual.getNoEsq());
            System.out.println(atual.getConteudo() + ", ") ;
            exibirInOrder(atual.getNoDir());
        }
    }
    //// POS
    public void exibirPosOrder(){
        System.out.println("\n Exibindo InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirPosOrder(BinNO<T> atual){
        if (atual == null){
            exibirPosOrder(atual.getNoEsq());
            exibirPosOrder(atual.getNoDir());
            System.out.println(atual.getConteudo() + ", ") ;

        }
    }

    ////PRE
    public void exibirPreOrder(){
        System.out.println("\n Exibindo InOrder");
        exibirInOrder(this.raiz);
    }

    private void exibirPreOrder(BinNO<T> atual){
        if (atual == null){
            System.out.println(atual.getConteudo() + ", ") ;
            exibirPreOrder(atual.getNoEsq());
            exibirPreOrder(atual.getNoDir());
        }
    }


    //REMOVE




}
