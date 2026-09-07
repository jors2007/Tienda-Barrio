package com.jors.system;

public interface Transaccion {
    public void realizarTransaccion(Item itemsEntrada);
    public boolean verificarTransaccion();
}
