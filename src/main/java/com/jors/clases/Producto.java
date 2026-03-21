package com.jors.clases;

public class Producto {
    private String nombre;
    private int id;
    private double precio;
    private int stock;

    public Producto(String nombre,int id,double precio,int stock){
        this.nombre = nombre;
        this.id = id;
        this.precio = precio;
        this.stock = stock;
    }
    // Métodos Getters
    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock(){
        return stock;
    }

    // Métodos Setters 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setStock(int stock){
        this.stock = stock;
    }
}

