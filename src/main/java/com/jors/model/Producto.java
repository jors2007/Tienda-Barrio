package com.jors.model;

import java.math.BigDecimal;

public class Producto {
    private Integer id;
    private String codigo;
    private String nombre;
    private BigDecimal precio;
    private String descripcion;
    private final Categoria categoria;
    private int stock;


    public Producto(String nombre, BigDecimal precio, Categoria categoria, String descripcion,int stock){
        this.descripcion = descripcion;
        this.nombre = nombre;
        actualizarPrecio(precio);
        this.categoria = categoria;
        this.stock = stock;
    }

    public Producto(Integer id, String codigo, String nombre, BigDecimal precio, Categoria categoria, String descripcion,int stock){
        this.id = id;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        actualizarPrecio(precio);
        this.categoria = categoria;
        this.stock = stock;
    }

    public void asignarCodigo(){
        String preFijo = categoria.getPrefijo();
        this.codigo = String.format(preFijo+"-%06d",id);
    }

    public void reducirStock(int cantidadVendida){
        if (cantidadVendida <= 0){
            throw new IllegalArgumentException("No se puede reducir stock con una cantidad negativa");
        }
        if (cantidadVendida > this.stock){
            throw new IllegalArgumentException("No se puede vender más que el stock");
        }
        this.stock -= cantidadVendida;
    }

    public Integer getId(){
        return id;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Categoria getCategoria(){
        return categoria;
    }

        public int getStock() {
        return stock;
    }

    public final void actualizarPrecio(BigDecimal precio) {
        if (precio.compareTo(BigDecimal.ZERO) <= 0){
            throw new IllegalArgumentException("No se pueden introducir precios negativos");
        }
        this.precio = precio;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
