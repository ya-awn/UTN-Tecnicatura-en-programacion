import java.util.Scanner;

public class TP2Ejercicio3 {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            System.out.print("Ingrese su edad: ");
            int edad = scan.nextInt();
            if (edad < 12) {
            System.out.println("Niño");
            } else if (edad <= 17) {
                System.out.println("Adolescente");
            } else if (edad <= 59) {
                System.out.println("Adulto");
            } else {
                System.out.println("Adulto mayor");
            }
        }
    }
}