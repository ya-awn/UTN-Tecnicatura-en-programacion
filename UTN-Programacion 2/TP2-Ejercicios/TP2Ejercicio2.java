import java.util.Scanner;

public class TP2Ejercicio2 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){

        System.out.print("Ingrese el primer número: ");
        int a = scan.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = scan.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = scan.nextInt();

        int mayor = a;
        if (b > mayor) mayor = b;
        if (c > mayor) mayor = c;

        System.out.println("El mayor es: " + mayor);
    }
  }
}

