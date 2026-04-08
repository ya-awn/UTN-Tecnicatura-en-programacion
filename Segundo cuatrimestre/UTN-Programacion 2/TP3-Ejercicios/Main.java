public class Main {
    public static void main(String[] args) {

        // 1) Registro de Estudiantes
        System.out.println("=== 1) Estudiante ===");
        Estudiante e = new Estudiante("Ana", "Pérez", "Programación II", 7);
        e.mostrarInfo();
        e.subirCalificacion(3); // queda 10 (cap)
        e.mostrarInfo();
        e.bajarCalificacion(5); // baja a 5
        e.mostrarInfo();

        // 2) Registro de Mascotas
        System.out.println("\n=== 2) Mascota ===");
        Mascota m = new Mascota("Firulais", "Perro", 3);
        m.mostrarInfo();
        m.cumplirAnios();
        m.mostrarInfo();

        // 3) Encapsulamiento con la Clase Libro
        System.out.println("\n=== 3) Libro (encapsulamiento) ===");
        Libro libro = new Libro("El Quijote", "Cervantes", 1605);
        libro.mostrarInfo();
        libro.setAnioPublicacion(3000); // inválido, se rechaza
        libro.setAnioPublicacion(2005); // válido
        libro.mostrarInfo();

        // 4) Gestión de Gallinas en Granja Digital
        System.out.println("\n=== 4) Gallinas ===");
        Gallina g1 = new Gallina("G-101", 1);
        Gallina g2 = new Gallina("G-202", 2);
        g1.envejecer();
        g1.ponerHuevo();
        g1.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        // 5) Simulación de Nave Espacial
        System.out.println("\n=== 5) Nave Espacial ===");
        NaveEspacial nave = new NaveEspacial("Águila", 50);
        nave.mostrarEstado();
        // intentar avanzar sin despegar
        nave.avanzar(5); // no debe avanzar
        // despegar con 50 -> 40 restantes
        nave.despegar();
        // intentar avanzar 45 (no alcanza con 40)
        nave.avanzar(45);
        // recargar y avanzar correctamente
        nave.recargarCombustible(30); // 40 + 30 = 70
        nave.avanzar(45);             // 70 - 45 = 25
        nave.mostrarEstado();
    }
}
