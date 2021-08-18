package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;


public class Inventario {
    
    //CRUD : Create, Read, Update, Delete
    public ArrayList<Productos> lista = new ArrayList<Productos>();
    Conexion con = new Conexion();
    Connection conec = con.Conecta();

    PreparedStatement ps = null; // preparar consultas de DB para pasar datos
    Statement st = null; // Prepara consulta pero no pasa datos
    ResultSet res = null; // Objeto tipo resultado tipo SELECT


    public boolean agregarProducto(Productos p){ // Metodo agregar a la lista
        boolean resultado = false;
        try {
            String sql = "insert into productos value(?,?,?,?)";
            ps = conec.prepareStatement(sql);
            ps.setString(1, p.getReferencia());
            ps.setString(2, p.getNombre());
            ps.setLong(3, p.getPrecio());
            ps.setString(4, p.getCategoria());
            resultado = ps.executeUpdate() > 0; // Actualiza datos en la DB


        } catch (SQLException e) {
            System.out.println("Error al Insertar: "+ e);
        }
        return resultado; 
    }

    public Productos buscarProducto(String ref){ // Metodo buscar por referencia
        Productos z = null; 
        try {
            String sql = "SELECT * FROM productos WHERE referencia = ?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, ref);
            res = ps.executeQuery(); // Trae datos de la tabla

            while(res.next()){
                z = new Productos(res.getString(1),res.getString(2),res.getLong(3), res.getString(4));
            }
        } catch (SQLException e) {
            System.out.println("Error al Consultar: "+ e);
        }
        return z; 
    }

    public ArrayList<Productos> consultaTodos(){ // Consulta todos
        try {
           String sql = "SELECT * FROM productos";
           st = conec.createStatement();
           res = st.executeQuery(sql);
           
           while(res.next()){
            Productos p = new Productos(res.getString(1),res.getString(2),res.getLong(3), res.getString(4));
            lista.add(p);
           }
        } catch (SQLException e) {
            System.out.println("Error al Consultar: "+ e);
        }
        return lista;
    }

    public boolean modificarProducto(String ref, String nom, long pre, String categoria){  // Metodo para Modificar
        boolean resultado = false; 
        try {
            String sql = "UPDATE productos SET nombre = ?, precio = ?, categoria = ? WHERE referencia = ?";
            ps = conec.prepareStatement(sql);
            ps.setString(1, nom);
            ps.setDouble(2, pre);
            ps.setString(3, categoria);
            ps.setString(4, ref);
            resultado = ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.out.println("Error al Modificar: "+ e);
        }
        return resultado;
    }

    public void eliminarProducto(String ref){  // Metodo para Eliminar
        //lista = arch.leerArchivo(arch.getArchivo());
        Productos p = this.buscarProducto(ref);
        lista.remove(p);
        //arch.escribirArchivo(lista, arch.getArchivo());
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }
    

}
