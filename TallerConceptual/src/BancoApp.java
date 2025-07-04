class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String mensaje) {
        super(mensaje);
    }
}

class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double monto) throws OperacionInvalidaException {
        if (monto <= 0) {
            throw new OperacionInvalidaException("No se puede depositar un monto negativo o cero.");
        }
        saldo += monto;
        System.out.println("Depósito exitoso de $" + monto + " a " + titular);
    }

    public void retirar(double monto) throws OperacionInvalidaException {
        if (monto > saldo) {
            throw new OperacionInvalidaException("Saldo insuficiente para el retiro.");
        }
        saldo -= monto;
        System.out.println("Retiro exitoso de $" + monto + " de " + titular);
    }

    public void transferir(CuentaBancaria destino, double monto) throws OperacionInvalidaException {
        if (this == destino) {
            throw new OperacionInvalidaException("No se puede transferir a la misma cuenta.");
        }
        this.retirar(monto);
        destino.depositar(monto);
        System.out.println("Transferencia de $" + monto + " de " + titular + " a " + destino.getTitular() + " completada.");
    }

    public void mostrarSaldo() {
        System.out.println("Saldo de " + titular + ": $" + saldo);
    }
}

public class BancoApp {
    public static void main(String[] args) {
        CuentaBancaria cuenta1 = new CuentaBancaria("Ana", 500);
        CuentaBancaria cuenta2 = new CuentaBancaria("Luis", 300);

        System.out.println("--- Estado inicial ---");
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();

        try {
            cuenta1.retirar(100);
            cuenta1.depositar(50);
            cuenta1.transferir(cuenta2, 200);
            cuenta2.depositar(-20);  // Lanzará excepción
        } catch (OperacionInvalidaException e) {
            System.out.println("⚠️ Error: " + e.getMessage());
        }

        System.out.println("--- Estado final ---");
        cuenta1.mostrarSaldo();
        cuenta2.mostrarSaldo();
    }
}
