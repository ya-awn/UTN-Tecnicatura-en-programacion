package tp8_interfaces_y_excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSegura {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Ingrese el dividendo: ");
            double a = scanner.nextDouble();
            System.out.print("Ingrese el divisor: ");
            double b = scanner.nextDouble();

            double resultado = a / b; // ArithmeticException para divisor 0 en enteros, en double da Infinity
            if (Double.isInfinite(resultado)) {
                throw new ArithmeticException("División por cero.");
            }

            System.out.println("Resultado: " + resultado);
        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar números válidos.");
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
    }
}
