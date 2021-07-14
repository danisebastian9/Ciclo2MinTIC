
package Vista;

import java.util.Scanner;

public class vistaCuenta {
    
    public byte opcion;
    public String numero;
    public String tipoCuenta;
    public double valorInicial;
    public double monto;
    
    Scanner ingreso = new Scanner(System.in);
    
    
    public String capturaTipo(){
        System.out.println("Digite Tipo de Cuenta");
        this.tipoCuenta = ingreso.nextLine();
        while(!"ahorros".equals(this.tipoCuenta) && !"credito".equals(this.tipoCuenta) ){
            System.out.println("Tipo de cuenta invalida. Ingrese ahorros o credito");
            System.out.println("Digite Tipo de Cuenta");
            this.tipoCuenta = ingreso.nextLine();
        }
        return this.tipoCuenta;
    }
    
    public double capturaValor(){
        this.valorInicial = ingreso.nextDouble();
        return this.valorInicial;
    }
    
    public double capturaMonto(){
        this.valorInicial = ingreso.nextDouble();
        return this.valorInicial;
    }
    
    
    public byte mostrarMenu(){
        System.out.println("1. Crear Cuenta\n2. Consignar\n3. Retirar\n4. Saldo Actual\n5. Mostrar Saldo Minimo\n6.Capacidad Credito");
        System.out.println("Ingrese la opcion: ");
        this.opcion = ingreso.nextByte();
        
        while(!(this.opcion >= 1 && this.opcion <=6)){
            System.out.println("Opcion invalida");
            System.out.println("1. Crear Cuenta\n2. Consignar\n3. Retirar\n4. Saldo Actual\n5. Mostrar Saldo Minimo\n6.Capacidad Credito");
            System.out.println("Ingrese la opcion: ");
            this.opcion = ingreso.nextByte();
        }
        switch(opcion){
            case 1 -> {
                return this.opcion;
            } 
            case 2 -> {
                return this.opcion;
            } 
            case 3 -> {
                return this.opcion;
            } 
            case 4 -> {
                return this.opcion;
            } 
            case 5 -> {
                return this.opcion;
            } 
            case 6 -> {
                return this.opcion;
            }
            default -> {                  
            }
        }
        return this.opcion;    
    }
    
}
