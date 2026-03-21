package com.jors.clases;

import java.time.LocalDateTime;

public class Venta extends Transaccion{
    private static final double porcentajeIva = 0.15; // Porcentaje del iva Ecuador 15%

    public Venta(LocalDateTime fecha){
        this.fecha = fecha;
    }

    public void realizarVenta(Producto producto, int cantidad, Balance balance){
        if (cantidad > producto.getStock()){
            throw new IllegalArgumentException("Error: No se puede realizar la venta ya que la cantidad registrada supera al stock del producto");
        }
        
        double precioBase = producto.getPrecio();
        // calcula el precio final
        this.monto = (precioBase * cantidad) * (1 + porcentajeIva);

        this.descripcion = "cantidad vendida: " + cantidad + ", unidades de: " + producto.getNombre();
        producto.setStock(producto.getStock() - cantidad);
        this.guardarEnBalance(balance);
    }

    public void guardarEnBalance(Balance balance){
        balance.getVentas().add(this);
    }
}