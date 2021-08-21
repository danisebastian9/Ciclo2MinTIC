package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private String bd = "bd_estudiantes";
    private String url = "jdbc:mysql://localhost:3306/"+ bd;  
    private String user = "root";
    private String pass = "";
    Connection conec = null;
    public Connection Conecta(){

        try {
            conec = DriverManager.getConnection(url, user, pass);
            //conec = DriverManager.getConnection("jdbc:sqlite:bd_estudiantes.db");
            //System.out.println("Conexion ok....");
        } catch (SQLException e) {
            System.out.println("No se pudo conectar..." + e);
        }
        return conec;
    }
}
