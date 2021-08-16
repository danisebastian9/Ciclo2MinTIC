package Vista;

import java.util.Scanner;

public class Vista {

    Scanner ingreso = new Scanner(System.in); 
    
    public byte mostrarMenu(){
        byte op = 0;

        System.out.println("Menu inventario de Productos \n1. Crear Producto \n2. Buscar Producto \n3. Modificar Producto \n4. Eliminar Producto \n5. Listar Productos \n6. Salir \nOpcion: " );
        op = ingreso.nextByte();
        return op;
    }

    public String capturaRef(){
        System.out.println("Ingrese referencia del producto");
        String ref = "";
        ref = ingreso.next();
        ingreso.nextLine();
        return ref;
        
    }

    public String capturaNombre(){
        System.out.println("Ingrese Nombre del producto");
        String nom = "";
        nom = ingreso.nextLine();
        return nom;

    }

    public long capturaPrecio(){
        System.out.println("Ingrese Precio del producto");
        long pre = 0;
        try{
            pre = ingreso.nextLong();
            ingreso.nextLine();
        }catch(Exception ex){
            System.out.println("Error al ingresar el precio: " + ex.getMessage());
        }
        return pre;
    }

    public String capturaCategoria(){
        System.out.println("Ingrese Categoria del producto");
        String nom = "";
        nom = ingreso.nextLine();
        return nom;

    }

    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
