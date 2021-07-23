package com.projeto.ListaEncadeada;

public class ListaEncadeada<T> {

    No referenciaEntrada;

    public ListaEncadeada(){
        this.referenciaEntrada = null;
    }

    public void add(T conteudo){
        No<T> novoNo = new No<>(conteudo);
        if (this.isEmpty()){
            referenciaEntrada = novoNo;
            return;
        }

        No<T> noAuxiliar = referenciaEntrada;
        for( int i = 0; i< this.size()-1; i++){
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        noAuxiliar.setProximoNo(novoNo);
    }

    private No <T> getNo(int index){

        validadeIndice(index);

        No<T> noAuxiliar = referenciaEntrada;
        No<T> noRetorno = null;

            for( int i = 0; i <= index; i++){
                noRetorno = noAuxiliar;
                noAuxiliar = noAuxiliar.getProximoNo();
             }

            return  noRetorno;
    }

    public T remove(int index){
        No<T> noPivor = this.getNo(index);
        if(index == 0){
            referenciaEntrada = noPivor.getProximoNo();
            return noPivor.getConteudo();
        }

        No<T> noAnterior = getNo(index - 1);
        noAnterior.setProximoNo(noPivor.getProximoNo());
        return noPivor.getConteudo();
    }


    public T get(int index){
        return getNo(index).getConteudo();
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

    public void validadeIndice(int index){
        if (index >= size()){
            int UltimoIndice = size() -1 ;
            throw  new IndexOutOfBoundsException("Não Existe conteúdo no indice " + index +" Desta Lista lita até" + UltimoIndice+";");
        }
    }

    public boolean isEmpty(){
        return referenciaEntrada == null ? true : false;

    }

    @Override
    public String toString() {
        String strRetorno = "";
        No<T> noAuxiliar = referenciaEntrada;
        for (int i = 0; i < this.size(); i++){
            strRetorno += "||Nó{Conteudo= " + noAuxiliar.getConteudo() + "}||";
            noAuxiliar = noAuxiliar.getProximoNo();
        }

        strRetorno += "null";
        return strRetorno;
    }
}
