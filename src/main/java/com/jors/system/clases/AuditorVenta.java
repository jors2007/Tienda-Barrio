package com.jors.system.clases;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class AuditorVenta {
    private final List<Venta> transacciones;
    private static AuditorVenta auditor;

    private AuditorVenta(){
        this.transacciones = new ArrayList<>();
    }

    public static AuditorVenta getAuditor(){
        if (auditor == null){
            auditor = new AuditorVenta();
        }
        return auditor;
    }

    public List<Venta> obtenerListaVenta(){
        return Collections.unmodifiableList(transacciones);
    }

    public void introducirVenta(Venta venta){
        if (venta == null){
            throw new IllegalArgumentException("No se puede agregar una venta nula");
        }
        this.transacciones.add(venta);
    }
} 
