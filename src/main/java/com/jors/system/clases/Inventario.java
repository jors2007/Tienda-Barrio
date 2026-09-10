package com.jors.system.clases;

import java.util.ArrayList;
import java.util.Collections;
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
        return Collections.unmodifiableList(productos);
    }

    public void agregarProducto(Producto producto){
        if (producto == null){
            throw new IllegalArgumentException("No se puede agregar un producto vacio");
        }
        this.productos.add(producto);
    }
}
