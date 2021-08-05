public class App {
    public static void main(String[] args) throws Exception {
        Archivo prueba = new Archivo();
        // prueba.leer();
        // prueba.escribir();
        // prueba.leer_buffer();
        Imagen img = new Imagen();
        img.copiarImagen(img.leerImagen());
        // img.leerImagen();

    }
}
