import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        JOptionPane.showMessageDialog(null, "Mensaje Pregunta", "Este es el titulo", 3);
        JOptionPane.showMessageDialog(null, "Mensaje Informacion", "Este es el titulo", 1);
        JOptionPane.showMessageDialog(null, "Mensaje Advertencia", "Este es el titulo", 2);
        JOptionPane.showMessageDialog(null, "Mensaje Error", "Este es el titulo", 0);

    }
}
