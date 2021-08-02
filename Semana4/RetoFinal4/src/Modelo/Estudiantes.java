package Modelo;

public class Estudiantes {
    
    private String nombres;
    private String apellidos;
    private String fechaNacimiento;
    private String instEmail;
    private String persEmail;
    private long celNum;
    private long fijoNum;
    private String progAcademico;
    
    
    public Estudiantes() {
    }


    public Estudiantes(String nombres, String apellidos, String fechaNacimiento, String instEmail, String persEmail,
            long celNum, long fijoNum, String progAcademico) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.fechaNacimiento = fechaNacimiento;
        this.instEmail = instEmail;
        this.persEmail = persEmail;
        this.celNum = celNum;
        this.fijoNum = fijoNum;
        this.progAcademico = progAcademico;
    }


    public String getNombres() {
        return nombres;
    }


    public void setNombres(String nombres) {
        this.nombres = nombres;
    }


    public String getApellidos() {
        return apellidos;
    }


    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }


    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }


    public String getInstEmail() {
        return instEmail;
    }


    public void setInstEmail(String instEmail) {
        this.instEmail = instEmail;
    }


    public String getPersEmail() {
        return persEmail;
    }


    public void setPersEmail(String persEmail) {
        this.persEmail = persEmail;
    }


    public long getCelNum() {
        return celNum;
    }


    public void setCelNum(long celNum) {
        this.celNum = celNum;
    }


    public long getFijoNum() {
        return fijoNum;
    }


    public void setFijoNum(long fijoNum) {
        this.fijoNum = fijoNum;
    }


    public String getProgAcademico() {
        return progAcademico;
    }


    public void setProgAcademico(String progAcademico) {
        this.progAcademico = progAcademico;
    }

    public String mostrarProducto(){
        String mensaje = "";
        mensaje = "Nombres: " + getNombres() + "\nApellidos: " + getApellidos() + "\nFecha de Nacimiento: " + getFechaNacimiento() + "\nCorreo Institucional: " + getInstEmail() + "\nCorreo Personal: " + getPersEmail() + "\nNumero Telefonico Celular: " + getCelNum() + "\nNumero Telefonico Fijo: " + getFijoNum() + "\nPrograma académico al cual pertenece: " + getProgAcademico();
        return mensaje;
    }


}
