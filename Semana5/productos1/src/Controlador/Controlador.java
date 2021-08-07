package Controlador;

import Modelo.Inventario;
import Modelo.Productos;
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
                case 1 :
                    Productos p = new Productos(vis.capturaRef(), vis.capturaNombre(), vis.capturaPrecio());
                    lista.agregarProducto(p);
                    break;
                case 2 :
                    mens = lista.buscarProducto(vis.capturaRef()).mostrarProducto();
                    vis.imprimir(mens);
                    break;
                case 3 :
                    lista.modificarProducto(vis.capturaRef(), vis.capturaNombre(), vis.capturaPrecio());
                    break;
                case 4 : 
                    lista.eliminarProducto(vis.capturaRef());
                break;
                case 5 :
                    for(Productos prods: lista.getLista()){
                        vis.imprimir(prods.mostrarProducto());
                    }
                    break;
                case 6 : 
                    vis.imprimir("Hasta Pronto");
                    System.exit(0);
            
            }
            opcion = vis.mostrarMenu();
        }


    }
    
}
