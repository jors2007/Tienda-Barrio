package com.jors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.jors.model.Cedula;
import com.jors.model.Celular;
import com.jors.model.Cliente;
import com.jors.model.Direccion;
import com.jors.model.Producto;

public class InventarioDAO {
    public void insertar(Producto producto) throws SQLException{
        String sql = "INSERT INTO inventario(codigo, nombre, precio, descripcion, categoria, stock) VALUES (?,?,?,?,?,?)";

        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.KEEP_CURRENT_RESULT)){
                ps.setString(1,producto.getCodigo());
                ps.setString(2,producto.getNombre());
                ps.setBigDecimal(3, producto.getPrecio());
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

        public List<Producto> obtenerTodo() throws SQLException{
        List<Producto> productos = new ArrayList<>();
        String sql = """
                SELECT 
                id, codigo, nombre, precio, stock, catergoria, descripcion
                FROM producto;
                """;
         try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Producto producto = new Producto(rs.getInt("id"), 
                        rs.getString("codigo"), 
                        rs.getString("nombre"), 
                        rs.getBigDecimal("precio"), 
                        null, 
                        sql, 
                        0);
                    productos.add(producto);
                }
            }
        }
        return productos;
    }

    public void actualizar(Producto producto) throws SQLException{

    }

    public boolean eliminar(Producto producto) throws SQLException{
        String sql = "DELETE FROM producto WHERE id = ?";
        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
                ps.setInt(1, producto.getId());
                int filasAfectada = ps.executeUpdate();
                return filasAfectada > 0;
        }
    }
}
