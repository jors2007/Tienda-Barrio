package com.jors.clases;

public class Empleado {
    private String nombre;
    private int id;
    private int ventasRealizadas;
    private double GananciaGenerada;

    // Métodos Getters
    public String getNombre(){
        return nombre;
    }

    public int getId(){
    return id;
    }

    public int getVentasRealizadas(){
    return ventasRealizadas;
    }

    public double getGananciaGenerada(){
    return GananciaGenerada;
    }

    // metodos Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setVentasRealizadas(int ventasRealizadas) throws IllegalStateException{
        if (ventasRealizadas < 0){
            throw new IllegalStateException("Error: No se pueden tener ventas realizadas negativas");
        }
        this.ventasRealizadas = ventasRealizadas;
    }

    public void setGananciaGenerada(double gananciaGenerada) throws IllegalStateException{
        if (gananciaGenerada < 0) {
            throw new IllegalStateException("Error: No se puede tener una ganancia negativa");
        }
        this.GananciaGenerada = gananciaGenerada;
    }
}
