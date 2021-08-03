import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Archivo {
    
    public void leer(){
        
        try {
            FileReader arch = new FileReader("C:\\Users\\sebas\\Documents\\Development\\MinTic\\Ciclo2MinTIC\\Semana5\\ArchivoTxt\\src\\archivo31.txt");
            int datos = arch.read();
            while(datos != -1){
                datos = arch.read();
                System.out.println(datos);
            }
        } catch (IOException e) {
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        }



    }
}
