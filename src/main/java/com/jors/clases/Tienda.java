package com.jors.clases;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados; 
    private ArrayList<Balance> balances;

    public Tienda(String nombre){
        this.nombre = nombre;
    }

    // Métodos Getters
    public ArrayList<Balance> getBalances(){
        return balances;
    }

    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }

    public ArrayList<Producto> getProductos(){
        return productos;
    }

    public String getNombre(){
        return nombre;
    }

    // Método Setters

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    // Método de agregación a la lista
    
    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public void agregarBalance(Balance balance){
        balances.add(balance);
    }
}
