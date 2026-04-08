// Ejercicio 5 – Computadora, PlacaMadre, Propietario
class PlacaMadre {
    String modelo, chipset;
    PlacaMadre(String m, String c) { this.modelo=m; this.chipset=c; }
}
class Propietario {
    String nombre, dni;
    Computadora pc; // bidireccional
    Propietario(String n, String d) { this.nombre=n; this.dni=d; }
}
class Computadora {
    String marca, numeroSerie;
    PlacaMadre placa;  // composición
    Propietario dueno; // asociación
    Computadora(String marca, String ns, PlacaMadre placa, Propietario p) {
        this.marca=marca; this.numeroSerie=ns; this.placa=placa; this.dueno=p;
        p.pc = this;
    }
}
public class Ej05_Computadora {
    public static void main(String[] args) {
        Propietario p = new Propietario("Nico","40111222");
        Computadora pc = new Computadora("Lenovo","SN-001", new PlacaMadre("B550","AMD"), p);
        System.out.println("PC " + pc.marca + " SN " + pc.numeroSerie + " de " + p.nombre + " con placa " + pc.placa.modelo);
    }
}
