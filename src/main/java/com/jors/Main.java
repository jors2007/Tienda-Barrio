package com.jors;

import java.sql.Connection;
import java.sql.SQLException;

import com.jors.system.base_de_datos.ConexionDB;
import com.jors.system.clases.Categoria;
import com.jors.system.clases.Inventario;
import com.jors.system.clases.Item;
import com.jors.system.clases.Producto;

public class Main{
    public static void main(String[] args) {
        try(Connection con = ConexionDB.obtenerConexion()){
            if(con != null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.err.println("Fallo al conectar con la base de datos: " + e.getMessage());
        }
        Inventario inventario = Inventario.getInventario();
        Producto producto = new Producto("121231", "Lapiz", 0.30, Categoria.BEBIDAS, "Lapiz Big");
        try {
            inventario.agregarProducto(producto);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        if(inventario != null){
        System.out.println("El inventario no esta vacio");
        }
        Item item = new Item(producto,3);
        System.out.println(item.getTotal());
        Cliente cliente = new Cliente(cedula, nombre, apellido, celular, direccion, comprasRealizadas)
    }
}