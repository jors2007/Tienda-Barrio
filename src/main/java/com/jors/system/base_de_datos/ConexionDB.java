package com.jors.system.base_de_datos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/bdtiendabarrio";
    private static final String USER = "root";
    private static final String PASSWORD = "RominaandJordy@";

    public static Connection obtenerConexion() throws SQLException{
        return DriverManager.getConnection(URL,USER,PASSWORD);
    }
}
