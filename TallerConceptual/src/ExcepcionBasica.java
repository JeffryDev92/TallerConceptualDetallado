public class ExcepcionBasica {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("¡Error! División por cero: " + e.getMessage());
        }
        System.out.println("Programa continúa...");
    }
}
 