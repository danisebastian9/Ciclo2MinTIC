import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) throws Exception {
        porcentageExercise();
        
        int num1 = 0, num2 = 0;
        Scanner ingreso = ingresoDatos();
        num1 = Integer.parseInt(ingreso.nextLine());
        num2 = Integer.parseInt(ingreso.nextLine());

        if(num1 > num2){
            System.out.println(num1 + "Es mayor que" + num2);
        } else if(num2 > num1){
            System.out.println(num2 + "Es mayor que" + num1);
        } else{
            System.out.println(num2 + "Es igual que" + num1);
        }


    }

    public static void porcentageExercise(){
        Scanner ingreso = ingresoDatos();
        int hombres = 0, mujeres = 0, total = 0;
        float porcentHombres, porcentMujeres;

        System.out.println("Digite Cantidad de hombres: ");
        hombres =  Integer.parseInt(ingreso.nextLine());
        System.out.println("Digite Cantidad de mujeres: ");
        mujeres =  Integer.parseInt(ingreso.nextLine());

        total =  hombres + mujeres;
        porcentHombres = (float)(hombres * 100) / total;
        porcentMujeres = (float)(mujeres * 100) / total;

        System.out.println("El total de estudiantes es: "+ total);
        System.out.println("El porcentaje de hombres es: "+porcentHombres+"%");
        System.out.println("El porcentaje de mujeres es: "+porcentMujeres+"%");
    }

    private static Scanner ingresoDatos() {
        Scanner ingreso = new Scanner(System.in);
        return ingreso;
    }
}
