// Ejercicio 2 – Celular, Batería, Usuario
class Bateria {
    String modelo; int capacidad;
    Bateria(String modelo, int capacidad) { this.modelo = modelo; this.capacidad = capacidad; }
}

class Usuario2 {
    String nombre; String dni;
    Celular celular; // asociación
    Usuario2(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
}

class Celular {
    String imei, marca, modelo;
    Bateria bateria;   // agregación
    Usuario2 usuario;  // asociación
    Celular(String imei, String marca, String modelo, Bateria bateria) {
        this.imei = imei; this.marca = marca; this.modelo = modelo; this.bateria = bateria;
    }
    void asignarUsuario(Usuario2 u) { this.usuario = u; u.celular = this; }
}

public class Ej02_Celular {
    public static void main(String[] args) {
        Bateria b = new Bateria("BT-5000", 5000);
        Celular c = new Celular("351234567890123", "Moto", "G", b);
        Usuario2 u = new Usuario2("Luis","22333444");
        c.asignarUsuario(u);
        System.out.println("Celular " + c.marca + " con batería " + c.bateria.modelo + " -> Usuario " + u.nombre);
    }
}
