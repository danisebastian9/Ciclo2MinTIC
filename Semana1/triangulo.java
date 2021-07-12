/*
Escriba un programa que lea tres numeros enteros y 
asigne el valor apropiado TRUE o FALSE a las siguientes 
variables Booleanas y muestre el tipo de triangulo que es
(Si es un triangulo)
A) Triangulo: TRUE si los numeros pueden representar longitudes 
de los lados de un triangulo (La suma de dos cualesquiera de los
lados debe ser mayor que el otro. )
b) Equilatero: TRUE si es un triangulo equilatero(Todos los lados son iguales)
c) Isoceles: TRUE si es un triangulo isosceles (Al menos dos lados son iguales)
d) Escaleno: TRUE si es un triangulo Escaleno (No tiene dos lados iguales)
*/
import java.util.Scanner;

public class triangulo {
    public static void main(String[] arg){
        int ladoA, ladoB, ladoC;

        Scanner ingreso = new Scanner(System.in);
        ladoA = Integer.parseInt(ingreso.nextLine());
        ladoB = Integer.parseInt(ingreso.nextLine());
        ladoC = Integer.parseInt(ingreso.nextLine());

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("El triangulo es equilatero");
        }else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
            System.out.println("El triangulo es isoceles");
        }else{
            System.out.println("El triangulo es escaleno");
        }
    }

}
