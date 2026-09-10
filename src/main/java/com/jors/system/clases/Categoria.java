package com.jors.system.clases;

public enum Categoria {
    BEBIDAS("BEB", "Bebidas y Refrescos"),
    TECNOLOGIA("TEC", "Tecnología y Accesorios"),
    DULCES("DUL", "Golosinas y Confitería"),
    LIMPIEZA("LIM", "Artículos de Limpieza");

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
