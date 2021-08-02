package Controlador;

import Modelo.Estudiantes;
import Modelo.Inventario;
import Vista.Vista;

public class Controlador {
    
    Vista vis = new Vista();
    Inventario lista = new Inventario();

    public void Control(){
        byte opcion = 0;
        opcion = vis.mostrarMenu();
        String mens = "";

        while(opcion >= 1 && opcion <= 6){
            switch(opcion){
                case 1:
                Estudiantes est = new Estudiantes(vis.capturaNombre(), vis.capturaApellidos(), vis.capturaFechaNac(), vis.capturaInstEmail(), vis.capturaPersEmail(), vis.capturaCelNum(), vis.capturaFijoNum(), vis.capturaPrograma());
                lista.agregarEstudiante(est);
                break;
                case 2:
                mens = lista.buscarEstudiante(vis.capturaInstEmail()).mostrarProducto();
                vis.imprimir(mens);
                break;
                
            }
        }
    }
}
