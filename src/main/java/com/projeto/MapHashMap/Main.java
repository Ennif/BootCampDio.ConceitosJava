package com.projeto.MapHashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome","Ezau");  // Imprime | Nome=Ezau |
        aluno.put("Idade","24");
        aluno.put("Media","9.5");
        aluno.put("Turma","1A");

        //System.out.println(aluno);

        //System.out.println(aluno.keySet()); // Retorna as Chava  |Nome,Idade...|
        //System.out.println(aluno.values()); // Retorna valores |Ezau, 24...|

        List<Map<String, String>> listaAlunos = new ArrayList<>();

        listaAlunos.add(aluno);


        /// TEste 2

        Map<String, String> aluno2 = new HashMap<>();

        aluno2.put("Nome","Andressa");  // Imprime | Nome=Ezau |
        aluno2.put("Idade","28");
        aluno2.put("Media","9.8");
        aluno2.put("Turma","1B");


        listaAlunos.add(aluno2);

        System.out.println(listaAlunos);


        System.out.println(aluno.containsKey("Nome")); // Verifica se existe a chave nome

    }
}
