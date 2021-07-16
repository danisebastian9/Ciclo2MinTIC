package View;

import java.util.Scanner;
import Controller.controllerServicios;

public class viewServicios {
    
    public int servicioPub;
    public int estrato;
    public int consumo;

    Scanner ingreso = new Scanner(System.in);
    
    
    public int capturarServPub(){
        System.out.println("PAGO DE SERVICIOS PUBLICOS\nSeleccione el servicio publico:\n1. Energia\n2. Acueducto\n3. Gas Natural\n4. Salir\n\nOpcion:");
        this.servicioPub = ingreso.nextInt();
        return servicioPub;
    }

    public int capturaEstrato(){
        System.out.println("Estrato del inmueble:");
        this.estrato = ingreso.nextInt();
        return estrato;
    }

    public int capturarConsumo(){
        System.out.println("Consumo del inmueble:");
        this.consumo = ingreso.nextInt();
        return consumo;
    }

    public void connectController(){
        controllerServicios cC = new controllerServicios();
        cC.control();
    }

}
