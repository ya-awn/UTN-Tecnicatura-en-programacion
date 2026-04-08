import java.util.Scanner;

public class TP2Ejercicio11 {
    // 'Global' en Java: variable de clase (static)
    static double descuentoEspecial = 0.10; // 10%

    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * descuentoEspecial; // variable local
        double precioFinal = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + precioFinal);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = scan.nextDouble();
        calcularDescuentoEspecial(precio);
    }
}