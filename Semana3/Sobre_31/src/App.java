public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Perro");
        Perro firulais = new Perro();
        firulais.comer();

        System.out.println("Persona");
        Persona Pedro = new Persona();
        Pedro.comer();

        System.out.println("Vaca");
        Vaca Lola = new Vaca();
        Lola.comer();

        System.out.println("Animal");
        Animal cualquiera = new Animal();
        cualquiera.comer();


    }
}
