package com.jors.model;

import java.math.BigDecimal;

public class DetalleVenta {
    private Integer id;
    private final Producto producto;
    private int cantidad;
    private final BigDecimal precioUnitario;

    public DetalleVenta(Producto producto, int cantidad) {
        if (producto == null){
            throw new IllegalArgumentException("No se ha ingresado ningun producto");
        }
        this.producto = producto;
        actualizarCantidad(cantidad);
        this.precioUnitario = producto.getPrecio();
    }

    public int getId(){
        return id;
    }

    public String getCodigoProducto(){
        return producto.getCodigo();
    }

    public String getNombreProducto(){
        return producto.getNombre();
    }

    public int getCantidad(){
        return this.cantidad;
    }

    public final void actualizarCantidad(int cantidad){
        if (cantidad <= 0){
            throw new IllegalArgumentException("No se pueden vender ninguno o cantidades negativas");
        }
        this.cantidad = cantidad;
    }

    public BigDecimal getSubTotal(){
        return precioUnitario.multiply(BigDecimal.valueOf(cantidad));
    }
    
    public BigDecimal getTotal(){
        return CalculatorIva.calcularPrecioConIva(this);
    }
}
