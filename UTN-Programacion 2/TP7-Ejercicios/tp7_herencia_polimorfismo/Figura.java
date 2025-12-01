package tp7_herencia_polimorfismo;

public abstract class Figura {

    private String nombre;

    protected Figura(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract double calcularArea();
}
