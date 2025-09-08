public class TP2Ejercicio13 {
    public static void imprimirRecursivo(double[] arr, int i) {
        if (i >= arr.length) return;
        System.out.println("Precio: $" + arr[i]);
        imprimirRecursivo(arr, i + 1);
    }

    public static void main(String[] args) {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};

        System.out.println("Precios originales:");
        imprimirRecursivo(precios, 0);

        // Modificar el tercer precio
        precios[2] = 129.99;

        System.out.println("\nPrecios modificados:");
        imprimirRecursivo(precios, 0);
    }
}