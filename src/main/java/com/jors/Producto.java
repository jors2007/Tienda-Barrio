package com.jors;

public class Producto {
    private String nombre;
    private int id;
    private int precio;

    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public int getPrecio() {
        return precio;
    }

    // Métodos Setters 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}

