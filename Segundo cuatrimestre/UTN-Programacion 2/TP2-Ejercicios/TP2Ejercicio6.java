import java.util.Scanner;

public class TP2Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int positivos = 0, negativos = 0, ceros = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " Ingrese un número " + ": ");
            int n = scan.nextInt();
            if (n > 0) positivos++;
            else if (n < 0) negativos++;
            else ceros++;
        }

        System.out.println("Positivos: " + positivos);
        System.out.println("Negativos: " + negativos);
        System.out.println("Ceros: " + ceros);
    }
}