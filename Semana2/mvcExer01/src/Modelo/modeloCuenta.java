/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author sebas
 */
public class modeloCuenta {
    
    public String numero;
    public String tipoCuenta;
    public double valorInicial;
    public double saldoActual;
    public double saldoMinimo;
    public double capacidadCredito;
    
    
    public modeloCuenta(){     
    }

    public modeloCuenta(String tipoCuenta, double valorInicial) {
        this.tipoCuenta = tipoCuenta;
        if(this.tipoCuenta.equals("ahorros"))
        this.valorInicial = valorInicial;
        this.saldoMinimo = this.valorInicial * 0.1;
        this.saldoActual = this.valorInicial;
    }
    
    public void consignar(double monto){
        this.saldoActual += monto;
    }

    public void retirar(double monto){
        double disponible = this.saldoActual - this.saldoMinimo;
        if(disponible >= monto){
            this.saldoActual -= monto;
        } else{
            System.out.println("El maximo monto a retirar es: " +disponible);
            this.saldoActual -= disponible;
        }
    }
    
    public double mostrarSaldoActual(){
        return this.saldoActual;
    }
    
    public double mostrarSaldoMinimo(){
        return this.saldoMinimo;
    }
    
    public double mostrarCapacidad(){
        if(this.tipoCuenta.equals("ahorros")){
            this.capacidadCredito = this.saldoActual - this.saldoMinimo;
        }else{
            this.capacidadCredito = this.saldoActual * 3;
        }
        return this.capacidadCredito;
    }
}
