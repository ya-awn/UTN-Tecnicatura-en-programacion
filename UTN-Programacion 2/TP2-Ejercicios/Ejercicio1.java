import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {   // <-- se cierra solo
            System.out.print("Ingrese un año: ");
            int anio = scan.nextInt();

            boolean esBisiesto =
                    (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);

            if (esBisiesto) {
                System.out.println("El año " + anio + " es bisiesto.");
            } else {
                System.out.println("El año " + anio + " no es bisiesto.");
            }
        } // aquí se cierra scan
    }
}
