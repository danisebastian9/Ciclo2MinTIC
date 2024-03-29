package Modelo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Archivo {
    
    private File archivo = new File("datos_productos.dat"); // Definiendo archivo a trabajar
    
    private ObjectInputStream leer;
    private ObjectOutputStream escribir;

    public void escribirArchivo(ArrayList<Productos> lista, File arch1){ // Escribir la lista en el archivo

        try {
            escribir = new ObjectOutputStream(new FileOutputStream(arch1));
            escribir.writeObject(lista);
            escribir.close();
        } catch (Exception e) {
            System.out.println("Error en Escritura "+ e);
        }
    }


    public ArrayList<Productos> leerArchivo(File arch1){

        ArrayList<Productos> recuperar = new ArrayList<Productos>();

        try {
            leer = new ObjectInputStream(new FileInputStream(archivo));
            recuperar = (ArrayList<Productos>) leer.readObject();
            leer.close();
        } catch (Exception e) {
            System.out.println("Error en Lectura "+ e);
        }
        return recuperar;
    }


    public File getArchivo() {
        return archivo;
    }


    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    

}
