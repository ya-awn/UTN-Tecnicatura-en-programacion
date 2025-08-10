
import java.util.Scanner;

//----- EJERCICIO -----
//import java.util.Scanner;
//public class ErrorEjemplo {
//public static void main(String[] args) {
//Scanner scanner = new Scanner(System.in);
//System.out.print("Ingresa tu nombre: ");
//String nombre = scanner.nextInt(); // ERROR
//System.out.println("Hola, " + nombre);
//}
//}

/**
 *
 * @author kenyi
 */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre: ");
        // usamos netxtLine() en lugar de nextInt() porque estamos leyendo texto
        String nombre = scanner.nextLine();
        
        System.out.println("hola, " + nombre);
        
        scanner.close();
        
// PROBLEMA: 
// nextInt() está diseñado para leer números enteros (int), no texto.
// El código intentaba guardar un número en una variable String, 
// lo cual no es válido y genera un error de compilación.
//
// SOLUCION:
// Cambiar nextInt() por nextLine() para leer una cadena de texto.
// nextLine() permite capturar espacios y cualquier carácter que el usuario escriba.
    }
}
