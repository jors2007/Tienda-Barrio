package com.jors.clases;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private int idCliente;
    private String nombre;
    private Cedula cedula;
    private Celular celular;
    private List<Venta> comprasRealizadas = new ArrayList<>();

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Cedula getCedula() {
        return cedula;
    }

    public Celular getCelular() {
        return celular;
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
}
