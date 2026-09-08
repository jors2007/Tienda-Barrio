package com.jors.system.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta implements Transaccion{
    private int idVenta;    
    private LocalDate fecha;
    private List<Item> items;

    public Venta(int idVenta) {
        this.fecha = LocalDate.now();
        this.idVenta = idVenta;
        this.items = new ArrayList<>();
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

    public List<Item> getItems(){
        return new ArrayList<>(this.items);
    }
}
    
