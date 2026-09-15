package com.jors.model;

import java.util.List;

public class VentaService {
    public void realizarVenta(Inventario inventario,Item item){
        if (inventario == null || item == null){
            throw new IllegalArgumentException("No se puede realizar la venta con elementos vacios");
        }
        String nombreproductoVendido = item.getNombreProducto();
        List<Producto> productos = inventario.getProductos();
        boolean encontrado = false;
        for(Producto producto: productos){
            String nombreProducto = producto.getNombre();
            if (nombreProducto.equals(nombreproductoVendido)){
                int cantidadVendida = item.getCantidad();
                producto.reducirStock(cantidadVendida);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new IllegalArgumentException("No se ha podido encontrar ese producto");
        }
        // Aqui va las partes del DAO donde se actualiza todo
    }   
}
