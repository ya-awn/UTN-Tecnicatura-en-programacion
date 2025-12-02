package tp8_interfaces_y_excepciones;

import java.util.Scanner;

public class ConversionCadenaNumero {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un número entero: ");
        String texto = scanner.nextLine();
        try {
            int numero = Integer.parseInt(texto);
            System.out.println("Número ingresado: " + numero);
        } catch (NumberFormatException e) {
            System.out.println("Error: El texto ingresado no es un número entero válido.");
        }
    }
}
