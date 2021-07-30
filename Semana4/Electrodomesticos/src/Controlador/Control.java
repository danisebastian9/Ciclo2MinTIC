package Controlador;
import Modelo.Electrodomestico;
import Modelo.Lavadora;
import Modelo.Television;
import Vista.Vista;

public class Control {

    Vista view = new Vista();

    public void Principal(){

        byte op1 = view.mostrarMenu2();

        int tamanio = view.capturaTam();
        Electrodomestico[] guardar = new Electrodomestico[tamanio];

        while(op1>= 1 && op1 <= 3){
            switch(op1){
                case 1:
                    for(int i = 0; i<guardar.length; i++){
                        byte op2 = view.mostrarMenu();
                        switch(op2){
                            case 1:
                            Lavadora lav = new Lavadora(view.capturaPrecioBase(), view.capturaColor(), view.capturaConsumo(), view.capturaPeso(), view.capturaCarga());
                            guardar[i] = lav;                
                            break;
                            case 2:
                            Television tv = new Television(view.capturaPrecioBase(), view.capturaColor(), view.capturaConsumo(), view.capturaPeso(), view.capturaResolucion(), view.capturaTdt());
                            guardar[i] = tv;
                            break;
                    }
                }
                break;
                case 2:
                double sumaLavadoras = 0;
                double sumaTvs = 0;
                double sumaTotal = 0;
    
                for(Electrodomestico e: guardar){
                    e.precioFinal();
                    if(e instanceof Lavadora){ // Instanceof = compara si un objeto es de esa clase. 
                        System.out.println("Lavadora " + e.getPrecioBase());
                        sumaLavadoras += e.getPrecioBase();
                    } else if(e instanceof Television) {
                        System.out.println("Televisor " + e.getPrecioBase());
                        sumaTvs += e.getPrecioBase();
                    }
                }
                System.out.println("Suma de Lavadoras: " + sumaLavadoras);
                System.out.println("Suma de Televisores: " + sumaTvs);
                break;
                case 3: 
                System.exit(0);
                break;
            }
            op1 = view.mostrarMenu2();
        }






    }
}
