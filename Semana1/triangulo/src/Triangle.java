import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) throws Exception {
        int ladoA, ladoB, ladoC;

        Scanner ingreso = new Scanner(System.in);
        ladoA = Integer.parseInt(ingreso.nextLine());
        ladoB = Integer.parseInt(ingreso.nextLine());
        ladoC = Integer.parseInt(ingreso.nextLine());

        if(ladoA == ladoB && ladoB == ladoC){
            System.out.println("El triangulo es equilatero");
        }else if(ladoA == ladoB || ladoB == ladoC || ladoA == ladoC){
            System.out.println("El triangulo es isoceles");
        }else{
            System.out.println("El triangulo es escaleno");
        }
    }
}
