package com.projeto.AtribuicaoReferencia;

public class Mobjeto {

    Integer num;

    public Mobjeto(Integer num) {
        this.num = num;
    }

    public void setNum (Integer num){
        this.num = num;
    }

    @Override
    public String toString() {
        return this.num.toString();
    }

}
