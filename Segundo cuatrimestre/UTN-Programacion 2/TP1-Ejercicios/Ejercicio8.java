
import java.util.Scanner;

/**
 *
 * @author kenyi
 */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        //------ Primera parte: usando int ------
        System.err.println("=== Division con int ===");
        System.out.print("Ingrese el primer numero: ");
        int num1 = input.nextInt();
        System.out.print("Ingrese el segundo numero: ");
        int num2 = input.nextInt();
        
        int resultadoEntero = num1 / num2; // Division sin decimales
        System.out.println("resultado (int): " + resultadoEntero);
        
        //------ Segunda parte: usando double ------
        System.out.println("\n=== Division con double ===");
        System.out.print("Ingrese el primer numero: ");
        double num3 = input.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        double num4 = input.nextDouble();
        
        double resultadoDouble = num3 / num4; // Division decimal
        System.out.println("Resultado (double): " + resultadoDouble);
        
        // Comparacion
        System.out.println("\nNota: usar int descarta la parte decimal.");
        System.out.println("      usar double mantiene los decimales en el resultado.");
        
        input.close();
    }
    
}
