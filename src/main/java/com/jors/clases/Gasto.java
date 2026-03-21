package com.jors.clases;
import java.time.LocalDateTime;

import com.jors.enums.Categoria;

public class Gasto extends Transaccion{
    private Categoria categoria;

    public Gasto(double monto, LocalDateTime fecha,Categoria categoria){
    this.monto = monto;
    this.fecha = fecha;
    this.categoria = categoria;
    }

    public Gasto(double monto, LocalDateTime fecha,Categoria categoria, String descripcion){
        this(monto,fecha,categoria);
        this.descripcion = descripcion;
    }

    
    public Categoria getCategoria(){
        return categoria;
    }
}
