package com.projeto.ListaEncadeada;

public class main {
    public static void main(String[] args) {

        ListaEncadeada<String>  mListaEncadeada = new ListaEncadeada<>();

        mListaEncadeada.add("msg 01");
        mListaEncadeada.add("msg 04");
        mListaEncadeada.add("msg 05");
        mListaEncadeada.add("msg 06");
        mListaEncadeada.add("msg 07");

        System.out.println(mListaEncadeada.get(0));
        System.out.println(mListaEncadeada.get(3));

        System.out.println(mListaEncadeada.toString());

        System.out.println(mListaEncadeada);

        System.out.println(mListaEncadeada.remove(3));

        System.out.println(mListaEncadeada);
    }
}
