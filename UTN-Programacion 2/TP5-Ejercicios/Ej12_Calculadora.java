// Ejercicio 12 – Impuesto, Contribuyente, Calculadora
class Contribuyente {
    String nombre, cuil;
    Contribuyente(String n, String c){ this.nombre=n; this.cuil=c; }
}
class Impuesto {
    double monto;
    Contribuyente contribuyente; // asociación
    Impuesto(double m, Contribuyente c){ this.monto=m; this.contribuyente=c; }
}
class Calculadora {
    void calcular(Impuesto i){ System.out.println("Impuesto de " + i.contribuyente.nombre + ": $" + i.monto); }
}
public class Ej12_Calculadora {
    public static void main(String[] args) {
        Contribuyente c = new Contribuyente("Sara","20-12345678-3");
        Impuesto i = new Impuesto(12345.67, c);
        new Calculadora().calcular(i);
    }
}
