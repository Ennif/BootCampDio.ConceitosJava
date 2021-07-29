package com.projeto.ListasCirculares;

public class ListaCircular<T>{

    private NoLc<T> cabeca;
    private NoLc<T> cauda;
    private int tamanhoLista;

    public ListaCircular() {
        this.cauda = null;
        this.cabeca = null;
        this.tamanhoLista = 0;
    }

    public void add(T conteudo){
        NoLc<T> novoNo = new NoLc<>(conteudo);
        if(this.tamanhoLista == 0){
            this.cabeca = novoNo;
            this.cauda = this.cabeca;
            this.cauda.setNoLcProximo(cauda);
        }else {
            novoNo.setNoLcProximo(this.cauda);
            this.cabeca.setNoLcProximo(novoNo);
            this.cauda = novoNo;
        }
        this.tamanhoLista ++;
    }

    public void remove(int index) {
        if (index >= this.tamanhoLista)
            throw new IndexOutOfBoundsException("O indice é maior que o tamnho da lista.");
            NoLc<T> noAuxilar = this.cauda;
            if (index == 0) {
                this.cauda = this.cauda.getNoLcProximo();
                this.cabeca.setNoLcProximo(this.cauda);
            } else if (index == 1) {
                this.cauda.setNoLcProximo(this.cauda.getNoLcProximo().getNoLcProximo());

            } else {
                for (int i = 0; i < index - 1; i++) {
                    noAuxilar = noAuxilar.getNoLcProximo();
                }
                noAuxilar.setNoLcProximo(noAuxilar.getNoLcProximo().getNoLcProximo());
            }
            this.tamanhoLista--;
        }


    public T get(int index){
        return this.getNo(index).getConteudo();
    }


    private NoLc<T> getNo(int index){
        if(this.isEmpty())
            throw new IndexOutOfBoundsException("A lista está vazia!!");


            if(index == 0){
                return  this.cauda;

            }

            NoLc<T> noAuxiliar = this.cauda;
            for (int i= 0; (i < index) && (noAuxiliar != null); i++){
                noAuxiliar = noAuxiliar.getNoLcProximo();
            }

            return noAuxiliar;
        }



    public boolean isEmpty(){
        return this.tamanhoLista == 0 ? true : false;
    }

    public int size(){

        return this.tamanhoLista;
    }

    @Override
    public String toString(){
        String strRetorno = "";

        NoLc<T> noAuxiliar = this.cauda;

            for(int i = 0; i < this.size(); i++){
                strRetorno += "[NO{Conteudo =" + noAuxiliar.getConteudo() +"}]===>";
                noAuxiliar = noAuxiliar.getNoLcProximo();
            }

        strRetorno += this.size() != 0 ? "(Retorna ao inicio)" :"[]";

        return strRetorno;
    }
}
