package com.jors.system;

public class CalculatorIva {
    public Double calcularPrecioConIva(Item item){
    Double iva = 0.15;
    return item.getPrecio() * (1 + iva);
    }
}
