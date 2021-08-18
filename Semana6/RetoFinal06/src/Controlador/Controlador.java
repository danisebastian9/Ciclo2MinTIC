package Controlador;

//import Modelo.Archivo;
import Modelo.Estudiantes;
import Modelo.Inventario;
import Vista.Vista;

public class Controlador {
    
    Vista vis = new Vista();
    Inventario lista = new Inventario();
    //Archivo  arch = new Archivo();

    public void Control(){
        byte opcion = 0;
        opcion = vis.mostrarMenu();
        String mens = "";

        while(opcion >= 1 && opcion <= 6){
            switch(opcion){
                case 1:
                    vis.imprimir("Ingresar estudiante");
                    Estudiantes est = new Estudiantes(vis.capturaNombre(), vis.capturaApellidos(), vis.capturaFechaNac(), vis.capturaInstEmail(), vis.capturaPersEmail(), vis.capturaCelNum(), vis.capturaFijoNum(), vis.capturaPrograma());
                    if(lista.agregarEstudiante(est)){
                        vis.imprimir("Se agregó el estudiante\n");
                    };
                    break;
                case 2:
                    vis.imprimir("Buscar estudiante");
                    Estudiantes b = lista.buscarEstudiante(vis.capturaInstEmail());
                    if(b != null){
                        mens = b.mostrarProducto();
                        vis.imprimir(mens);
                    } else {
                        vis.imprimir("No se encontro el Estudiante");
                    }
                    break;
                case 3:
                    vis.imprimir("Modificar estudiante");
                    if(lista.modificarEstudiante(vis.capturaInstEmail(), vis.capturaPersEmail(), vis.capturaCelNum(), vis.capturaFijoNum(), vis.capturaPrograma())){
                        vis.imprimir("Se modificó el estudiante\n");
                    } else {
                        vis.imprimir("El Estudiante no se actualizo");
                    }
                break;
                case 4:
                    vis.imprimir("Eliminar estudiante");
                    if(lista.eliminarEstudiante(vis.capturaInstEmail())){
                        vis.imprimir("Se eliminó el estudiante\n");
                    } else{
                        vis.imprimir("El Estudiante no se Eliminó");
                    }
                    break;
                case 5: 
                vis.imprimir("El directorio de los estudiantes\n");
                lista.setLista(lista.consultaTodos());
                for(Estudiantes estu: lista.getLista()){
                    vis.imprimir(estu.mostrarProducto2());
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
