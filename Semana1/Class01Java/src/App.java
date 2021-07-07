import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        uso_if();
        float_promedio();


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
        leer.close();
        // Cuando es mas de una instruccion es necesaria las llaves
        


    }

    public static void float_promedio(){
        String nombre = new String();
        float nota1, nota2, nota3;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el nombre del estudiante: ");
        nombre = leer.next();
        System.out.println("Digite la nota # 1: ");
        nota1 = leer.nextFloat();
        System.out.println("Digite la nota # 2: ");
        nota2 = leer.nextFloat();
        System.out.println("Digite la nota # 3: ");
        nota3 = leer.nextFloat();

        promedio = (nota1 + nota2 + nota3) / 3;
        System.out.println("El estudiante "+nombre+" tiene el promedio"+promedio+"");
    }

}
