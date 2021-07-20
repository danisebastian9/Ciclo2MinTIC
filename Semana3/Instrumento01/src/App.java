public class App {
    public static void main(String[] args) throws Exception {

        Instrumento ins1 = new Instrumento();
        ins1.nombre = "flauta";
        ins1.origen = "India";
        ins1.referencia = "Rf001";
        ins1.setprecio(68000);
        System.out.println("Instrumento: " +ins1.nombre);
        System.out.println("Instrumento: " +ins1.origen);
        System.out.println("Instrumento: " +ins1.getPrecio());


    }
}
