public class Persona extends Animal {
    

    @Override // Sobreescribir - modificar desde la clase hija
    public void comer(){

        System.out.println("Comiendo en plato con cubiertos...");
    }
}
