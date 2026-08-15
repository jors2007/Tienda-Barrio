package com.jors.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta implements Transaccion{
    private int idVenta;    
    private LocalDate fecha;
    private List<Item> items = new ArrayList<>();

    public Venta(int idVenta) {
        this.fecha = LocalDate.now();
        this.idVenta = idVenta;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    @Override
    public void realizarTransaccion(Item item){
        this.items.add(item);
    }

    @Override
    public boolean verificarTransaccion(){
        return !items.isEmpty();
    }        

    public List<Item> obtenerListaItems(){
        return new ArrayList<>(this.items);
    }
}
    
