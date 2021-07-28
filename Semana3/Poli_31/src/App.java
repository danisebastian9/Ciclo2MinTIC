public class App {
    public static void main(String[] args) throws Exception {
        
        Vehiculo mio = new Vehiculo("ABC123", "Nissan", "Xtrail");
        System.out.println(mio.mostrarDatos());

        Vehiculo turism = new VehiculoTurismo("XYZ987", "Chevrolet", "Spark", 5); // Toma forma de un hijo - polimorfismo
        System.out.println(turism.mostrarDatos());

        Vehiculo dep = new VehiculoDeportivo("CDE456", "Porsche", "Boxter", 3500);
        System.out.println(dep.mostrarDatos());

        Vehiculo carga = new VehiculoFurgoneta("GFA546", "Chevrolet", "NKR", 5000);
        System.out.println(carga.mostrarDatos());
    }
}
