import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        
        ArrayList<String> datos = new ArrayList<String>(); // Definimos la lista
        datos.add("Juan");
        datos.add("Maria");
        datos.add("Pedro");
        datos.add("Luisa");
        datos.add("Julian");

        System.out.println(datos.size()); // Mostrar el numero de elementos.

        for(String s:datos){  // Recorrer la lista
            System.out.println(s);
        }
        
        int contador = 0;
        for(String s:datos){  // Buscar posicion en lista
            if(s.equals("Luisa")){
                System.out.println("Luisa en posicion: " + contador);
            };
            contador ++;
        }

        datos.set(2, "Francisco"); // Reemplazar datos en lista
        for(String s:datos){  
            System.out.println(s);
        }

        System.out.println(datos.get(4)); // Buscar datos en lista


        datos.remove(0); // eliminar de lista
        for(String s:datos){  
            System.out.println(s);
        }
    }
}
