package com.jors.clases;


public class Cedula {
    private final String valor;

    public Cedula(String valor) {
        if (valor == null || !esValida(valor)){
            throw new IllegalArgumentException("La cedula ingresada no es valida");
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