package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    //CRUD : Create, Read, Update, Delete
    public ArrayList<Productos> lista = new ArrayList<Productos>();

    public void agregarProducto(Productos p){ // Metodo agregar a la lista
        lista.add(p);
    }

    public Productos buscarProducto(String ref){ // Metodo buscar por referencia
        Productos z = null; 
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                z = p; 
                return p;
            }
        }
        return z; 
    }

    public void modificarProducto(String ref, String nom, long pre){  // Metodo para Modificar
        int contador = 0;
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                lista.set(contador, new Productos(ref, nom, pre));
            }
            contador++;
        }
    }

    public void eliminarProducto(String ref){  // Metodo para Eliminar
        int contador = 0;
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                lista.remove(contador);
            }
            contador++;
        }
    }


    
      
}
