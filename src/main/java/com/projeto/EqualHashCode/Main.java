package com.projeto.EqualHashCode;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> listaCarro = new ArrayList<>();

        listaCarro.add(new Carro("ford"));
        listaCarro.add(new Carro("Ferrari"));
        listaCarro.add(new Carro("Mitsubish"));
        listaCarro.add(new Carro("Jaguar"));

        System.out.println(listaCarro.contains(new Carro("Ferrari")));

        System.out.println(new Carro("Ferrari").hashCode());

        Carro carro1 = new Carro("ford");
        Carro carro2 = new Carro("chevrolet");

        System.out.println(carro1.equals(carro2));

    }
}
