import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
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
            ObjectOutputStream escribirProducto = new ObjectOutputStream( new FileOutputStream("src\\listaProductos.dat"));
            escribirProducto.writeObject(Lista);
            escribirProducto.close();

            
            // Leer informacion de archivo .dat
            ObjectInputStream recuperar = new ObjectInputStream(new FileInputStream("src\\listaProductos.dat"));
            ArrayList<Productos> Leer = new ArrayList<Productos>();
            Leer = (ArrayList<Productos>)recuperar.readObject();
            recuperar.close();
            for(Productos p:Leer){
                System.out.println(p.mostrarProducto());
            }

        } catch (Exception e) {
            //TODO: handle exception
        }

        System.out.println("--------------------------------------");
        for(Productos p:Lista){
            System.out.println(p.mostrarProducto());
        }
    }
}
