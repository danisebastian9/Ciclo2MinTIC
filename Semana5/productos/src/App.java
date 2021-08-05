import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<Productos> Lista = new ArrayList<Productos>();

        Lista.add(new Productos(2021,"Jabon de Baño",6000));
        Lista.add(new Productos(2022,"Jabon de Ropa",16000));
        Lista.add(new Productos(2023,"Servilletas",3000));
        Lista.add(new Productos(2024,"Arroz",2000));
        Lista.add(new Productos(2025,"Frijol",5000));
        Lista.add(new Productos(2026,"Arepa",2000));
        Lista.add(new Productos(2027,"Escoba",8000));

        try {
            ObjectOutputStream escribirProducto = new ObjectOutputStream( new FileOutputStream("src\\listaProductos.txt"));
            escribirProducto.writeObject(Lista);
            escribirProducto.close();

        } catch (IOException e) {
            //TODO: handle exception
        }
    }
}
