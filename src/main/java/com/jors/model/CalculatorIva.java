package com.jors.model;

import java.math.BigDecimal;

public class CalculatorIva {
    public static BigDecimal calcularPrecioConIva(DetalleVenta detalleVenta){
    BigDecimal iva = new BigDecimal("0.15");
    BigDecimal subTotal = detalleVenta.getSubTotal();
    return subTotal.multiply(iva);
    }
}
