package Vista;

import java.util.Scanner;

public class Vista {

    Scanner ingreso = new Scanner(System.in);
    
    public byte mostrarMenu(){
        byte opcion;
        System.out.println("1. Crear Lavadora \n2. Crear televisor \n3. Salir");
        System.out.println("Ingrese Opcion: ");
        opcion = ingreso.nextByte();
        return opcion;
    }

    public byte mostrarMenu2(){
        byte opcion;
        System.out.println("1. Llenar Arreglo \n2. Sumar Precio Final \n3. Salir");
        System.out.println("Ingrese Opcion: ");
        opcion = ingreso.nextByte();
        return opcion;
    }

    public int capturaTam(){
        System.out.println("Ingrese cantidad de electrodomesticos a crear: ");
        int tam = ingreso.nextInt();
        return tam;
    }

    public double capturaPrecioBase(){
        System.out.println("Ingrese Precio Base: ");
        double precio = ingreso.nextDouble();
        return precio;
    }
    
    public String capturaColor(){
        System.out.println("Ingrese Color: ");
        String dato = ingreso.next();
        return dato;
    }

    public char capturaConsumo(){
        System.out.println("Ingrese Consumo Energetico: ");
        char dato = ingreso.next() .charAt(0);
        return dato;
    }

    public float capturaPeso(){
        System.out.println("Ingrese Peso: ");
        float dato = ingreso.nextFloat();
        return dato;
    }

    public int capturaCarga(){
        System.out.println("Ingrese Carga de Lavadora: ");
        int dato = ingreso.nextInt();
        return dato;
    }

    public int capturaResolucion(){
        System.out.println("Ingrese Resolucion del TV: ");
        int dato = ingreso.nextInt();
        return dato;
    }

    public boolean capturaTdt(){
        System.out.println("Ingrese Sintonizador TDT del TV: ");
        boolean dato = ingreso.nextBoolean();
        return dato;
    }


}
