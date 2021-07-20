public class Instrumento {
    
    public String nombre;
    public String origen;
    public String referencia;
    private double precio; // encapsulamiento, un atributo solo se puede acceder desde su propia clase.


    public void setprecio(double valor){ // Setter  
        precio = valor;
    }

    public double getPrecio(){  // Getter
        return precio;
    }

    public void afinar(){
        System.out.println("Afinando instrumento: "+nombre);
    }

    public void sonar(){
        System.out.println("Sonando instrumento: "+nombre);
    }

    public void calibrar(){
        System.out.println("Calibrando instrumento: "+nombre);
    }



}
