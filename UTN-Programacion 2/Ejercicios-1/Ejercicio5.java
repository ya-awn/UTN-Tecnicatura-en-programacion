import java.util.Scanner;

/**
 *
 * @author kenyi
 */
public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        // solicita los numeros
        System.out.println("Ingresa el primer numero entero: ");
        int num1 = input.nextInt();
        
        System.out.println("ingresa el segundo numero entero: ");
        int num2 = input.nextInt();
        
        // operaciones 
        int suma = num1 + num2;
        int resta = num1 - num2;
        int multiplicacion = num1 * num2;
        
        // division con formato inteligente
        String divisionStr;
        if (num2 != 0) {
            if (num1 % num2 == 0){
                // division exacta - entero
                divisionStr = String.valueOf(num1 / num2);
            } else {
                // division con decimales - double
                divisionStr = String.valueOf((double) num1 / num2);
            }
        } else {
            divisionStr = "No se puede dividir entre cero";
        }
        
        // mostrar resultados
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicacion: " + multiplicacion);
        System.out.println("Division: " + divisionStr);
        
        input.close();
    }
    
}
