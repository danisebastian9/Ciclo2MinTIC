import java.io.FileInputStream;
import java.io.IOException;

public class Imagen {
    
    public void leerImagen(){ // Stream byte

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
    }
}
