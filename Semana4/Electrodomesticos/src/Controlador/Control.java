package Controlador;
import Modelo.Lavadora;
import Modelo.Television;
import Vista.Vista;

public class Control {

    Vista view = new Vista();

    public void Principal(){

        byte op = view.mostrarMenu();
        switch(op){
            case 1:
            Lavadora lav = new Lavadora(view.capturaPrecioBase(), view.capturaColor(), view.capturaConsumo(), view.capturaPeso(), view.capturaCarga());
            lav.precioFinal();
            System.out.println("Precio Final de Lavadora: "+ lav.getPrecioBase());
            break;
            case 2:
            Television tv = new Television(view.capturaPrecioBase(), view.capturaColor(), view.capturaConsumo(), view.capturaPeso(), view.capturaResolucion(), view.capturaTdt());
            tv.precioFinal();
            System.out.println("Precio Final de Television: "+ tv.getPrecioBase());
            break;
            case 3:
            System.out.println("Hasta Pronto...");
            System.exit(0);
        }
    }
}
