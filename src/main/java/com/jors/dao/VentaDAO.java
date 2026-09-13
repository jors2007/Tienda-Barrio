package com.jors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.jors.model.Cliente;
import com.jors.model.ConexionDB;
import com.jors.model.Venta;

public class VentaDAO {
    public void agregarVenta(Venta venta, Cliente cliente) throws SQLException{
        String sql = "INSERT INTO venta (id_venta, fecha, cedula_cliente) VALUES(?,?,?)";
        try (Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
                ps.setInt(1, 1);
                ps.setObject(2, venta.getFecha());
                ps.setString(3, cliente.getCedula().getValor());
                ps.executeUpdate();
        }
    }
}
