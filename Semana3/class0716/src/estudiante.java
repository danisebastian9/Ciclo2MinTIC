public class estudiante extends persona { // Hereda de persona
    
    private int codigoEst;
    private float notaFinal; 

    // Constructor se tiene que crear

    public estudiante(String nombre, String apellidos, int edad, int codigoEst, float notaFinal){
        super(nombre, apellidos, edad);
        this.codigoEst = codigoEst;
        this.notaFinal = notaFinal;

    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+ getNombre() + "\nApellidos: " + getApellidos() + "\nEdad: " + getEdad() + "\nCodigo: " + codigoEst + "\nNota Final: " + notaFinal);
    }

    public String aprobo(){
        if(notaFinal >= 3.5){
            return ""+ getNombre() + "Aprobo";
        } else {
            return "" + getNombre() + "Reprobo";
        }
    }

}
