package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    public Connection Conecta(){
        Connection conec = null;

        try {
            conec = DriverManager.getConnection("jdbc:sqlite:bd_estudiantes.db");
            System.out.println("Conexion ok....");
        } catch (SQLException e) {
            System.out.println("No se pudo conectar..." + e);
        }
        return conec;
    }
}
