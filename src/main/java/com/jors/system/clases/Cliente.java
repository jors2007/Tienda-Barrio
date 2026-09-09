package com.jors.system.clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Cedula cedula;
    private String nombre;
    private Celular celular;
    private Direccion direccion;
    private final List<Venta> comprasRealizadas;

    public Cliente(Cedula cedula, String nombre, Celular celular, Direccion direccion,
            ArrayList<Venta> comprasRealizadas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.comprasRealizadas = comprasRealizadas;
    }

    public String getNombre() {
        return nombre;
    }

    public Cedula getCedula(){
        return cedula;
    }

    public Celular getCelular(){
        return celular;
    }

    public Direccion getDireccion(){
        return direccion;
    }

    public void setCedula(Cedula nuevaCedula){
        this.cedula = nuevaCedula;
    }

    public void setCelular(Celular nuevoCelular){
        this.celular = nuevoCelular;
    }

    public void setDireccion(Direccion nuevaDireccion){
        this.direccion = nuevaDireccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> obtenerComprasRealizadas() {
        return new ArrayList<>(this.comprasRealizadas);
    }

    public void agregarVenta(Venta venta){
        if (venta == null){
            throw new IllegalArgumentException("No se pueden agregar ventas nulas");
        }
        this.comprasRealizadas.add(venta);
    }
}
