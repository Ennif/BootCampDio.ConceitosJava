package com.projeto.List;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Carro> ListCarros = new ArrayList<>();

        ListCarros.add(new Carro("Ferrari"));
        ListCarros.add(new Carro("Jeep"));
        ListCarros.add(new Carro("Mitsubish"));
        ListCarros.add(new Carro("Chevrolet"));


        System.out.println(ListCarros.contains(new Carro("Ford")));   //Verifica Se existe Na lista

        System.out.println(ListCarros);

        System.out.println(ListCarros.get(2)); // PEGA O ITEN DA POSIÇÂO 2

        System.out.println(ListCarros.indexOf(new Carro("Jeep"))); // Retorna a Posição

        System.out.println(ListCarros.remove(2));// Remove item n pos. Indicada

        System.out.println(ListCarros);






    }
}
