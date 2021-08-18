package Vista;

import java.util.Scanner;

public class Vista {
    
    Scanner ingreso = new Scanner(System.in);

    public byte mostrarMenu(){
        byte op = 0;
        System.out.println("INSTITUTO LA FLORESTA \nSeleccione tarea a realizar: \n1. Ingresar estudiante \n2. Buscar estudiante \n3. Modificar estudiante \n4. Eliminar Estudiante \n5. Ver directorio de estudiantes \n6. Salir \nOpción:\n");
        op = ingreso.nextByte();
        ingreso.nextLine();
        return op;
    }

    public String capturaNombre(){
        System.out.println("Ingresar nombres:\n");
        String nombres = " ";
        nombres = ingreso.nextLine();
        return nombres;
    }

    public String capturaApellidos(){
        System.out.println("Ingresar apellidos:\n");
        String apellidos = " ";
        apellidos = ingreso.nextLine();
        return apellidos;
    }

    public String capturaFechaNac(){
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD):\n");
        String fecha = "";
        fecha = ingreso.next();
        return fecha;
    }

    public String capturaInstEmail(){
        System.out.println("Ingresar correo institucional:\n");
        String iEmail = "";
        iEmail = ingreso.next();
        return iEmail;
    }

    public String capturaPersEmail(){
        System.out.println("Ingresar correo personal:\n");
        String pEmail = "";
        pEmail = ingreso.next();
        return pEmail;
    }

    public long capturaCelNum(){
        System.out.println("Ingresar número de celular:\n");
        long celNum = 0;
        try{
            celNum = ingreso.nextLong();
        }catch(Exception ex){
            System.out.println("Error al ingresar el numero " + ex.getMessage());
        }
        return celNum;
    }

    public long capturaFijoNum(){
        System.out.println("Ingresar número fijo:\n");
        long fijNum = 0;
        try{
            fijNum = ingreso.nextLong();
        }catch(Exception ex){
            System.out.println("Error al ingresar el numero: " + ex.getMessage());
        }
        return fijNum;
    }
    
        public long capturaFijoMod(){
        System.out.println("Ingresar número fijo:");
        long fijNum = 0;
        try{
            fijNum = ingreso.nextLong();
        }catch(Exception ex){
            System.out.println("Error al ingresar el numero: " + ex.getMessage());
        }
        return fijNum;
    }

    public String capturaPrograma(){
        System.out.println("Ingresar programa:\n");
        String programa = "";
        programa = ingreso.next();
        return programa;
    }
    
    public String capturaProgramaMod(){
        System.out.println("Ingresar programa:");
        String programa = "";
        programa = ingreso.next();
        return programa;
    }

    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}