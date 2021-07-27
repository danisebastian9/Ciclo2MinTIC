public class persona {
    
    private String Nombre;
    private String Apellidos;
    private int edad;
    
    
    public persona(String nombre, String apellidos, int edad) { // Constructor
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
    }


    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }


    public int getEdad() {
        return edad;
    }

    


    
    
}
