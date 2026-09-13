package com.jors.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.jors.model.Cliente;
import com.jors.model.ConexionDB;


public class ClienteDAO {
    public void insertarCliente(Cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente (cedula, nombre, apellido, celular, direccion_principal, direccion_secundaria) VALUES (?,?,?,?,?,?)";
        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
                ps.setString(1, cliente.getCedula());
                ps.setString(2, cliente.getNombre());
                ps.setString(3, cliente.getApellido());
                ps.setString(4, cliente.getCelular());
                ps.setString(5,cliente.getDireccionPrimaria());
                ps.setString(6,cliente.getDireccionSecundaria());
            ps.executeLargeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()){
                int idGenerado = rs.getInt(1);
                cliente.setId(idGenerado);
            }
        } 
    }
}
