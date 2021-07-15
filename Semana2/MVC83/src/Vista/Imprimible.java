/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Vista;
import java.util.Scanner;
/**
 *
 * @author ginap
 */
public class Imprimible {
    int msg_default;
    public Imprimible(){
    }
    
    public void mostrar_mensaje(String mensaje){
        System.out.println(mensaje);
    }

     public int capturar_entero(){
        Scanner leer = new Scanner(System.in);
        return (leer.nextInt());
    }
    public void mostrar_entero(int N){
        System.out.print(N);
    }

    

}
