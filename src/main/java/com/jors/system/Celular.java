package com.jors.system;

public class Celular extends DatoIndentificado{

    public Celular(String valor){
        super(valor,"Celular invalida");
    }

    @Override
    public boolean esValida(String valor) {
        return valor.matches("//d{10}");
    }
}