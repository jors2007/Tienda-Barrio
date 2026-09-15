package com.jors.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Venta {
    private Integer id;
    private String codigo;
    private final LocalDate fecha;
    private final List<DetalleVenta> detalleVentas;
    private final Cliente cliente;

    public Venta(Cliente cliente){
        this.fecha = LocalDate.now();
        this.detalleVentas = new ArrayList<>();
        this.cliente = cliente;
    }

    public Venta(Integer id, Cliente cliente, String codigo){
        this.id = id;
        this.codigo = codigo;
        this.fecha = LocalDate.now();
        this.detalleVentas = new ArrayList<>();
        this.cliente = cliente;
    }

    public void asignarCodigo(){
        this.codigo = String.format("FAC-&06d",id);
    }

    public int getId() {
        return id;
    }

    public String getCodigo(){
        return codigo;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public Cliente getCliente(){
        return cliente;
    }

    public void agregarItem(DetalleVenta item) {
        if (item == null) {
            throw new IllegalArgumentException("No se pueden agregar un item vacío");
        }
        this.detalleVentas.add(item);
    }

    public List<DetalleVenta> getItems() {
        return Collections.unmodifiableList(detalleVentas);
    }

    public double obtenerTotalVenta() {
        double total = 0;
        for (DetalleVenta detalleVenta : detalleVentas) {
            total += detalleVenta.getTotal();
        }
        return total;
    }

    public void eliminarItemPorIndice(int indice) {
        if (indice < 0 || indice > detalleVentas.size()) {
            throw new IndexOutOfBoundsException("Índice de ítem inválido: " + indice);
        }
        detalleVentas.remove(indice);
    }

    public void setId(Integer id){
        this.id = id;
    }
}

