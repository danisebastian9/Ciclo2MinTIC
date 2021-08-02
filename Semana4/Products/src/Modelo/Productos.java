package Modelo;

public class Productos {
    
    private String referencia;
    private String nombre;
    private long precio;

    
    
    public Productos() {
    }

    public Productos(String referencia, String nombre, long precio) {
        this.referencia = referencia;
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getPrecio() {
        return precio;
    }

    public void setPrecio(long precio) {
        this.precio = precio;
    }

    
    public String mostrarProducto(){
        String mensaje = "";
        mensaje = "Referencia: " + getReferencia() + "\nNombre: " + getNombre() + "\nPrecio: " + getPrecio();
        return mensaje;
    }




    
}
