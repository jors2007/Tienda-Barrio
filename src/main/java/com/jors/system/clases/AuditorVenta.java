package com.jors.system.clases;

import java.util.ArrayList;
import java.util.List;

public class AuditorVenta {
    private List<Venta> transacciones;
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

    public List<Venta> getListaVentas(){
        return new ArrayList<>(this.transacciones);
    }

    // Por poner la logica dentor de esta
    public void introducirVenta(List<Venta> transacciones){
        
    }
} 
