package com.jors.model;

import java.util.ArrayList;

public class Cliente {
    private Integer id;
    private Cedula cedula;
    private String nombre;
    private String apellido;
    private Celular celular;
    private Direccion direccion;

    // Constructor que sirve para insertar datos de la base de datos
    public Cliente(Cedula cedula, String nombre, String apellido, Celular celular, Direccion direccion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
    }

    // Constructor que sirve para leer los datos de la base de datos
    public Cliente(Integer id,Cedula cedula, String nombre, String apellido, Celular celular, Direccion direccion){
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.celular = celular;
        this.direccion = direccion;
    }

    public int getId(){
        return id;
    }

    public String getNombre(){
        return nombre;
    }

    public String getApellido(){
        return apellido;
    }

    public String getCedula(){
        return cedula.getValor();
    }

    public String getCelular(){
        return celular.getValor();
    }

    public String getDireccionPrimaria(){
        return direccion.getCallePrincipal();
    }

    public String getDireccionSecundaria(){
        return direccion.getCalleSecundaria();
    }

    public void setId(int id){
        this.id = id;
    }

    public void setCedula(Cedula nuevaCedula){
        this.cedula = nuevaCedula;
    }

    public void setCelular(Celular nuevoCelular){
        this.celular = nuevoCelular;
    }

    public void setDireccion(Direccion nuevaDireccion){
        this.direccion = nuevaDireccion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

        public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
