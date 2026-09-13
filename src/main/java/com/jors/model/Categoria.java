package com.jors.model;

public enum Categoria {
    UTILES("UTL","Utiles escolares");

    private final String prefijo;
    private final String descripcion;

    Categoria(String prefijo, String descripcion) {
        this.prefijo = prefijo;
        this.descripcion = descripcion;
    }

    public String getPrefijo() {
        return prefijo;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
