import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ingreso = new Scanner(System.in);

        System.out.println("Ingrese el tamaño del arreglo");
        int tam = ingreso.nextInt();

        int[] numero = new int[tam]; // Definir arreglo con tipo de dato y tamaño

        // numero[0] = 3;
        // numero[1] = 10;
        // numero[4] = 20;
        // System.out.println("Dato del arreglo: " + numero[4]);


        for(int d = 0; d < numero.length; d++){  // Llenar un arreglo desde teclado
            System.out.println("Ingrese un numero");
            numero[d]= ingreso.nextInt();
        }

        for(int i = 0; i<numero.length; i++){ // recorrer un arrelo
            System.out.print(" - " + numero[i]);
        }

    }
}
