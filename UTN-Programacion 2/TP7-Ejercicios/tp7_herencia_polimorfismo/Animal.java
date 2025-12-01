package tp7_herencia_polimorfismo;

public class Animal {

    private String nombre;

    public Animal(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void hacerSonido() {
        System.out.println("El animal hace un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.println("Este es un animal llamado " + nombre + ".");
    }
}
