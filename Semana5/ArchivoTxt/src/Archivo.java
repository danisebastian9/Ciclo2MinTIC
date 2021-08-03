import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    public void leer(){
        
        try {
            FileReader arch = new FileReader("C:\\Users\\sebas\\Documents\\Development\\MinTic\\Ciclo2MinTIC\\Semana5\\ArchivoTxt\\src\\archivo31.txt");
            int datos = 0;
            while(datos != -1){
                datos = arch.read(); // trae el numero del caracter
                char c = (char)datos; // Convertir en caracter
                System.out.print(c);
            }

            arch.close(); // Cerrar archivo

        } catch (IOException e) {
            System.out.println("No se encontro el archivo, no se pudo leer...");
            e.printStackTrace();
        }
    }


    public void escribir(){

        String texto = "\nHaciendo prueba 4 de escritura";
        try {
            //FileWriter escritura = new FileWriter("src\\escribir31.txt"); overwrites and creates
            FileWriter escritura = new FileWriter("src\\escribir31.txt", true); //true = continue writing leaving existing data.      
            for(int i = 0; i < texto.length(); i++){
                escritura.write(texto.charAt(i));
            }

            escritura.close();
            

        } catch (IOException e) {
            System.out.println("No se encontro el archivo, no se pudo leer...");
            e.printStackTrace();
        }

    }
}
