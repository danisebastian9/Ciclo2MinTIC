public class Instrumento {
    
    private String nombre;
    private String origen;
    private String referencia;
    private double precio; // encapsulamiento, un atributo solo se puede acceder desde su propia clase.

    public Instrumento(){}

    public Instrumento(String name){
        nombre = name;
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



}
