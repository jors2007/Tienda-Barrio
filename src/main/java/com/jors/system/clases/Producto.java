package com.jors.system.clases;

public class Producto {
    private String codigo; // El codigo llevara el una categoria, el prefijo y el numero de creación (codigo nemotecnico) prefijo + "-" + String.format("%04d", numero)
    private String nombre;
    private double precio;
    private String descripcion;
    private final Categoria categoria;

    public Producto(String codigo, String descripcion, String nombre, double precio, Categoria categoria) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        actualizarPrecio(precio);
        this.categoria = categoria;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public final void actualizarPrecio(double precio) {
        if (precio <= 0){
            throw new IllegalArgumentException("No se pueden introducir precios negativos");
        }
        this.precio = precio;
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
}
