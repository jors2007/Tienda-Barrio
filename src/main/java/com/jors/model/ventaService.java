package com.jors.model;

import java.util.List;

// esta clase segun esta mal, ya mismo la observo
public class ventaService {
    public static void realizarVenta(Inventario inventario,Item item){
        List<Producto> productos = inventario.getProductos();
        String codigoProducto = item.getCodigoProducto();
        for(Producto producto: productos){
            if(codigoProducto.equals(producto.getCodigo())){
                int stockProducto = producto.getStock();
                int cantidadAVender = item.getCantidad();
                if (cantidadAVender > stockProducto){
                    throw new IllegalArgumentException("No se pueden vender más cantidad que el stock");
                } 
                producto.setStock(stockProducto - cantidadAVender);
            }
        }
    }   
}
