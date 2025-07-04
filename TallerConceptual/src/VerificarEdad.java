class EdadInvalidaException extends Exception {
    public EdadInvalidaException(String mensaje) {
        super(mensaje);
    }
}

public class VerificarEdad {
    public static void main(String[] args) {
        try {
            verificarEdad(15);
        } catch (EdadInvalidaException e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        }
    }

    public static void verificarEdad(int edad) throws EdadInvalidaException {
        if (edad < 18) {
            throw new EdadInvalidaException("Debe ser mayor de edad para continuar.");
        }
        System.out.println("Edad válida: " + edad);
    }
}

