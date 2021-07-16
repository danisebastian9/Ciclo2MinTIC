package Controller;

import Model.modelServicios;
import View.viewServicios;

public class controllerServicios {

    public int servicioPub;
    public int estrato;
    public int consumo;
    public double precioUnidad;
    public double precioNeto;

    viewServicios vS = new viewServicios();
    modelServicios mS = new modelServicios();
    
    public void control(){
        do {
            this.servicioPub = vS.capturarServPub();
            switch(this.servicioPub){
                case 1, 2, 3 -> {
                    vS.servicioPagar();
                    this.estrato = vS.capturaEstrato();
                    this.consumo = vS.capturarConsumo();
                    System.out.println("El consumo fue: "+ consumo);
                    System.out.println("Valor unidad: "+ mS.valorUnidad(servicioPub));
                    System.out.println("Estrato del inmueble: "+ estrato);
                    System.out.println("Costo total: "+ mS.totalNeto(consumo));
                    if(estrato >= 5 && estrato <= 6){
                        System.out.println("Descuento o sobrecosto: "+ mS.descSobr(estrato));
                    }else{
                        System.out.println("Descuento o sobrecosto: -"+ mS.descSobr(estrato));
                    }
                    System.out.println("Impuesto por infraestructura: "+ mS.impuestoDaños());
                    System.out.println("TOTAL A PAGAR: "+ mS.totalFactura(estrato) +"\n");
                    break;
                }
                case 4 -> {
                    System.out.println("Hasta Pronto");
                    System.exit(0);

                }
                default ->{
                    System.out.println("Opcion invalida");
                }
            } 
        } while(this.servicioPub >= 1 && this.servicioPub <= 4);
    }
    
}
