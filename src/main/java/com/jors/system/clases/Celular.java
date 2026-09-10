package com.jors.system.clases;

public class Celular extends DatoIndentificado{

    public Celular(String valor){
        super(valor,"Celular invalido");
    }

    @Override
    public boolean esValida(String valor) {
        return valor.matches("//d{10}");
    }
}