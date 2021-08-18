package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class Inventario {
    
    public ArrayList<Estudiantes> lista = new ArrayList<Estudiantes>();
    Conexion con = new Conexion();
    Connection conec = con.Conecta();

    PreparedStatement ps = null; 
    Statement st = null; 
    ResultSet res = null; 

    public boolean agregarEstudiante(Estudiantes est){
        boolean resultado = false;
        try {
            String sql = "INSERT INTO estudiantes VALUE(?,?,?,?,?,?,?,?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1, est.getNombres());
            ps.setString(2, est.getApellidos());
            ps.setString(3, est.getFechaNacimiento());
            ps.setString(4, est.getInstEmail());
            ps.setString(5, est.getPersEmail());
            ps.setLong(6, est.getCelNum());
            ps.setLong(7, est.getFijoNum());
            ps.setString(8, est.getProgAcademico());
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al Insertar: "+ e);
        }
        return resultado;
    }

    public Estudiantes buscarEstudiante(String iEmail){
        Estudiantes z = null; 
        try {
            String sql = "SELECT * FROM estudiantes WHERE CorreoInstitucional = ?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, iEmail);
            res = ps.executeQuery(); // Trae datos de la tabla

            while(res.next()){
                z = new Estudiantes(res.getString(1), res.getString(2), res.getString(3),res.getString(4), res.getString(5), res.getLong(6), res.getLong(7), res.getString(8));
            }
        } catch (SQLException e) {
            System.out.println("Error al Consultar: "+ e);
        }
        return z; 
    }

    public boolean modificarEstudiante(String iEmail, String perEmail, long numCel, long numFijo, String prog){
        boolean resultado = false; 
        try {
            String sql = "UPDATE estudiantes SET CorreoPersonal = ?, TelCel = ?, TelFijo = ?, Programa = ? WHERE CorreoInstitucional = ?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, perEmail);
            ps.setLong(2, numCel);
            ps.setLong(3, numFijo);
            ps.setString(4, prog);
            resultado = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al Modificar: "+ e);
        }
        return resultado;
    }

    public ArrayList<Estudiantes> consultaTodos(){ // Consulta todos
        try {
           String sql = "SELECT * FROM estudiantes";
           st = conec.createStatement();
           res = st.executeQuery(sql);
           
           while(res.next()){
            Estudiantes est = new Estudiantes(res.getString(1), res.getString(2), res.getString(3),res.getString(4), res.getString(5), res.getLong(6), res.getLong(7), res.getString(8));
            lista.add(est);
           }
        } catch (SQLException e) {
            System.out.println("Error al Consultar: "+ e);
        }
        return lista;
    }


    public boolean eliminarEstudiante(String iEmail){
        boolean resultado = false;
        try {
            String sql = "DELETE FROM estudiantes WHERE CorreoInstitucional = ?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, iEmail);
            resultado = ps.executeUpdate() > 0;
        } catch (SQLException e) {
            System.out.println("Error al Eliminar producto: "+ e);
        }
        return resultado;
    }

    public ArrayList<Estudiantes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiantes> lista) {
        this.lista = lista;
    }


}
