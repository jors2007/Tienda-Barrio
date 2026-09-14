package com.jors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jors.model.ConexionDB;
import com.jors.model.Producto;

public class InventarioDAO {
    public void insertarProducto(Producto producto) throws SQLException{
        String sql = "INSERT INTO inventario(nombre, precio, descripcion, categoria, stock) VALUES (?,?,?,?,?)";
        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.KEEP_CURRENT_RESULT)){
                
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int codigoGenerado = rs.getInt(1);
                producto.setId(codigoGenerado);
            }
        }

        /*
    private String codigo; // El codigo llevara el una categoria, el prefijo y el numero de creación (codigo nemotecnico) prefijo + "-" + String.format("%04d", numero)
    private String nombre;
    private double precio;
    private String descripcion;
    private final Categoria categoria;
    private int stock; */
    }
}
