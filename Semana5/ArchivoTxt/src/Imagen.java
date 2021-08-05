import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Imagen {
    
    public int[] leerImagen(){ // Stream byte

        int[] datos = new int[54083];

        int contador = 0;

        try{
            FileInputStream leerImg = new FileInputStream("src\\PcImage.jpg");
            int byteEntrada = 0;
            while(byteEntrada != -1){
                byteEntrada = leerImg.read();
                if(byteEntrada != -1){
                    datos[contador] = byteEntrada; // Guardar cada byte en el arreglo
                    System.out.println(datos[contador]); // Imprime lo que esta en el arreglo.
                }
                contador++;
            }
            leerImg.close();
        }catch(IOException ex){
            System.out.println("No se encontro el archivo..." + ex);
        }
        // System.out.print(contador); // Cantidad de Bytes de la imagen / archivo. 
        return datos;
    }

    public void copiarImagen(int datos[]){ // Escribir byte en un archivo

        try {
            
            FileOutputStream copia = new FileOutputStream("src\\CopiaPcImage.jpg");
            for(int i = 0; i< datos.length; i++){
                copia.write(datos[i]);
            }
            copia.close();
        } catch (Exception e) {
            System.out.println("No se encontro el archivo..." + e);
        }
    }
}
