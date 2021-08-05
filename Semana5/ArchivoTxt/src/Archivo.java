import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Archivo {
    
    public void leer(){// Lectura desde archivo TXT
        
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


    public void escribir(){ // Escritura o creacion en archivo TXT

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


    public void leer_buffer(){ // Leer con memoria temporal, linea a linea y no X/caracter

        try{
            FileReader archivo = new FileReader("src\\escribir31.txt");

            BufferedReader memo = new BufferedReader(archivo);
            String linea = "";
            while(linea != null){
                linea = memo.readLine();
                if(linea != null){
                    System.out.println(linea);
                }
            }
            archivo.close();
        }catch(IOException ex){
            System.out.println("No se encontro el archivo, no se pudo leer...");
            ex.printStackTrace();
        }
    }
}
