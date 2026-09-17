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


public class ClienteDAO {
    public void insertar(Cliente cliente) throws SQLException{
        String sql = "INSERT INTO cliente (id, cedula, nombre, apellido, celular, direccion_principal, direccion_secundaria) VALUES (?,?,?,?,?,?)";
        try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS)){
                ps.setString(2, cliente.getCedula());
                ps.setString(3, cliente.getNombre());
                ps.setString(4, cliente.getApellido());
                ps.setString(5, cliente.getCelular());
                ps.setString(6,cliente.getDireccionPrimaria());
                ps.setString(7,cliente.getDireccionSecundaria());
                ResultSet rs = ps.getGeneratedKeys();
                if (rs.next()){
                    int idGenerado = rs.getInt(1);
                    cliente.setId(idGenerado);
                    ps.setInt(1, idGenerado);
                }
                ps.executeLargeUpdate();
        } 
    }

    public List<Cliente> obtenerTodos() throws SQLException{
        List<Cliente> clientes = new ArrayList<>();
        String sql = """
                SELECT 
                id, cedula, nombre, apellido, celular, direccion_principal, direccion_secundaria
                FROM cliente;
                """;
         try(Connection con = ConexionDB.obtenerConexion();
            PreparedStatement ps = con.prepareStatement(sql)){
            try(ResultSet rs = ps.executeQuery()){
                while(rs.next()){
                    Cliente cliente = new Cliente(rs.getInt("id"), 
                        new Cedula(rs.getString("cedula")), 
                        rs.getString("nombre"), 
                        rs.getString("apellido"), 
                        new Celular(rs.getString("celular")), 
                        new Direccion(rs.getString("direccion_principal"), rs.getString("direccion_secundaria")));
                    clientes.add(cliente);
                }
            }
        }
        return clientes;
    }

    public boolean actualizar(Cliente cliente) throws SQLException{
        if (cliente.getId() == null){
            throw new IllegalArgumentException("No se puede actualizar a un cliente que no tiene un ID asignado");
        }
        String sql = """
                UPTADE cliente SET
                cedula = ?,
                nombre = ?,
                apellido = ?,
                celular = ?,
                direccion_principal = ?,
                direccion_secundaria = ?
                WHERE id = ?
                """;
        try (Connection con = ConexionDB.obtenerConexion();
        PreparedStatement ps = con.prepareStatement(sql)){
            ps.setString(1,cliente.getCedula());
            ps.setString(2,cliente.getNombre());
            ps.setString(3,cliente.getApellido());
            ps.setString(4,cliente.getCelular());
            if (cliente.getDireccion() != null){
                ps.setString(5,cliente.getDireccionPrimaria());
                ps.setString(6,cliente.getDireccionSecundaria());
            } else {
                ps.setNull(5, java.sql.Types.VARCHAR);
                ps.setNull(6, java.sql.Types.VARCHAR);
            }
            ps.setInt(7, cliente.getId());
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        }
    }

    public boolean eliminar(Cliente cliente) throws SQLException{
        String sql = """
            DETELE FROM cliente WHERE id = ?
        """;
        try (Connection con = ConexionDB.obtenerConexion();
        PreparedStatement ps = con.prepareStatement(sql)){
            ps.setInt(1, cliente.getId());

            int filasAfectada = ps.executeUpdate();
            return filasAfectada > 0;
        }
    }
}
