package com.projeto.Filas;

import java.sql.Ref;

public class Fila<T> {

    private No<T> RefNoEntradaFila;

    public Fila() {
        this.RefNoEntradaFila = null;
    }

    public void enqueue(T obj){
        No novoNo = new No(obj);
        novoNo.setRefNo(RefNoEntradaFila);
        RefNoEntradaFila = novoNo;
    }

    public T first(){
        if(!this.isEmpty()) {
            No PrimeiroNo= RefNoEntradaFila;
            while(true){
                if(PrimeiroNo.getRefNo() != null){
                    PrimeiroNo = PrimeiroNo.getRefNo();
                }else{

                break;
                }

            }
            return (T) PrimeiroNo.getObject();
        }
        return null;
    }

    public T dequeue(){
        if(!this.isEmpty()) {
            No PrimeiroNo= RefNoEntradaFila;
            No noAuxiliar= RefNoEntradaFila;

            while(true){

                if(PrimeiroNo.getRefNo() != null){
                    noAuxiliar = PrimeiroNo;
                    PrimeiroNo = PrimeiroNo.getRefNo();
                }else{
                    noAuxiliar.setRefNo(null);
                    break;
                }

            }

            return (T) PrimeiroNo.getObject();
        }

        return null;
    }

    public boolean isEmpty(){
        return RefNoEntradaFila == null ? true : false;
    }

    @Override
    public String toString() {
        String stringRetorn = "";
        No noAuxiliar = RefNoEntradaFila;
        if(RefNoEntradaFila != null){
            while (true){
                stringRetorn += "[NO{Objeto = " + noAuxiliar.getObject() + "}]--->";

                if(noAuxiliar.getRefNo()!= null){
                    noAuxiliar = noAuxiliar.getRefNo();
                }else{
                    stringRetorn += "null";
                    break;
                }
            }

        }else{
            stringRetorn = "null";

        }
        return stringRetorn;
    }
}
