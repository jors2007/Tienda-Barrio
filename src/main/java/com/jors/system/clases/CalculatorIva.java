package com.jors.system.clases;

public class CalculatorIva {
    public static Double calcularPrecioConIva(Item item){
    Double iva = 0.15;
    return item.getSubTotal() * (1 + iva);
    }
}
