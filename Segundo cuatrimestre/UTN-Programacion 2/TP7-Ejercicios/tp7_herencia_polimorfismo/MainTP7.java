package tp7_herencia_polimorfismo;

import java.util.ArrayList;
import java.util.List;

public class MainTP7 {

    public static void main(String[] args) {

        System.out.println("=== 1) Vehículos y herencia básica ===");
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        System.out.println();
        System.out.println("=== 2) Figuras geométricas y métodos abstractos ===");
        Figura[] figuras = new Figura[3];
        figuras[0] = new Circulo(2.5);
        figuras[1] = new Rectangulo(3.0, 4.0);
        figuras[2] = new Circulo(1.0);

        for (Figura figura : figuras) {
            System.out.println("Figura: " + figura.getNombre()
                    + " - Área: " + figura.calcularArea());
        }

        System.out.println();
        System.out.println("=== 3) Empleados y polimorfismo ===");
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta("Ana", 250000, 30000));
        empleados.add(new EmpleadoTemporal("Luis", 1500, 80));
        empleados.add(new EmpleadoPlanta("Carlos", 280000, 50000));
        empleados.add(new EmpleadoTemporal("Marta", 1800, 60));

        for (Empleado e : empleados) {
            System.out.print("Empleado: " + e.getNombre());
            System.out.print(" | Tipo: ");
            if (e instanceof EmpleadoPlanta) {
                System.out.print("Planta");
            } else if (e instanceof EmpleadoTemporal) {
                System.out.print("Temporal");
            } else {
                System.out.print("Desconocido");
            }
            System.out.println(" | Sueldo: " + e.calcularSueldo());
        }

        System.out.println();
        System.out.println("=== 4) Animales y comportamiento sobrescrito ===");
        List<Animal> animales = new ArrayList<>();
        animales.add(new Perro("Firulais"));
        animales.add(new Gato("Mishi"));
        animales.add(new Vaca("Lola"));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();  // polimorfismo
            System.out.println();
        }
    }
}
