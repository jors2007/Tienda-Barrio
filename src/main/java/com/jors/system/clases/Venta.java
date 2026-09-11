package com.jors.system.clases;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venta {
    private final int idVenta;
    private final LocalDate fecha;
    private final List<Item> items;

    public Venta(int idVenta) {
        this.fecha = LocalDate.now();
        this.idVenta = idVenta;
        this.items = new ArrayList<>();
    }

    public int getIdVenta() {
        return idVenta;
    }

    public LocalDate getFecha() {
        return fecha;
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

