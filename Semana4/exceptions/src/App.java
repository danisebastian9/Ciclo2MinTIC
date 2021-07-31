public class App {
    public static void main(String[] args) throws Exception {
        int num1 = 10;
        int num2 = 0;
        int division;

        try{
            division = num1 / num2;
        }catch(ArithmeticException ex){
            division = 1;
            System.out.println("Error...." + ex.getMessage());
        }
        System.out.println("Respuesta: " + division);

    }
}
