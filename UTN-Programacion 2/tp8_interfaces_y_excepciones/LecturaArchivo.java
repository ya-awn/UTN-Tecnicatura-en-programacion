package tp8_interfaces_y_excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LecturaArchivo {

    public static void ejecutar(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try (Scanner scanner = new Scanner(archivo)) {
            System.out.println("Contenido del archivo: ");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado -> " + rutaArchivo);
        }
    }
}
