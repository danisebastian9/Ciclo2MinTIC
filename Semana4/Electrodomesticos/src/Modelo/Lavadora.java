package Modelo;

public class Lavadora extends Electrodomestico{
    

    private int carga;

    public Lavadora(){
        carga = 5;
    }

    public Lavadora(double precioBase, float peso) {
        super(precioBase, peso);
        carga = 5;
    }

    public Lavadora(double precioBase, String color, char consumoEnergetico, float peso, int carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void precioFinal(){
        super.precioFinal(); // Llamando al metodo de la clase padre
        if(carga > 30){
            precioBase += 50;
        }
    }
    

}
