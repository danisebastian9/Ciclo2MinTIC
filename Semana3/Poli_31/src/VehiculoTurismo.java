public class VehiculoTurismo extends Vehiculo {
    
    private int numeroPuertas;

    public VehiculoTurismo(String matricula, String marca, String modelo, int numeroPuertas) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public String mostrarDatos(){
        return "Matricula: "+ matricula + "\nMarca: " + marca + "\nModelo: " + modelo + "\nNo. puertas: " + numeroPuertas; 
    }

    
}
