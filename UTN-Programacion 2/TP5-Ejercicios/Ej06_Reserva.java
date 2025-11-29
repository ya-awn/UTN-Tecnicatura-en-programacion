// Ejercicio 6 – Reserva, Cliente, Mesa
class Cliente3 {
    String nombre, telefono;
    Cliente3(String n, String t) { this.nombre=n; this.telefono=t; }
}
class Mesa {
    int numero, capacidad;
    Mesa(int n, int c) { this.numero=n; this.capacidad=c; }
}
class Reserva {
    String fecha, hora;
    Cliente3 cliente; // asociación unidireccional
    Mesa mesa;        // agregación
    Reserva(String f, String h, Cliente3 c, Mesa m) { this.fecha=f; this.hora=h; this.cliente=c; this.mesa=m; }
}
public class Ej06_Reserva {
    public static void main(String[] args) {
        Reserva r = new Reserva("2025-10-01","21:00", new Cliente3("Paz","11-5555"), new Mesa(8,4));
        System.out.println("Reserva " + r.fecha + " " + r.hora + " mesa " + r.mesa.numero + " a nombre de " + r.cliente.nombre);
    }
}
