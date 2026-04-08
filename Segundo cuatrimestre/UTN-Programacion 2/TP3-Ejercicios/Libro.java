import java.time.Year;

public class Libro {
    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Libro(String titulo, String autor, int anioPublicacion) {
        this.titulo = titulo;
        this.autor = autor;
        setAnioPublicacion(anioPublicacion); // aplica validación
    }

    // Getters
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public int getAnioPublicacion() { return anioPublicacion; }

    // Setter con validación
    public void setAnioPublicacion(int anio) {
        int current = Year.now().getValue();
        if (anio < 1450 || anio > current) {
            System.out.println("Año inválido (" + anio + "). Debe estar entre 1450 y " + current + ".");
            return;
        }
        this.anioPublicacion = anio;
    }

    public void mostrarInfo() {
        System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
    }
}
