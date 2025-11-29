// Ejercicio 4 – TarjetaDeCredito, Cliente, Banco
class Cliente2 {
    String nombre, dni;
    TarjetaDeCredito tarjeta; // bidireccional
    Cliente2(String n, String d) { this.nombre=n; this.dni=d; }
}
class Banco {
    String nombre, cuit;
    Banco(String n, String c) { this.nombre=n; this.cuit=c; }
}
class TarjetaDeCredito {
    String numero, fechaVencimiento;
    Cliente2 cliente; // bidireccional
    Banco banco;      // agregación
    TarjetaDeCredito(String num, String fv, Banco b, Cliente2 c) {
        this.numero=num; this.fechaVencimiento=fv; this.banco=b; this.cliente=c;
        c.tarjeta = this;
    }
}
public class Ej04_Tarjeta {
    public static void main(String[] args) {
        Banco b = new Banco("Banco Rio","30-12345678-9");
        Cliente2 c = new Cliente2("Mara","30111222");
        TarjetaDeCredito t = new TarjetaDeCredito("4500-xxxx-xxxx-1234","12/27", b, c);
        System.out.println("Tarjeta " + t.numero + " de " + t.cliente.nombre + " en " + t.banco.nombre);
    }
}
