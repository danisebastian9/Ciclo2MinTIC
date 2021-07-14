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
    
    public modeloCuenta(){
        
    }

    public modeloCuenta(String tipoCuenta, double valorInicial) {
        this.tipoCuenta = tipoCuenta;
        this.valorInicial = valorInicial;
    }
    
    
}
