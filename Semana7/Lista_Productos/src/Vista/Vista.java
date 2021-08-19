package Vista;


import javax.swing.JOptionPane;

public class Vista {
    
    public byte mostrarMenu(){
        byte op = 0;
        String opcion[] = {"Añadir","Consultar","Modificar","Eliminar","Todos","Salir"};
        int op1 = JOptionPane.showOptionDialog(null, "Seleccione: ", "Menu inventario de Productos", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcion, opcion[0]);
        op1 +=1;
        op = (byte)op1;
        return op;
    }

    public String capturaRef(){
        String ref = "";
        ref = JOptionPane.showInputDialog(null, "Ingrese referencia del producto");
        return ref;
        
    }

    public String capturaNombre(){
        String nom = "";
        nom = JOptionPane.showInputDialog(null, "Ingrese Nombre del producto");
        return nom;

    }

    public long capturaPrecio(){
        long pre = 0;
        try{
            pre = Long.parseLong(JOptionPane.showInputDialog(null, "Ingrese Precio del producto"));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar el precio: " + ex.getMessage());
        }
        return pre;
    }

    public String capturaCategoria(){
        String nom = "";
        nom = JOptionPane.showInputDialog(null, "Ingrese Categoria del producto");
        return nom;

    }

    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void imprimirTodos(String mensaje){
        System.out.println(mensaje);;
    }
}
