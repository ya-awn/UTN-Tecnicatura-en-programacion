import java.util.Scanner;

public class TP2Ejercicio9 {
    public static double calcularCostoEnvio(double peso, String zona) {
        zona = zona.trim().toLowerCase();
        double costoPorKg = zona.equals("nacional") ? 5.0 : 10.0;
        return costoPorKg * peso;
    }

    public static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = scan.nextDouble();
        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = new java.util.Scanner(System.in).nextLine(); 

        double costoEnvio = calcularCostoEnvio(peso, zona);
        double total = calcularTotalCompra(precio, costoEnvio);

        System.out.println("El costo de envío es: " + costoEnvio);
        System.out.println("El total a pagar es: " + total);
    }
}