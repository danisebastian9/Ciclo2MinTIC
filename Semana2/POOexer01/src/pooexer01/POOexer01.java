package pooexer01;

import java.util.Scanner;

public class POOexer01 {

    public static void main(String[] args) {
        
        String color;
        // Instanciar clase automovil
        Automovil miCarro = new Automovil();
        
        miCarro.marca = "Brilliance";
        miCarro.estado = "Detenido";
        miCarro.color = "Negro";
        miCarro.ruedas = 4;
        
        System.out.println("Mi carro es "+ miCarro.color);
        Scanner ingreso = new Scanner(System.in);
        color = ingreso.nextLine();
        String nuevoColor = miCarro.modificaColor(color);
        System.out.println("Mi carro nuevo color es "+ miCarro.color);
        miCarro.arrancar();
        System.out.println("Estado mi carro "+ miCarro.estado);
        
        Automovil lucyCarro = new Automovil();
        
        lucyCarro.color = "Rojo";
        lucyCarro.marca = "Renault";
        
        System.out.println("El carro de Lucy es "+ lucyCarro.color);
    }
    
}
