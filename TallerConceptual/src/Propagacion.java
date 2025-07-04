public class Propagacion {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (ArithmeticException e) {
            System.out.println("Excepción manejada en main: " + e.getMessage());
        }
    }

    public static void metodo1() {
        metodo2();
    }

    public static void metodo2() {
        int resultado = 10 / 0;
    }
}
