package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    //CRUD : Create, Read, Update, Delete
    public ArrayList<Productos> lista = new ArrayList<Productos>();

    Archivo  arch = new Archivo();


    public void agregarProducto(Productos p){ // Metodo agregar a la lista
        lista.add(p);
        arch.escribirArchivo(lista);
    }

    public Productos buscarProducto(String ref){ // Metodo buscar por referencia
        lista = arch.leerArchivo();
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
        lista = arch.leerArchivo();
        int contador = 0;
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                lista.set(contador, new Productos(ref, nom, pre));
            }
            contador++;
        }
        arch.escribirArchivo(lista);
    }

    public void eliminarProducto(String ref){  // Metodo para Eliminar
        lista = arch.leerArchivo();
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                lista.remove(lista.indexOf(p));
            }
        }
        arch.escribirArchivo(lista);
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

}
