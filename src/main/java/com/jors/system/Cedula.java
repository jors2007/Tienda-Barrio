package com.jors.system;

public class Cedula extends DatoIndentificado{

    public Cedula(String valor) {
        super(valor,"Cedula invalida");
    }

    @Override
    public boolean esValida(String valor) {
       return valor.matches("//d{10}");
    }
}