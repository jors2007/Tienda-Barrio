package com.jors.system;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private Cedula cedula;
    private Celular celular;
    private Direccion direccion;
    private List<Venta> comprasRealizadas;

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

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(Cedula cedula) {
        this.cedula = cedula;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
    }

    public List<Venta> getComprasRealizadas() {
        return new ArrayList<>(this.comprasRealizadas);
    }

}
