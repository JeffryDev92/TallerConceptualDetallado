import java.io.*;

public class ExcepcionVerificada {
    public static void main(String[] args) {
        try {
            FileReader archivo = new FileReader("ejemplo.txt");
            BufferedReader lector = new BufferedReader(archivo);
            System.out.println("Primera línea: " + lector.readLine());
            lector.close();
        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
