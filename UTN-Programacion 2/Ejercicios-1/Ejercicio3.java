import java.util.Scanner;

/**
 *
 * @author kenyi
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // crea el objeto scanner para leer datos desde consola
        Scanner input = new Scanner(System.in);
        
        // solicita nombre
        System.out.println("Ingresa tu nombre: ");
        String nombre = input.nextLine();
        
        // solicita edad
        System.out.println("Ingresa tu edad: ");
        int edad = input.nextInt();
        
        // mostrar los datos en pantalla
        System.out.println("Tu nombre es: " + nombre);
        System.out.println("Tu edad es: " + edad + " años");
        
        // cerrar el scanner
        input.close();
    }
    
}
