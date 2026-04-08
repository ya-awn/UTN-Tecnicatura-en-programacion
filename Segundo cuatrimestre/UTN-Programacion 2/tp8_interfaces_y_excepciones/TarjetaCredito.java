package tp8_interfaces_y_excepciones;

public class TarjetaCredito implements PagoConDescuento {

    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public double aplicarDescuento(double monto) {
        // 10% de descuento por promoción
        return monto * 0.90;
    }

    @Override
    public void procesarPago(double monto) {
        double montoConDescuento = aplicarDescuento(monto);
        System.out.println("Pago con Tarjeta de Crédito " + numeroTarjeta +
                " por $" + montoConDescuento + " (descuento aplicado)");
    }
}
