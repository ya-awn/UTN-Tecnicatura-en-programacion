// Ejercicio 3 – Libro, Autor, Editorial
class Autor {
    String nombre, nacionalidad;
    Autor(String n, String p) { this.nombre = n; this.nacionalidad = p; }
}
class Editorial {
    String nombre, direccion;
    Editorial(String n, String d) { this.nombre = n; this.direccion = d; }
}
class Libro {
    String titulo, isbn;
    Autor autor;           // asociación unidireccional
    Editorial editorial;   // agregación
    Libro(String t, String i, Autor a, Editorial e) { this.titulo=t; this.isbn=i; this.autor=a; this.editorial=e; }
}
public class Ej03_Libro {
    public static void main(String[] args) {
        Autor a = new Autor("Borges","Argentina");
        Editorial e = new Editorial("Sudamericana","Av. X 123");
        Libro l = new Libro("Ficciones","ISBN-001", a, e);
        System.out.println(l.titulo + " de " + l.autor.nombre + " (editorial " + l.editorial.nombre + ")");
    }
}
