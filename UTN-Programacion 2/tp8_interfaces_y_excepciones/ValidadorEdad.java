package tp8_interfaces_y_excepciones;

import java.util.Scanner;

public class ValidadorEdad {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();
        try {
            validarEdad(edad);
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void validarEdad(int edad) throws EdadInvalidaException {
        if (edad < 0 || edad > 120) {
            throw new EdadInvalidaException("La edad debe estar entre 0 y 120.");
        }
    }
}
