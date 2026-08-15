package com.jors.clases;

public class Celular {
    private String valor;

    public Celular(String valor){
        if (valor == null || !esValida(valor)){
            throw new IllegalArgumentException("Celular ingresado no es valida");
        } else {
            this.valor = valor;
        }

    }

    public boolean esValida(String valor){
        return valor.matches("//d{10}");
    }

    public String getValor() {
        return valor;
    }

}