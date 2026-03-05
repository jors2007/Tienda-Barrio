package com.jors;

import java.time.LocalDateTime;

public abstract class Transaccion {
    protected  double monto;
    protected LocalDateTime fecha;
    protected String descripcion;

    // Métodos Getters
    public double getMonto(){
        return monto;
    }

    public LocalDateTime getFecha(){
        return fecha;
    }

    public String getDescripcion(){
        return descripcion;
    }

    // Métodos Setters
    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
