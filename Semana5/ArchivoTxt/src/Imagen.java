import java.io.FileInputStream;
import java.io.IOException;

public class Imagen {
    
    public void leerImagen(){ // Stream byte
        try{
            FileInputStream leerImg = new FileInputStream("src\\PcImage.jpg");
            int byteEntrada = 0;
            while(byteEntrada != -1){
                byteEntrada = leerImg.read();
                System.out.println(byteEntrada);
            }
            leerImg.close();
        }catch(IOException ex){

        }
    }
}
