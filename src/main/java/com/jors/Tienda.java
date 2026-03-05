package com.jors;

import java.util.ArrayList;

public class Tienda {
    private String nombre;
    private ArrayList<Producto> productos;
    private ArrayList<Empleado> empleados; 
    private ArrayList<Balance> balances;


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

}
