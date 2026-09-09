package com.jors.system.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Venta {
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

    public void agregarItem(Item item){
        this.items.add(item);
    }
   
    public List<Item> getItems(){
        return new ArrayList<>(this.items);
    }
}
    
