package Modelo;

import java.util.ArrayList;

public class Inventario {
    
    public ArrayList<Estudiantes> lista = new ArrayList<Estudiantes>();

    public void agregarEstudiante(Estudiantes est){
        lista.add(est);
    }

    public Estudiantes buscarEstudiante(String iEmail){
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
        int contador = 0;
        for(Estudiantes est:lista){
            if(est.getInstEmail().equals(iEmail)){
                // lista.set(contador, new Estudiantes(perEmail, numCel, numFijo, prog));
                lista.set(contador, new Estudiantes(iEmail, perEmail, numCel, numFijo, prog));
            }
            contador++;
        }
    }

    public void eliminarEstudiante(String iEmail){
        for(Estudiantes est:lista){
            if(est.getInstEmail().equals(iEmail)){
                lista.remove(lista.indexOf(est));
            }
        }
    }

    public ArrayList<Estudiantes> getLista() {
        return lista;
    }

    

}
