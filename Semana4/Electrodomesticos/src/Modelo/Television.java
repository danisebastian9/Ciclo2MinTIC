package Modelo;

public class Television extends Electrodomestico{
    
    private int resolucion;
    private boolean tdt;

    public Television(){
        resolucion = 20;
        tdt = false;
    }

    public Television(double precioBase, float peso) {
        super(precioBase, peso);
        resolucion = 20;
        tdt = false;
    }

    public Television(double precioBase, String color, char consumoEnergetico, float peso, int resolucion,
            boolean tdt) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.tdt = tdt;
    }

    public int getResolucion() {
        return resolucion;
    }


    public boolean isTdt() {
        return tdt;
    }

    public void precioFinal(){
        super.precioFinal();
        if(resolucion > 40){
            precioBase += precioBase * 0.3;
        }

        if(tdt){
            precioBase += 50;
        }
    }

}
