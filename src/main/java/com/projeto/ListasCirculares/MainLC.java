package com.projeto.ListasCirculares;

public class MainLC {

    public static void main(String[] args){
        ListaCircular<String> minhaLisgtaCircular = new ListaCircular<>();

        minhaLisgtaCircular.add("c0");
        System.out.println(minhaLisgtaCircular);

        minhaLisgtaCircular.remove(0);
        System.out.println(minhaLisgtaCircular);

        minhaLisgtaCircular.add("c1");
        minhaLisgtaCircular.add("c3");
        System.out.println(minhaLisgtaCircular);

        System.out.println(minhaLisgtaCircular.get(0));
    }
}
