package Controlador;

import Modelo.Archivo;
import Modelo.Estudiantes;
import Modelo.Inventario;
import Vista.Vista;

public class Controlador {
    
    Vista vis = new Vista();
    Inventario lista = new Inventario();
    Archivo  arch = new Archivo();

    public void Control(){
        byte opcion = 0;
        opcion = vis.mostrarMenu();
        String mens = "";

        while(opcion >= 1 && opcion <= 6){
            switch(opcion){
                case 1:
                // vis.imprimir("Ingresar estudiante");
                Estudiantes est = new Estudiantes(vis.capturaNombre(), vis.capturaApellidos(), vis.capturaFechaNac(), vis.capturaInstEmail(), vis.capturaPersEmail(), vis.capturaCelNum(), vis.capturaFijoNum(), vis.capturaPrograma());
                lista.agregarEstudiante(est);
                vis.imprimir("Se agregó el estudiante");
                break;
                case 2:
                vis.imprimir("Buscar estudiante");
                mens = lista.buscarEstudiante(vis.capturaInstEmail()).mostrarProducto();
                vis.imprimir(mens);
                break;
                case 3:
                vis.imprimir("Modificar estudiante");
                lista.modificarEstudiante(vis.capturaInstEmail(), vis.capturaPersEmail(), vis.capturaCelNum(), vis.capturaFijoNum(), vis.capturaPrograma());
                vis.imprimir("Se modificó el estudiante");
                break;
                case 4:
                vis.imprimir("Eliminar estudiante");
                lista.eliminarEstudiante(vis.capturaInstEmail());
                vis.imprimir("Se eliminó el estudiante");
                break;
                case 5: 
                vis.imprimir("El directorio de los estudiantes");
                lista.setLista(arch.leerArchivo(arch.getArchivo()));;
                for(Estudiantes estu: lista.getLista()){
                    vis.imprimir(estu.mostrarProducto());
                }
                break;
                case 6:
                vis.imprimir("Hasta pronto");
                System.exit(0);
            }
            opcion = vis.mostrarMenu();
        }
    }
}
