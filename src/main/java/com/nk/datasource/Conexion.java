package com.nk.datasource;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion implements IConexion {

    private static Conexion conexion;
    private Connection connection;

    private Conexion() {
        this.conexion = null;
        this.connection = null;
        try {
            Class.forName(DRIVER);
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexion exitosa");
        } catch (SQLException e) {
            System.out.println("Conexion fallida: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Driver no encontrado: " + e);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public synchronized static Conexion getConexion() {
        return (conexion == null) ? new Conexion() : conexion;
    }

    @Override
    public Connection getConnection() {
        return connection;
    }

    @Override
    public void closeConexion() {
        this.conexion = null;
    }

}
