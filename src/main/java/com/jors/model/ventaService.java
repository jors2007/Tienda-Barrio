package com.jors.model;

import java.util.List;

public class VentaService {
    public void realizarVenta(Inventario inventario,DetalleVenta detalleVenta){
        if (inventario == null || detalleVenta == null){
            throw new IllegalArgumentException("No se puede realizar la venta con elementos vacios");
        }
        String nombreProductoVendido = detalleVenta.getNombreProducto();
        List<Producto> productos = inventario.getProductos();
        boolean encontrado = false;
        for(Producto producto: productos){
            String nombreProducto = producto.getNombre();
            if (nombreProducto.equals(nombreProductoVendido)){
                int cantidadVendida = detalleVenta.getCantidad();
                producto.reducirStock(cantidadVendida);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            throw new IllegalArgumentException("No se ha podido encontrar ese producto");
        }
        // Aqui va las partes del DAO donde se actualiza inventario y se inserta la venta
    }   
}
