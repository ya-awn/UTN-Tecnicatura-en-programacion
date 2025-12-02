package tp8_interfaces_y_excepciones;

public class MainTP8 {

    public static void main(String[] args) {
        System.out.println("=== Parte 1: Interfaces en E-commerce ===");
        Cliente cliente = new Cliente("Kenyi Meza", "kenyi@example.com");
        Pedido pedido = new Pedido(cliente);
        pedido.agregarProducto(new Producto("Mouse", 5000));
        pedido.agregarProducto(new Producto("Teclado", 12000));

        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        TarjetaCredito tarjeta = new TarjetaCredito("1111-2222-3333-4444");
        tarjeta.procesarPago(pedido.calcularTotal());

        PayPal paypal = new PayPal("cliente@paypal.com");
        paypal.procesarPago(pedido.calcularTotal());

        pedido.cambiarEstado("Pagado");
        pedido.cambiarEstado("Enviado");

        System.out.println();
        System.out.println("=== Parte 2: Excepciones ===");
        System.out.println("1) División segura:");
        // DivisionSegura.ejecutar(); // Descomentar para probar por consola

        System.out.println("2) Conversión de cadena a número:");
        // ConversionCadenaNumero.ejecutar(); // Descomentar para probar por consola

        System.out.println("3) Lectura de archivo:");
        // LecturaArchivo.ejecutar("archivo.txt"); // Ajustar ruta según el entorno

        System.out.println("4) Excepción personalizada (EdadInvalidaException):");
        // ValidadorEdad.ejecutar(); // Descomentar para probar por consola

        System.out.println("5) try-with-resources:");
        // LecturaArchivoTryWithResources.ejecutar("archivo.txt"); // Ajustar ruta
    }
}
