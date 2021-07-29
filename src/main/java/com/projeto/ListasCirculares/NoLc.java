package com.projeto.ListasCirculares;

public class NoLc<T> {
    private T conteudo;
    private NoLc<T> noLcProximo;

    public NoLc(T conteudo) {
        this.noLcProximo = null;
        this.conteudo = conteudo;
    }

    ////GET AND SET
    public T getConteudo() {
        return conteudo;
    }

    public void setConteudo(T conteudo) {
        this.conteudo = conteudo;
    }

    public NoLc<T> getNoLcProximo() {
        return noLcProximo;
    }

    public void setNoLcProximo(NoLc<T> noLcProximo) {
        this.noLcProximo = noLcProximo;
    }

    //// TO STR
    @Override
    public String toString() {
        return "NoLc{" +
                "conteudo=" + conteudo +
                '}';
    }
}
