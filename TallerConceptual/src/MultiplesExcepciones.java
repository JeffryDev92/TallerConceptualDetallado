public class MultiplesExcepciones {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            int resultado = 10 / 0;
            System.out.println(numeros[5]);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera del rango del arreglo.");
        } catch (Exception e) {
            System.out.println("Ocurrió una excepción general: " + e.getMessage());
        }
        System.out.println("El programa continúa después del manejo de excepciones.");
    }
}

