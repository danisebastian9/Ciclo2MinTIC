import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        uso_if();

    }
    // Aqui van todos los procedicimientos o funciones
    public static void uso_if(){
        System.out.println("Digite el numero");
        Scanner leer = new Scanner(System.in);
        int numero;
        numero = leer.nextInt();
        if (numero == 0) 
            System.out.println("El numero es CERO");
         else if(numero % 2 == 0)
            System.out.println("El numero es PAR");
         else
            System.out.println("El numero es IMPAR");
        // Cuando es mas de una instruccion es necesaria las llaves
        

    }

}
