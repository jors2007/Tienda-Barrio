package com.jors;

import java.sql.Connection;
import java.sql.SQLException;

import com.jors.system.base_de_datos.ConexionDB;

public class Main{
    public static void main(String[] args) {
        try(Connection con = ConexionDB.obtenerConexion()){
            if(con != null){
                System.out.println("Conexion exitosa");
            }
        } catch (SQLException e) {
            System.err.println("Fallo al conectar con la base de datos: " + e.getMessage());
        }
    }
}