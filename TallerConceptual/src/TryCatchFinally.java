public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango.");
        } finally {
            System.out.println("Este bloque siempre se ejecuta.");
        }
    }
}
