package tp6_universidad;

public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; // puede ser null

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }

    public void setProfesor(Profesor p) {
        // si ya tenía profesor, quitar este curso de su lista
        if (this.profesor != null && this.profesor != p) {
            this.profesor.getCursos().remove(this);
        }
        this.profesor = p;
        if (p != null && !p.getCursos().contains(this)) {
            p.getCursos().add(this);
        }
    }

    public void mostrarInfo() {
        String profName = (profesor != null) ? profesor.getNombre() : "SIN ASIGNAR";
        System.out.println(String.format("Curso[codigo=%s, nombre=%s, profesor=%s]", codigo, nombre, profName));
    }
}
