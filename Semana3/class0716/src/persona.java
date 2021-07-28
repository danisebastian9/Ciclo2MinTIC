public class persona {
    
    protected String Nombre; // Protegido y solo hijos o misma clase pueden acceder. 
    private String Apellidos;
    private int edad;
    
    
    public persona(String nombre, String apellidos, int edad) { // Constructor
        Nombre = nombre;
        Apellidos = apellidos;
        this.edad = edad;
    }

    public void esMayor(){
        if(edad >= 0 && edad <= 17){
            System.out.println("Es Menor de Edad");
        } else {
            System.out.println("Es Mayor de Edad");
        }
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
