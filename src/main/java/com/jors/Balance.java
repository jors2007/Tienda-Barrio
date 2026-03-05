package com.jors;

import java.util.ArrayList;

public class Balance {
    private ArrayList<Gasto> gastos;
    private ArrayList<Venta> ventas;

    public ArrayList<Gasto> getGastos(){
        return gastos;
    }

    public ArrayList<Venta> getVentas(){
        return ventas;
    }

    public double calcularBalance(){
        double sumaGastos = 0;
        for (Gasto gasto: gastos){
            sumaGastos += gasto.getMonto();
        }
        double sumaVentas = 0;
        for (Venta venta: ventas){
            sumaVentas += venta.getMonto();
        }
        double balanceNeto = sumaVentas - sumaVentas;
        return balanceNeto;
    }
}
