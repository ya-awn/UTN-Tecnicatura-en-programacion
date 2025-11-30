package tp6_universidad;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private String nombre;
    private List<Profesor> profesores = new ArrayList<>();
    private List<Curso> cursos = new ArrayList<>();

    public Universidad(String nombre) {
        this.nombre = nombre;
    }

    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            profesores.add(p);
        }
    }

    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            cursos.add(c);
        }
    }

    public Profesor buscarProfesorPorId(String id) {
        return profesores.stream().filter(p -> p.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        return cursos.stream().filter(c -> c.getCodigo().equalsIgnoreCase(codigo)).findFirst().orElse(null);
    }

    public boolean asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso c = buscarCursoPorCodigo(codigoCurso);
        Profesor p = buscarProfesorPorId(idProfesor);
        if (c == null || p == null) return false;
        c.setProfesor(p);
        return true;
    }

    public void listarProfesores() {
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        cursos.forEach(Curso::mostrarInfo);
    }

    public boolean eliminarCurso(String codigo) {
        Curso c = buscarCursoPorCodigo(codigo);
        if (c != null) {
            if (c.getProfesor() != null) {
                c.getProfesor().getCursos().remove(c);
                c.setProfesor(null);
            }
            return cursos.remove(c);
        }
        return false;
    }

    public boolean eliminarProfesor(String id) {
        Profesor p = buscarProfesorPorId(id);
        if (p != null) {
            // dejar profesor = null en sus cursos
            for (Curso c : new ArrayList<>(p.getCursos())) {
                c.setProfesor(null);
            }
            return profesores.remove(p);
        }
        return false;
    }

    public void reporteCantidadCursosPorProfesor() {
        for (Profesor p : profesores) {
            System.out.println(p.getNombre() + " -> " + p.getCursos().size() + " curso(s)");
        }
    }
}
