// Ejercicio 1 – Pasaporte, Foto, Titular
class Foto {
    String imagen;
    String formato;
    Foto(String imagen, String formato) { this.imagen = imagen; this.formato = formato; }
}

class Titular {
    String nombre;
    String dni;
    Pasaporte pasaporte; // asociación bidireccional
    Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
}

class Pasaporte {
    String numero;
    String fechaEmision;
    Foto foto;       // composición
    Titular titular; // asociación
    Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero; this.fechaEmision = fechaEmision; this.foto = foto; this.titular = titular;
        titular.pasaporte = this; // bidireccional
    }
}

public class Ej01_Pasaporte {
    public static void main(String[] args) {
        Titular t = new Titular("Ana", "12345678");
        Pasaporte p = new Pasaporte("AR-0001", "2025-01-01", new Foto("ana.jpg","jpg"), t);
        System.out.println("Titular: " + t.nombre + " -> Pasaporte: " + p.numero + " con foto " + p.foto.imagen);
    }
}
