package com.jors.system.clases;

public class Item {
    private final Producto producto;
    private int cantidad;
    private final double precioUnitario;
    
    public Item(Producto producto, int cantidad) {
        if (producto == null){
            throw new IllegalArgumentException("No se ha ingresado ningun producto");
        }
        this.producto = producto;
        actualizarCantidad(cantidad);
        this.precioUnitario = producto.getPrecio();
    }

    public String obtenerNombreProducto(){
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

    public double getSubTotal(){
        return cantidad * precioUnitario;
    }
    
    public double getTotal(){
        return CalculatorIva.calcularPrecioConIva(this);
    }
}
