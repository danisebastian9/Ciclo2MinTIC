package Vista;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Vista {
    
    Scanner ingreso = new Scanner(System.in);

    public byte mostrarMenu(){
        byte op = 0;
        String opcion[] = {"Añadir","Consultar","Modificar","Eliminar","Todos","Salir"};
        int op1 = JOptionPane.showOptionDialog(null, "Seleccione tarea a realizar: ", "INSTITUTO LA FLORESTA", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcion, opcion[0]);
        op1 +=1;
        op = (byte)op1;
        return op;
    }

    public String capturaNombre(){
        String nombres = " ";
        nombres = JOptionPane.showInputDialog(null, "Ingresar nombres: ");
        return nombres;
    }

    public String capturaApellidos(){
        String apellidos = " ";
        apellidos = JOptionPane.showInputDialog(null, "Ingresar apellidos: ");
        return apellidos;
    }

    public String capturaFechaNac(){
        String fecha = "";
        fecha = JOptionPane.showInputDialog(null, "Ingresar fecha de nacimiento (YYYY-MM-DD): ");
        return fecha;
    }

    public String capturaInstEmail(){
        String iEmail = "";
        iEmail = JOptionPane.showInputDialog(null, "Ingresar correo institucional: ");
        return iEmail;
    }

    public String capturaPersEmail(){
        String pEmail = "";
        pEmail = JOptionPane.showInputDialog(null, "Ingresar correo personal: ");
        return pEmail;
    }

    public long capturaCelNum(){
        long celNum = 0;
        try{
            celNum = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresar número de celular: "));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al ingresar el numero " + ex.getMessage());
        }
        return celNum;
    }

    public long capturaFijoNum(){
        System.out.println("Ingresar número fijo:\n");
        long fijNum = 0;
        try{
            fijNum = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresar número fijo: "));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar el numero: " + ex.getMessage());
        }
        return fijNum;
    }
    
        public long capturaFijoMod(){
        long fijNum = 0;
        try{
            fijNum = Long.parseLong(JOptionPane.showInputDialog(null, "Ingresar número fijo: "));
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null,"Error al ingresar el numero: " + ex.getMessage());
        }
        return fijNum;
    }

    public String capturaPrograma(){
        String programa = "";
        programa = JOptionPane.showInputDialog(null, "Ingresar programa: ");
        return programa;
    }
    
    public String capturaProgramaMod(){
        String programa = "";
        programa = JOptionPane.showInputDialog(null, "Ingresar programa: ");
        return programa;
    }

    public void imprimir(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public void imprimirTodos(String mensaje){
        System.out.println(mensaje);;
    }
}