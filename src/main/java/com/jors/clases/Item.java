package com.jors.clases;

public class Item {
    private int id;
    private String nombre;
    private Double precio;
    private int stock;  

    public Item(int id, String nombre, Double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public Double getPrecio(){
        return precio;
    }

    public int getStock(){
        return stock;
    }

    public String getString(){
        return nombre;
    }

    public int getId(){
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
