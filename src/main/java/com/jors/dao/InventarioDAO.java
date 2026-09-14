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
        String sql = "INSERT INTO inventario(codigo, nombre, precio, descripcion, categoria, stock) VALUES (?,?,?,?,?,?)";

        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.KEEP_CURRENT_RESULT)){
                ps.setString(1,producto.getCodigo());
                ps.setString(2,producto.getNombre());
                ps.setDouble(3, producto.getPrecio());
                ps.setString(4,producto.getDescripcion());
                ps.setString(5, producto.getCategoria().name());
                ps.setInt(6, producto.getStock());
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int codigoGenerado = rs.getInt(1);
                producto.setId(codigoGenerado);
            }
        }
    }
}
