import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Instrumento ins1 = new Instrumento();

        Scanner x = new Scanner(System.in);
        ins1.setNombre("Flauta");
        ins1.setOrigen("India");
        ins1.setReferencia("Rf001");
        ins1.setprecio(68000);
        System.out.println("Instrumento: " +ins1.getNombre());
        System.out.println("Origen Ins1: " +ins1.getOrigen());
        System.out.println("Referencia Ins1: " +ins1.getReferencia());
        System.out.println("Precio Ins1: " +ins1.getPrecio());


        Instrumento ins2 = new Instrumento();
        System.out.println("Ingrese nombre del Instrumento: ");
        String nombre = x.nextLine();
        ins2.setNombre(nombre);
        System.out.println("Ingrese origen del Instrumento: ");
        ins2.setOrigen(x.nextLine());
        System.out.println("Ingrese referencia del Instrumento: ");
        ins2.setReferencia(x.nextLine());
        System.out.println("Ingrese precio del Instrumento: ");
        ins2.setprecio(x.nextDouble());
        System.out.println("Instrumento No2: " +ins2.getNombre());
        System.out.println("Origen Ins2: " +ins2.getOrigen());
        System.out.println("Referencia Ins2: " +ins2.getReferencia());
        System.out.println("Precio Ins2: " +ins2.getPrecio());

    }
}
