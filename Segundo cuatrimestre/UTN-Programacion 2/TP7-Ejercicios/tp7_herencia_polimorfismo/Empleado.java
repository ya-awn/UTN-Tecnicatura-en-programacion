package tp7_herencia_polimorfismo;

public abstract class Empleado {

    private String nombre;

    protected Empleado(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularSueldo();
}
