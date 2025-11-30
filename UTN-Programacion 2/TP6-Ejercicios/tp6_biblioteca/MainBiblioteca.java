package tp6_biblioteca;

public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca b = new Biblioteca("Biblioteca Central");

        // 2. Crear al menos tres autores
        Autor a1 = new Autor("A001", "Jorge Luis Borges", "Argentina");
        Autor a2 = new Autor("A002", "Isabel Allende", "Chile");
        Autor a3 = new Autor("A003", "Gabriel Garcia Marquez", "Colombia");

        // 3. Agregar 5 libros
        b.agregarLibro("ISBN001", "El Aleph", 1949, a1);
        b.agregarLibro("ISBN002", "Cien Años de Soledad", 1967, a3);
        b.agregarLibro("ISBN003", "La Casa de los Espíritus", 1982, a2);
        b.agregarLibro("ISBN004", "Ficciones", 1944, a1);
        b.agregarLibro("ISBN005", "Crónica de una muerte anunciada", 1981, a3);

        System.out.println("=== Listado de libros ===");
        b.listarLibros();

        System.out.println("
=== Buscar libro por ISBN (ISBN002) ===");
        Libro buscado = b.buscarLibroPorIsbn("ISBN002");
        if (buscado != null) buscado.mostrarInfo();

        System.out.println("
=== Filtrar por año 1949 ===");
        b.filtrarLibrosPorAnio(1949).forEach(Libro::mostrarInfo);

        System.out.println("
=== Eliminar libro ISBN005 ===");
        b.eliminarLibro("ISBN005");
        b.listarLibros();

        System.out.println("
=== Cantidad total de libros ===");
        System.out.println(b.obtenerCantidadLibros());

        System.out.println("
=== Autores disponibles ===");
        b.mostrarAutoresDisponibles();
    }
}
