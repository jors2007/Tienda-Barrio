package com.jors.system.clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private Cedula cedula;
    private Celular celular;
    private Direccion direccion;
    private final List<Venta> comprasRealizadas;

    public Cliente(int idCliente, String nombre, Cedula cedula, Celular celular, Direccion direccion,
            ArrayList<Venta> comprasRealizadas) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
        this.comprasRealizadas = comprasRealizadas;
    }

    public int getIdCliente() {
        return idCliente;
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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Venta> getComprasRealizadas() {
        return new ArrayList<>(this.comprasRealizadas);
    }

}
