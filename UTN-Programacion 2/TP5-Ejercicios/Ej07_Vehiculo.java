// Ejercicio 7 – Vehículo, Motor, Conductor
class Motor {
    String tipo, numeroSerie;
    Motor(String t, String n) { this.tipo=t; this.numeroSerie=n; }
}
class Conductor {
    String nombre, licencia;
    Vehiculo vehiculo; // bidireccional
    Conductor(String n, String l) { this.nombre=n; this.licencia=l; }
}
class Vehiculo {
    String patente, modelo;
    Motor motor;        // agregación
    Conductor conductor; // asociación
    Vehiculo(String p, String m, Motor motor) { this.patente=p; this.modelo=m; this.motor=motor; }
    void asignarConductor(Conductor c) { this.conductor=c; c.vehiculo=this; }
}
public class Ej07_Vehiculo {
    public static void main(String[] args) {
        Vehiculo v = new Vehiculo("AA123BB","Focus", new Motor("Nafta","M-009"));
        Conductor c = new Conductor("Rita","B1");
        v.asignarConductor(c);
        System.out.println("Vehículo " + v.patente + " (" + v.modelo + ") con motor " + v.motor.numeroSerie + " - Conductor " + c.nombre);
    }
}
