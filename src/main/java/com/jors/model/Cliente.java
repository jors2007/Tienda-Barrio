package com.jors.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cliente {
    private Cedula cedula;
    private String nombre;
    private String apellido;
    private Celular celular;
    private Direccion direccion;
    private final List<Venta> comprasRealizadas;

    public Cliente(Cedula cedula, String nombre, String apellido, Celular celular, Direccion direccion,
            ArrayList<Venta> comprasRealizadas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.apellido = apellido;
        this.celular = celular;
        this.direccion = direccion;
        this.comprasRealizadas = comprasRealizadas;
    }

    public String getNombre(){
        return nombre;
    }

    public String apellido(){
        return apellido;
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

        public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public List<Venta> obtenerComprasRealizadas() {
        return Collections.unmodifiableList(comprasRealizadas);
    }

    public void agregarCompra(Venta venta){
        if (venta == null){
            throw new IllegalArgumentException("No se pueden agregar una compra nula");
        }
        this.comprasRealizadas.add(venta);
    }
}
