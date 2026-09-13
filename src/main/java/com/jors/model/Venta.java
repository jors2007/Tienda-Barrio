package com.jors.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venta {
    private final int idVenta;
    private final LocalDate fecha;
    private final List<Item> items;
    private final Cliente cliente;

    public Venta(int idVenta, Cliente cliente) {
        this.fecha = LocalDate.now();
        this.idVenta = idVenta;
        this.items = new ArrayList<>();
        this.cliente = cliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void agregarItem(Item item) {
        if (item == null) {
            throw new IllegalArgumentException("No se pueden agregar un item vacío");
        }
        this.items.add(item);
    }

    public List<Item> getItems() {
        return Collections.unmodifiableList(items);
    }

    public double obtenerTotalVenta() {
        double total = 0;
        for (Item item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void eliminarItemPorIndice(int indice) {
        if (indice < 0 || indice > items.size()) {
            throw new IndexOutOfBoundsException("Índice de ítem inválido: " + indice);
        }
        items.remove(indice);
    }
}

