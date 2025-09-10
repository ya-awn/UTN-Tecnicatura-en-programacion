public class Estudiante {
    String nombre;
    String apellido;
    String curso;
    private int calificacion; // 0..10

    public Estudiante(String nombre, String apellido, String curso, int calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        setCalificacion(calificacion); // aplica validación
    }

    public void mostrarInfo() {
        System.out.println("Estudiante: " + nombre + " " + apellido +
                " | Curso: " + curso + " | Calificación: " + calificacion);
    }

    public void subirCalificacion(int puntos) {
        setCalificacion(this.calificacion + puntos);
    }

    public void bajarCalificacion(int puntos) {
        setCalificacion(this.calificacion - puntos);
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int nueva) {
        if (nueva < 0) nueva = 0;
        if (nueva > 10) nueva = 10;
        this.calificacion = nueva;
    }
}
