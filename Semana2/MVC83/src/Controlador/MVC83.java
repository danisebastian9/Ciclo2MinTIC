/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;
import Modelo.Racional;
import Vista.Imprimible;
import java.util.Scanner;
/**
 *
 * @author ginap
 */
public class MVC83 {
 static Imprimible I = new Imprimible();
        static Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc, N, D;
        Racional A=new Racional();
        Racional B=new Racional();
        Racional C=new Racional();
        
       
        do{
          opc= menu();
          switch(opc){
            case 1: I.mostrar_mensaje("Digite el numerador: ");
                    N= I.capturar_entero();
                    I.mostrar_mensaje("Digite el denominador: ");
                    D= I.capturar_entero();
                    if (D == 0){
                        I.mostrar_mensaje("NO SE ACEPTA CERO");
                    }else{
                        A.setnumerador(N);
                        A.setdenominador(D);
                    }
                    break;
            case 2:I.mostrar_mensaje("Digite el numerador: ");
                    N= I.capturar_entero();
                    I.mostrar_mensaje("Digite el denominador: ");
                    D= I.capturar_entero();
                    if (D == 0){
                        I.mostrar_mensaje("NO SE ACEPTA CERO");
                    }else{
                        B.setnumerador(N);
                        B.setdenominador(D);
                    }
                    break;
            case 3: I.mostrar_mensaje("El Racional A es = ");
                    A.Imprimir(A);
                    I.mostrar_mensaje("El Racional B es = ");
                    B.Imprimir(B);
                    break;
            case 4: C=C.Sumar(A, B);
                    I.mostrar_mensaje("Suma de A+B =");
                    C.Imprimir(C);
                    break;
            case 5: C=C.Restar(B, A);
                    I.mostrar_mensaje("Resta de B-A =");
                    C.Imprimir(C);
                    break;
            case 6: C=C.Simplificar(A);
                    I.mostrar_mensaje("Simplicación de A = ");
                    A.Imprimir(A);
                    break;
            case 7: C=C.Simplificar(B);
                    I.mostrar_mensaje("Simplicación de B = ");
                    B.Imprimir(B);
                    break;
            
           
          }          
        }while(opc!= 8);   
    }
        
        
        
    public static int menu(){
        int opcion;
       // Scanner leer= new Scanner(System.in);
        I.mostrar_mensaje("MENU\n" +
"1.	Leer Fraccionario A\n" +
"2.	Leer Fraccionario B\n" +
"3.	Imprimir Fraccionario A y B\n" +
"4.	Sumar A + B\n" +
"5.	Restar B – A\n" +
"6.	Simplificar A\n" +
"7.	Simplificar B\n" +
"8.	Terminar\n" +
"9.    OTRO"+ "");
        opcion= I.capturar_entero();
        return opcion;
    }
    
}
