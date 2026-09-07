package com.jors.system;

public abstract class DatoIndentificado {
    private String valor;
    
    protected DatoIndentificado(String valor,String mensajeError){
        if (valor == null || !esValida(valor)){
            throw new IllegalArgumentException(mensajeError);
        } else {
            this.valor = valor;
        }
    }
    
    public abstract boolean esValida(String valor);

    public String getValor(){
        return this.valor;
    }
}
