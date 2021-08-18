package Controlador;

//import Modelo.Archivo;
import Modelo.Inventario;
import Modelo.Productos;
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
                case 1 :
                    Productos p = new Productos(vis.capturaRef(), vis.capturaNombre(), vis.capturaPrecio(), vis.capturaCategoria());
                    if (lista.agregarProducto(p)){
                        vis.imprimir("Se inserto el producto Correctamente");
                    };
                    break;
                case 2 :
                    mens = lista.buscarProducto(vis.capturaRef()).mostrarProducto();
                    vis.imprimir(mens);
                    break;
                case 3 :
                    if(lista.modificarProducto(vis.capturaRef(), vis.capturaNombre(), vis.capturaPrecio(), vis.capturaCategoria())){
                        vis.imprimir("Se Actualizo Correctamente el Producto");
                    } else {
                        vis.imprimir("El Producto no se actualizo");
                    }
                    break;
                case 4 : 
                    if(lista.eliminarProducto(vis.capturaRef())){
                        vis.imprimir("Se Elimino Correctamente el Producto");
                    }else{
                        vis.imprimir("El Producto no se Elimino");
                    }
                break;
                case 5 :
                    lista.setLista(lista.consultaTodos());
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
