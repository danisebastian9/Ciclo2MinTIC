package Vista;

import java.util.Scanner;

public class Vista {
    
    Scanner ingreso = new Scanner(System.in);

    public byte mostrarMenu(){
        byte op = 0;
        System.out.println("\nINSTITUTO LA FLORESTA \nSeleccione tarea a realizar: \n1. Ingresar estudiante \n2. Buscar estudiante \n3. Modificar estudiante \n4. Eliminar Estudiante \n5. Ver directorio de estudiantes \n6. Salir \nOpción:");
        op = ingreso.nextByte();
        return op;
    }

    public String capturaNombre(){
        System.out.println("Ingresar nombres:");
        String nom = "";
        nom = ingreso.next();
        return nom;
    }

    public String capturaApellidos(){
        System.out.println("Ingresar apellidos:");
        String apellidos = "";
        apellidos = ingreso.next();
        return apellidos;
    }

    public String capturaFechaNac(){
        System.out.println("Ingresar fecha de nacimiento (YYYY-MM-DD)");
        String fecha = "";
        fecha = ingreso.next();
        return fecha;
    }

    public String capturaInstEmail(){
        System.out.println("Ingresar correo institucional:");
        String iEmail = "";
        iEmail = ingreso.next();
        return iEmail;
    }

    public String capturaPersEmail(){
        System.out.println("Ingresar correo personal:");
        String pEmail = "";
        pEmail = ingreso.next();
        return pEmail;
    }

    public long capturaCelNum(){
        System.out.println("Ingresar número de celular:");
        long celNum = 0;
        try{
            celNum = ingreso.nextLong();
        }catch(Exception ex){
            System.out.println("Error al ingresar el numero " + ex.getMessage());
        }
        return celNum;
    }

    public long capturaFijoNum(){
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
        System.out.println("Ingresar programa:");
        String programa = "";
        programa = ingreso.next();
        return programa;
    }

    public void imprimir(String mensaje){
        System.out.println(mensaje);
    }
}
