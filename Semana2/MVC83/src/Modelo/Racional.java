/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;
import java.lang.Math;

/**
 *
 * @author ginap
 */
public class Racional {
    private int numerador;
    private int denominador;
    
    public Racional(){
        numerador = 0;
        denominador=1;
    }
    public void setnumerador(int N){
        numerador = N;
    }
    public void setdenominador(int D){
        if (D != 0)
            denominador = D;
    }
    public int getnumerador(){
        return numerador;
    }
    public int getdenominador(){
        return denominador;
    }
    public Racional Sumar(Racional A, Racional B){
        Racional R = new Racional();
        R.numerador = (A.numerador*B.denominador)+(A.denominador*B.numerador);
        R.denominador= A.denominador * B.denominador;
        R = R.Simplificar(R);
        return R;
    }
    public Racional Restar(Racional A, Racional B){
        Racional R = new Racional();
        R.numerador = (A.numerador*B.denominador)-(A.denominador*B.numerador);
        R.denominador= A.denominador * B.denominador;
        R = R.Simplificar(R);
        return R;
    }
    public Racional Simplificar(Racional f){
        int menor;    
        boolean hay_divisor;
        if (Math.abs(f.numerador) <= Math.abs(f.denominador))
            menor = Math.abs(f.numerador);  
        else
            menor = Math.abs(f.denominador);
        do{
          hay_divisor= false;
        
          for(int i=2; i <= menor; i++){
            //detecta si i divide la fraccion
            if (f.numerador%i==0 && f.denominador%i==0){
                f.numerador = f.numerador/i;
                f.denominador = f.denominador/i;
                if (Math.abs(f.numerador) <= Math.abs(f.denominador))
                    menor = Math.abs(f.numerador);  
                else
                    menor = Math.abs(f.denominador);
                hay_divisor = true;
            }
          }
        }while(hay_divisor==true);
        return f;
    }
    public void Imprimir(Racional f){
        System.out.println(f.numerador+" / "+ f.denominador);
    }
}
