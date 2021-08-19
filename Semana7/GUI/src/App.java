import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Mensaje Pregunta", "Este es el titulo", 3);
        JOptionPane.showMessageDialog(null, "Mensaje Informacion", "Este es el titulo", 1);
        JOptionPane.showMessageDialog(null, "Mensaje Advertencia", "Este es el titulo", 2);
        JOptionPane.showMessageDialog(null, "Mensaje Error", "Este es el titulo", 0);

        String nombre = JOptionPane.showInputDialog(null, "Digite su nombre: ");
        JOptionPane.showMessageDialog(null, "Bienvenido " + nombre);

        int numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite su numero: "));
        JOptionPane.showMessageDialog(null, "Bienvenido " + numero);

        int op = JOptionPane.showConfirmDialog(null, "Desea iniciar sesion?");
        JOptionPane.showMessageDialog(null, op);

        String opcion[] = {"Sumar","Restar","Dividir","Multiplicar"};
        int ope = JOptionPane.showOptionDialog(null, "Seleccione Operacion: ", "Ventana operaciones", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE, null,opcion, opcion[0]);
        JOptionPane.showMessageDialog(null, ope);
    }
}
