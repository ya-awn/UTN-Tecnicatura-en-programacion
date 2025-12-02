package tp8_interfaces_y_excepciones;

public class PayPal implements Pago {

    private String emailCuenta;

    public PayPal(String emailCuenta) {
        this.emailCuenta = emailCuenta;
    }

    @Override
    public void procesarPago(double monto) {
        System.out.println("Pago con PayPal desde la cuenta " + emailCuenta +
                " por $" + monto);
    }
}
