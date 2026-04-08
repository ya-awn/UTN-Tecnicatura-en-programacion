// Ejercicio 10 – CuentaBancaria, ClaveSeguridad, Titular
class ClaveSeguridad {
    String codigo, ultimaModificacion;
    ClaveSeguridad(String c, String u){ this.codigo=c; this.ultimaModificacion=u; }
}
class Titular2 {
    String nombre, dni;
    CuentaBancaria cuenta; // bidireccional
    Titular2(String n, String d){ this.nombre=n; this.dni=d; }
}
class CuentaBancaria {
    String cbu; double saldo;
    ClaveSeguridad clave; // composición
    Titular2 titular;     // asociación
    CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular2 t){
        this.cbu=cbu; this.saldo=saldo; this.clave=clave; this.titular=t;
        t.cuenta = this;
    }
}
public class Ej10_CuentaBancaria {
    public static void main(String[] args) {
        Titular2 t = new Titular2("Gina","22111222");
        CuentaBancaria c = new CuentaBancaria("0000000000000000000000", 1500.0, new ClaveSeguridad("X1Y2","2025-06-01"), t);
        System.out.println("Cuenta " + c.cbu + " de " + t.nombre + " saldo " + c.saldo + " clave " + c.clave.codigo);
    }
}
