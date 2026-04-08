package tp6_universidad;

public class MainUniversidad {
    public static void main(String[] args) {
        Universidad uni = new Universidad("Universidad Ejemplo");

        // 1. Crear al menos 3 profesores y 5 cursos
        Profesor p1 = new Profesor("PR001", "Ana Gómez", "Matemáticas");
        Profesor p2 = new Profesor("PR002", "Luis Pérez", "Programación");
        Profesor p3 = new Profesor("PR003", "María Díaz", "Física");

        Curso c1 = new Curso("C001", "Álgebra");
        Curso c2 = new Curso("C002", "Programación I");
        Curso c3 = new Curso("C003", "Física I");
        Curso c4 = new Curso("C004", "Estructuras de Datos");
        Curso c5 = new Curso("C005", "Bases de Datos");

        // 2. Agregar profesores y cursos a la universidad
        uni.agregarProfesor(p1); uni.agregarProfesor(p2); uni.agregarProfesor(p3);
        uni.agregarCurso(c1); uni.agregarCurso(c2); uni.agregarCurso(c3); uni.agregarCurso(c4); uni.agregarCurso(c5);

        // 3. Asignar profesores a cursos
        uni.asignarProfesorACurso("C001", "PR001");
        uni.asignarProfesorACurso("C002", "PR002");
        uni.asignarProfesorACurso("C004", "PR002");
        uni.asignarProfesorACurso("C003", "PR003");

        System.out.println("=== Cursos con su profesor ===");
        uni.listarCursos();

        System.out.println("
=== Profesores con sus cursos ===");
        uni.listarProfesores();

        System.out.println("
=== Cambiar profesor de C004 a PR003 ===");
        uni.asignarProfesorACurso("C004", "PR003");
        System.out.println("Cursos después del cambio:");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("
=== Remover curso C002 ===");
        uni.eliminarCurso("C002");
        uni.listarCursos();
        uni.listarProfesores();

        System.out.println("
=== Remover profesor PR001 ===");
        uni.eliminarProfesor("PR001");
        uni.listarProfesores();
        uni.listarCursos();

        System.out.println("
=== Reporte: cantidad de cursos por profesor ===");
        uni.reporteCantidadCursosPorProfesor();
    }
}
