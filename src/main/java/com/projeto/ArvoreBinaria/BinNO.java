package com.projeto.ArvoreBinaria;

public class BinNO<T extends Comparable<T>> {

    private T conteudo;
    private BinNO<T> noEsq;
    private BinNO<T> noDir;

    public BinNO(T conteudo) {
        this.conteudo = conteudo;
        noEsq = noDir = null;
    }

    public BinNO(){

    }

    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public BinNO<T> getNoEsq() {
        return noEsq;
    }

    public void setNoEsq(BinNO<T> noEsq) {
        this.noEsq = noEsq;
    }

    public BinNO<T> getNoDir() {
        return noDir;
    }

    public void setNoDir(BinNO<T> noDir) {
        this.noDir = noDir;
    }

    @Override
    public String toString() {
        return "BinNO{" +
                "conteudo=" + conteudo +
                '}';
    }
}
