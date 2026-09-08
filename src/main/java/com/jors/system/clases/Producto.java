package com.jors.system.clases;

public class Producto {
    private String codigo; // El codigo llevara el una categoria, el prefijo y el numero de creación (codigo nemotecnico) prefijo + "-" + String.format("%04d", numero)
    private String nombre;
    private double precio;
    private String descripcion;

    public Producto(String codigo, String descripcion, String nombre, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

}
