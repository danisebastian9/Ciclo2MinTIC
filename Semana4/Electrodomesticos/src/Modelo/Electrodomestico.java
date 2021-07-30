package Modelo;

public class Electrodomestico {
    
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;


    public Electrodomestico(){
        precioBase = 100;
        color = "Blanco";
        consumoEnergetico = 'F'; // Char comilla sencilla, char una sola letra o digito
        peso = 5;
    }


    public Electrodomestico(double precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = "Blanco";
        consumoEnergetico = 'F'; // Char comilla sencilla, char una sola letra o digito
    }


    public Electrodomestico(double precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
    }

    
    

}
