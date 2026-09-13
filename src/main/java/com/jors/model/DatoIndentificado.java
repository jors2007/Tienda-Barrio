package com.jors.model;

public abstract class DatoIndentificado {
    private final String valor;
    
    protected DatoIndentificado(String valor,String mensajeError){
        if (valor == null || !esValida(valor)){
            throw new IllegalArgumentException(mensajeError);
        } else {
            this.valor = valor;
        }
    }
    
    public abstract boolean esValida(String valor);

    public String getValor(){
        return valor;
    }

}
