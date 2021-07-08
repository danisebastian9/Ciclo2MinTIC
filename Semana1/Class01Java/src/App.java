import java.util.Scanner;
import java.lang.Math;

public class App {
    public static void main(String[] args) throws Exception {
        // uso_if();
        // float_promedio();
        // uso_char();
        
        int opcion;
        float area = 0;
        do {
            opcion = seleccionar_menu();
            switch(opcion) {
                case 1: area = calcular_circulo();
                System.out.println("Area del Circulo: " + area);
                break;
                case 2: area = calcular_triangulo();
                System.out.println("Area del Triangulo: " + area);
                break;
                case 3: area = calcular_rectangulo();
                System.out.println("Area del Rectangulo: " + area);
                break;
                case 4: System.exit(0);
                break;
            } 
        } while(opcion != 4);
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
        float nota1, nota2, nota3, promedio;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el nombre del estudiante: ");
        nombre = leer.next();
        System.out.println("Digite la nota # 1: ");
        nota1 = leer.nextFloat();
        System.out.println("Digite la nota # 2: ");
        nota2 = leer.nextFloat();
        System.out.println("Digite la nota # 3: ");
        nota3 = leer.nextFloat();
        
        promedio = (nota1 + nota2 + nota3)/ 3;
        System.out.println("El estudiante " + nombre + " tiene el promedio: " + promedio);
        leer.close();
    }

    public static void uso_char(){
        char letra;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la letra: ");
        letra = leer.next().charAt(0);
        letra = Character.toUpperCase(letra);
        switch(letra){
            case 'a': case 'A':System.out.println("Avion");
            break;
            case 'e': System.out.println("Elefante");
            break;
            case 'i': System.out.println("Iglesia");
            break;
            case 'o': System.out.println("Oso");
            break;
            case 'u': System.out.println("Uvas");
            break;
            default: System.out.println("No es Vocal");   
        }
        leer.close();
        // tmp = Integer.toString(33);  / Lo convierte de entero a String "33"
        // num = Integer.parseInt("33"); / Convierte un string a INT
    }

    public static int seleccionar_menu(){
        int opc;
        Scanner leer = new Scanner(System.in);
        System.out.println("MENU PRINCIPAL ");
        System.out.println("1. Calcular area Circulo ");
        System.out.println("2. Calcular area Triangulo");
        System.out.println("3. Calcular area Rectangulo");
        System.out.println("4. Salir");
        System.out.println("Seleccione su opcion -> ");
        opc = leer.nextInt();
        leer.close();
        return opc;

    }
    public static float calcular_circulo(){
        float radio, area;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite el radio: ");
        radio = leer.nextFloat();
        area = radio * radio * (float)Math.PI;
        leer.close();
        return area;
    }
    public static float calcular_triangulo(){
        float base, altura, area;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la base: ");
        base = leer.nextFloat();
        System.out.println("Digite la altura: ");
        altura = leer.nextFloat();
        area = (base * altura) / 2; 
        leer.close();
        return area;
    }
    public static float calcular_rectangulo(){
        float base, altura, area;
        Scanner leer = new Scanner(System.in);
        System.out.println("Digite la base: ");
        base = leer.nextFloat();
        System.out.println("Digite la altura: ");
        altura = leer.nextFloat();
        area = (base * altura); 
        leer.close();
        return area;
    }


}
