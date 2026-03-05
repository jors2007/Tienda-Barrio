package com.jors;

public class Venta extends Transaccion{
    private static final double porcentajeIva = 0.15; // Porcentaje del iva Ecuador 15%

    public double calcularValorConIva(Producto producto, int cantidad, Balance balance){
        double precioBase = producto.getPrecio();
        double precioTotal = (precioBase * cantidad) * (1 + porcentajeIva);
        this.monto = precioTotal;
        this.guardarEnBalance(balance);
        return precioTotal;
    }

    public void guardarEnBalance(Balance balance){
        balance.getVentas().add(this);
    }
}