package com.jors.system.clases;

import java.util.ArrayList;
import java.util.List;

// Aqui se usa singleton
public class Inventario {
    private final List<Producto> productos;
    private static Inventario inventario;

    private Inventario(){
        this.productos = new ArrayList<>();
    }

    public static Inventario getInventario(){
        if (inventario == null){
            inventario = new Inventario();
        }
        return inventario;
    }

    public List<Producto> obtenerProductos(){
        return new ArrayList<>(this.productos);
    }

    public void agregarProducto(Producto producto){

    }
}
