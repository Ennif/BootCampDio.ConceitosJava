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
    public void remove(T conteudo){
        try{
            BinNO<T> atual = this.raiz;
            BinNO<T> pai = this.raiz;
            BinNO<T> filho = null;
            BinNO<T> temp = null;

            while (atual != null && !atual.getConteudo().equals(conteudo)){
                pai = atual;
                if(conteudo.compareTo(atual.getConteudo()) < 0){
                    atual = atual.getNoEsq();
                }else{
                    atual = atual.getNoDir();
                }
            }
            if (atual == null){
                System.out.println("Erro Vazio. |Try|");
            }

            if (pai == null){
                if (atual.getNoDir() == null){
                    this.raiz = atual.getNoEsq();
                }else if(atual.getNoEsq() == null){
                    this.raiz = atual.getNoDir();
                }else{
                    for (temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho=filho.getNoEsq()
                    ){
                        if(filho != atual.getNoEsq()){
                            temp.setNoDir(filho.getNoEsq());
                            filho.setNoEsq(raiz.getNoEsq());
                        }
                    }
                    filho.setNoDir(raiz.getNoDir());
                    raiz= filho;
                }

            }else if(atual.getNoDir() == null){
                if(pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoEsq());
                }else {
                    pai.setNoDir(atual.getNoEsq());
                }
            }else if(atual.getNoEsq() == null){
                if(pai.getNoEsq() == atual) {
                    pai.setNoEsq(atual.getNoDir());
                }else {
                    pai.setNoDir(atual.getNoDir());
                }
            }else{
                for (
                        temp = atual, filho = atual.getNoEsq();
                        filho.getNoDir() != null;
                        temp = filho, filho = filho.getNoDir()
                ){
                    if(filho != atual.getNoEsq()){
                        temp.setNoDir(filho.getNoEsq());
                        filho.setNoEsq(atual.getNoEsq());
                    }
                    filho.setNoDir(atual.getNoDir());
                    if (pai.getNoEsq() == atual){
                        pai.setNoEsq(filho);
                    }else{
                        pai.setNoDir(filho);
                    }
                }
            }

        }catch (NullPointerException erro) {
            System.out.println("Erro Vazio. |Catch|");
        }
    }




}
