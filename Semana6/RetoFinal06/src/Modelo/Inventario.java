package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    public ArrayList<Estudiantes> lista = new ArrayList<Estudiantes>();

    //Archivo  arch = new Archivo();

    public void agregarEstudiante(Estudiantes est){
        lista.add(est);
        //arch.escribirArchivo(lista, arch.getArchivo());
    }

    public Estudiantes buscarEstudiante(String iEmail){
        //lista = arch.leerArchivo(arch.getArchivo());
        Estudiantes x = null;
        for(Estudiantes est:lista){
            if(est.getInstEmail().equals(iEmail)){
                x = est;
                return est;
            }
        }
        return x;
    }

    public void modificarEstudiante(String iEmail, String perEmail, long numCel, long numFijo, String prog){
        //lista = arch.leerArchivo(arch.getArchivo());
        int contador = 0;
        for(Estudiantes est:lista){
            if(est.getInstEmail().equals(iEmail)){
                // lista.set(contador, new Estudiantes(perEmail, numCel, numFijo, prog));
                lista.set(contador, new Estudiantes(iEmail, perEmail, numCel, numFijo, prog));
            }
            contador++;
        }
        //arch.escribirArchivo(lista, arch.getArchivo());
    }

    public void eliminarEstudiante(String iEmail){
        //lista = arch.leerArchivo(arch.getArchivo());
        Estudiantes est = this.buscarEstudiante(iEmail);
        lista.remove(est);
        //arch.escribirArchivo(lista, arch.getArchivo());
    }

    public ArrayList<Estudiantes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Estudiantes> lista) {
        this.lista = lista;
    }


}
