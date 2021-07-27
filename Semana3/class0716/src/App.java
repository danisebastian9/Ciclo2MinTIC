public class App {
    public static void main(String[] args) throws Exception {
        
        estudiante Pedro = new estudiante("Pedro", "Perez Rojas", 18, 4512, 4.5f);
        System.out.println("Estudiante: "+ Pedro.Nombre);
        System.out.println("Apellidos: "+ Pedro.getApellidos());
        Pedro.mostrarDatos(); 

    }
}
