package com.jors.system.clases;

public class Item {
    private Producto producto;
    private final int cantidad;
    private final double precioUnitario;
    
    public Item(Producto producto, int cantidad) {
        this.producto = producto;
        this.cantidad = cantidad;
        this.precioUnitario = producto.getPrecio();
    }

    public double getSubTotal(){
        return cantidad * precioUnitario;
    }
    
    public double getTotal(){
        return CalculatorIva.calcularPrecioConIva(this);
    }
}
