package exer01;

import java.util.Scanner;

/**
 *
 * @author sebas
 */
public class Exer01 {
    public static void main(String[] args) {
        
        int x = 1;
        while(x <= 5){
            System.out.println("Hola Mundo");
            x++;
        }
        
        x = 0;
        
        do{
            System.out.println("Hola Muchachos....");
            x++;
        }while(x <= 2);
        
        int num;
        Scanner ingreso = new Scanner(System.in);
        num = ingreso.nextInt();
        if (num > 1){
            for(int i=1; i <= num ; i++ ){
                System.out.println("Manejando for..");
            }
        }
    }
    
}
