import java.util.Scanner;

public class TP2Ejercicio5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int suma = 0;
        int num;

        while (true) {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = scan.nextInt();
            if (num == 0) break;
            if (num % 2 == 0) suma += num;
        }

        System.out.println("La suma de los números pares es: " + suma);
    }
}