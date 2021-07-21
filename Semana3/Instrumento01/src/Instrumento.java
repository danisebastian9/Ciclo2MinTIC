public class Instrumento {
    
    private String nombre;
    private String origen;
    private String referencia;
    private double precio; // encapsulamiento, un atributo solo se puede acceder desde su propia clase.

    public Instrumento(){} // Sobrecarga de constructores es tener mas de un constructor en la clase. 

    public Instrumento(String name){
        nombre = name;
    }

    public Instrumento(String name, String origin){
        this.nombre = name;
        this.origen = origin;
    }

    public void setprecio(double valor){ // Setter  
        precio = valor;
    }

    public double getPrecio(){  // Getter
        return precio;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
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

    @Override
    public String toString() {
        return "Instrumento [nombre=" + nombre + ", origen=" + origen + ", precio=" + precio + ", referencia="
                + referencia + "]";
    }


    

}
