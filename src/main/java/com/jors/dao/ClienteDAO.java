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

    public void actualizar(Cliente cliente){
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
    }

    public void eliminar(Cliente cliente){

    }
}
