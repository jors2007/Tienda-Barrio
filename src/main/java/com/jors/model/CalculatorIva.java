package com.jors.model;

public class CalculatorIva {
    public static Double calcularPrecioConIva(DetalleVenta item){
    Double iva = 0.15;
    return item.getSubTotal() * (1 + iva);
    }
}
