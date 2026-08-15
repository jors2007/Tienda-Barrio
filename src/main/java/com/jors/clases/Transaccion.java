package com.jors.clases;

public interface Transaccion {
    public void realizarTransaccion(Item itemsEntrada);
    public boolean verificarTransaccion();
}
