package com.jors.system;

import java.util.ArrayList;
import java.util.List;

public class AuditorVenta {
    private List<Venta> transacciones;
    private AuditorVenta auditor;

    private AuditorVenta(){
        this.transacciones = new ArrayList<>();
    }

    public AuditorVenta getAuditor(){
        return new AuditorVenta();
    }

    public List<Venta> getListaVentas(){
        return new ArrayList<>(this.transacciones);
    }

    // Por poner la logica dentor de esta
    public void introducirVenta(List<Venta> transacciones){
        
    }
} 
