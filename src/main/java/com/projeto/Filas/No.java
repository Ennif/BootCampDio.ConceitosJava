package com.projeto.Filas;

public class No {

    private Object object;
    private No refNo;

    public No(){
    }

    public No(Object object){
        this.refNo = null;
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public No getRefNo() {
        return refNo;
    }

    public void setRefNo(No refNo) {
        this.refNo = refNo;
    }
}
