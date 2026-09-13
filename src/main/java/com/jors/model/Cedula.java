package com.jors.model;

public class Cedula extends DatoIndentificado{

    public Cedula(String valor) {
        super(valor,"Cedula invalida");
    }

    @Override
    public boolean esValida(String valor) {
       return valor.matches("\\d{10}");
    }
}