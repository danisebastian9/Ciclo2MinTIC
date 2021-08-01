import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 0;
        int division;

        try{
            division = num1 / num2;
        }catch(ArithmeticException ex){
            division = 1;
            System.out.println("Error...." + ex.getMessage());
        }
        System.out.println("Respuesta: " + division);


        Scanner ingreso = new Scanner(System.in);
        int numero1= 0;
        try{
            numero1 = ingreso.nextInt();
        }catch(InputMismatchException excep){
            System.out.println("El dato de entrada debe ser un numero");
            System.out.println("Error en ingreso de datos "+ excep.getMessage());
        }
        System.out.println("El numero que dijito es: " + numero1);


        int[] datos = new int[30];
        try{
            datos[5] = 45;
            for(int i = 0;i < 50; i++){
                System.out.println("Datos: " + datos[i]);
            }
        }catch(Exception exptn){
            System.out.println("El indice esta fuera del tamaño del arreglo: " + exptn.getMessage());
        }finally{
            for(int i = 0;i < datos.length; i++){
                System.out.println("datos: " + datos[i]);
        }
        System.out.println("Continua el programa... ");



        // public static void prueba() throw ArrayIndexOutOfBoundsException{
        //     int[] datos = new int[30];
        //     for(int i = 0;i < 50; i++){
        //         System.out.println("Datos: " + datos[i]);
        //     }
        // }

    }
}
}
