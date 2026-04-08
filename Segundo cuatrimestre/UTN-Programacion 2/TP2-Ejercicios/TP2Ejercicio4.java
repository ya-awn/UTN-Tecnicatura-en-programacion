import java.util.Scanner;

public class TP2Ejercicio4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String cat = scan.next().trim().toUpperCase();

        double porcentaje;
        switch (cat) {
            case "A": porcentaje = 0.10; break;
            case "B": porcentaje = 0.15; break;
            case "C": porcentaje = 0.20; break;
            default:
                System.out.println("Categoría inválida.");
                return;
        }
        double descuento = precio * porcentaje;
        double precioFinal = precio - descuento;

        System.out.println("Precio original: " + precio);
        System.out.println("Descuento aplicado: " + (int)(porcentaje * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }
}