

/**
 *
 * @author kenyi
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        int resultado = a / b;
        System.out.println("Resultado: " + resultado);
    }
    
// Explicación:
// En Java, si ambos operandos son enteros (int), la división descarta la parte decimal
// (no redondea, solo trunca).
// 5 / 2 = 2.5, pero como el tipo es int, el resultado final es 2.    
}
