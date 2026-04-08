// Ejercicio 13 – GeneradorQR, Usuario, CódigoQR
class Usuario5 {
    String nombre, email;
    Usuario5(String n, String e){ this.nombre=n; this.email=e; }
}
class CodigoQR {
    String valor;
    Usuario5 usuario;
}
class GeneradorQR {
    CodigoQR generar(String valor, Usuario5 usuario){
        CodigoQR qr = new CodigoQR(); // dependencia de creación
        qr.valor = valor;
        qr.usuario = usuario;
        return qr;
    }
}
public class Ej13_GeneradorQR {
    public static void main(String[] args) {
        Usuario5 u = new Usuario5("Lau","lau@mail.com");
        CodigoQR qr = new GeneradorQR().generar("ABC-123", u);
        System.out.println("QR " + qr.valor + " para " + qr.usuario.nombre);
    }
}
