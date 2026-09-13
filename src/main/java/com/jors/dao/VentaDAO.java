package com.jors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jors.model.Cliente;
import com.jors.model.ConexionDB;
import com.jors.model.Venta;

public class VentaDAO {
    public void agregarVenta(Venta venta, Cliente cliente) throws SQLException{
        String sql = "INSERT INTO venta (fecha, id_cliente) VALUES (?,?)";
        try (Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
                ps.setObject(1, venta.getFecha());
                ps.setInt(2, cliente.getId());
                ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                int idGenerado = rs.getInt(1);
                venta.setId(idGenerado);
            }
        }
    }
}
