import java.io.*;

public class EjemploChecked {
    public static void main(String[] args) {
        try {
            leerArchivo();
        } catch (IOException e) {
            System.out.println("Error manejado en main: " + e.getMessage());
        }
    }

    public static void leerArchivo() throws IOException {
        FileReader lector = new FileReader("archivo.txt");
    }
}
