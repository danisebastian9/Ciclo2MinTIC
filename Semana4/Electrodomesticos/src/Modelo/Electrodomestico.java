package Modelo;

public class Electrodomestico {
    
    protected double precioBase;
    protected String color;
    protected char consumoEnergetico;
    protected float peso;


    public Electrodomestico(){
        precioBase = 100;
        color = "blanco";
        consumoEnergetico = 'F'; // Char comilla sencilla, char una sola letra o digito
        peso = 5;
        comprobarConsumoEnergetico(consumoEnergetico);
    }


    public Electrodomestico(double precioBase, float peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        color = "blanco";
        consumoEnergetico = 'F'; // Char comilla sencilla, char una sola letra o digito
        comprobarConsumoEnergetico(consumoEnergetico);
    }


    public Electrodomestico(double precioBase, String color, char consumoEnergetico, float peso) {
        this.precioBase = precioBase;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        comprobarConsumoEnergetico(consumoEnergetico);
    }


    public double getPrecioBase() {
        return precioBase;
    }


    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }


    public String getColor() {
        return color;
    }


    public void setColor(String color) {
        this.color = color;
    }


    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }


    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }


    public float getPeso() {
        return peso;
    }


    public void setPeso(float peso) {
        this.peso = peso;
    }

    private void comprobarConsumoEnergetico(char letra){
        switch(letra){
            case 'A':
            break;
            case 'B':
            break;
            case 'C':
            break;
            case 'D':
            break;
            case 'E':
            break;
            case 'F':
            break;
            default:
            consumoEnergetico = 'F';
            break;
        }
    }


    private void comprobarColor(String color){
        switch(color.toLowerCase()){
            case "blanco":
            break;
            case "negro":
            break;
            case "rojo":
            break;
            case "azul":
            break;
            case "gris":
            break;
            default:
            this.color = "blanco";
            break;
        }
    }
    
    public void precioFinal(){
        switch(consumoEnergetico){
            case 'A':
            precioBase += 100;
            break;
            case 'B':
            precioBase += 80;
            break;
            case 'C':
            precioBase += 60;
            break;
            case 'D':
            precioBase += 50;
            break;
            case 'E':
            precioBase += 30;
            break;
            case 'F':
            precioBase += 10;
            break;
            default:
            break;
        }

        if (peso >= 0 && peso <= 19){
           precioBase += 10; 
        } else if (peso >= 20 && peso <= 49){
            precioBase += 50;
        } else if (peso >= 50 && peso <= 79){
            precioBase += 80;
        } else if (peso >= 80){
            precioBase += 100;
        }
    }

}
