
package Controlador;

import Modelo.modeloCuenta;
import Vista.vistaCuenta;


public class controladorCuenta {
    
    public byte opcion;
    public String tipoCuenta;
    public double valorInicial;
    public double monto;
    
    
    vistaCuenta vc = new vistaCuenta();
    
    private modeloCuenta crear(){
        this.tipoCuenta = vc.capturaTipo();
        this.valorInicial = vc.capturaValor();
        modeloCuenta mc = new modeloCuenta(this.tipoCuenta, this.valorInicial);
        return mc;
    }
    
    public void control(){
        modeloCuenta modC = this.crear();
        this.opcion = vc.mostrarMenu();
        
        while(this.opcion >= 2 && this.opcion <=6){
            switch(this.opcion){
                case 1 -> {
                    System.exit(0);
                }
                case 2 -> {
                    this.monto = vc.capturaMonto();
                    modC.consignar(this.monto);
                    break;
                } 
                case 3 -> {
                    this.monto = vc.capturaMonto();
                    modC.retirar(this.monto);
                    break;
                } 
                case 4 -> {
                    System.out.println("Saldo actual: "+ modC.mostrarSaldoActual());
                    break;
                } 
                case 5 -> {
                    System.out.println("Saldo Minimo: "+ modC.mostrarSaldoMinimo());
                    break;
                } 
                case 6 -> {
                    System.out.println("Capacidad de credito: "+ modC.mostrarCapacidad());
                }
                default -> {   
                    break;
                }
            } 
            this.opcion = vc.mostrarMenu();
        }

    }
}
