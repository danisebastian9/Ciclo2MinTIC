package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    //CRUD : Create, Read, Update, Delete
    public ArrayList<Productos> lista = new ArrayList<Productos>();

    Archivo  arch = new Archivo();


    public void agregarProducto(Productos p){ // Metodo agregar a la lista
        lista.add(p);
        arch.escribirArchivo(lista, arch.getArchivo());
    }

    public Productos buscarProducto(String ref){ // Metodo buscar por referencia
        lista = arch.leerArchivo(arch.getArchivo());
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
        lista = arch.leerArchivo(arch.getArchivo());
        int contador = 0;
        for(Productos p:lista){
            if(p.getReferencia().equals(ref)){
                lista.set(contador, new Productos(ref, nom, pre));
            }
            contador++;
        }
        arch.escribirArchivo(lista, arch.getArchivo());
    }

    public void eliminarProducto(String ref){  // Metodo para Eliminar
        lista = arch.leerArchivo(arch.getArchivo());
        Productos p = this.buscarProducto(ref);
        lista.remove(p);
        arch.escribirArchivo(lista, arch.getArchivo());
    }

    public ArrayList<Productos> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Productos> lista) {
        this.lista = lista;
    }
    

}
