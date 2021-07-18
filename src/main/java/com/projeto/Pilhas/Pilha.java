package com.projeto.Pilhas;

public class Pilha {

    private No reNoEntradaPilha;

    public Pilha() {
        this.reNoEntradaPilha = null;
    }

    public void push(No novoNo){
        No reAuxiliar = reNoEntradaPilha;
        reNoEntradaPilha = novoNo;
        reNoEntradaPilha.setReNo(reAuxiliar);
    }

    public No pop(){
        if(!isEmpty()){
            No noPoped = reNoEntradaPilha;
            reNoEntradaPilha = reNoEntradaPilha.getReNo();
            return  noPoped;
        }
        return null;
    }


    public No top(){
        return  reNoEntradaPilha;
    }

    public boolean isEmpty(){
       /* if (reNoEntradaPilha == null){
            return true;
        }
            return false;*/
        return reNoEntradaPilha == null ? true : false;

    }

    @Override
    public String toString() {
        String stringRetorno = "---------------------\n";
        stringRetorno += "      Pilha\n";
        stringRetorno += "---------------------\n";

        No noAuxiliar = reNoEntradaPilha;

        while (true){
            if(noAuxiliar != null){
                stringRetorno += "[No{dado=" + noAuxiliar.getDado() +"}]\n";
                noAuxiliar = noAuxiliar.getReNo();
            }else{
                break;
            }
        }
        stringRetorno += "=====================\n";
        return stringRetorno;
    }
}
