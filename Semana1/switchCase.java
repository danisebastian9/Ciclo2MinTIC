import java.util.Scanner;

public class switchCase {
    public static void main(String[] arg){
        byte opcion = 0;
        int num1 = 0, num2 = 0, res = 0;
        
        Scanner ingreso = new Scanner(System.in);

        System.out.println("Digite la Opcion: \n1. Suma\n2. Resta\n3. Multiplicacion\n4. Division\n5. Modulo");
        opcion = Byte.parseByte(ingreso.nextLine());

        switch(opcion){
            case 1: System.out.println("Suma");
            System.out.println("Digite los numeros a Sumar: ");
            num1 = Integer.parseInt(ingreso.nextLine());
            num2 = Integer.parseInt(ingreso.nextLine());
            res = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = " + res);
            break;
            case 2: System.out.println("Resta");
            System.out.println("Digite los numeros a Restar: ");
            num1 = Integer.parseInt(ingreso.nextLine());
            num2 = Integer.parseInt(ingreso.nextLine());
            res = num1 - num2;
            System.out.println(num1 + " - " + num2 + " = " + res);
            break;
            case 3: System.out.println("Multiplicacion");
            System.out.println("Digite los numeros a Multiplicar: ");
            num1 = Integer.parseInt(ingreso.nextLine());
            num2 = Integer.parseInt(ingreso.nextLine());
            res = num1 * num2;
            System.out.println(num1 + " * " + num2 + " = " + res);
            break;
            case 4: System.out.println("Division");
            System.out.println("Digite los numeros a Dividir: ");
            num1 = Integer.parseInt(ingreso.nextLine());
            num2 = Integer.parseInt(ingreso.nextLine());
            res = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = " + res);
            break;
            case 5: System.out.println("Modulo");
            System.out.println("Digite los numeros a sacar modulo: ");
            num1 = Integer.parseInt(ingreso.nextLine());
            num2 = Integer.parseInt(ingreso.nextLine());
            res = num1 % num2;
            System.out.println(num1 + " mod " + num2 + " = " + res);
            break;
            default: System.out.println("No pertenece a ninguna opcion");
        }
    }
}
