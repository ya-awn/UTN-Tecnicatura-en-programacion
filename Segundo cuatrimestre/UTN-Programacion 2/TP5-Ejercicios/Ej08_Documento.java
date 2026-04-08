// Ejercicio 8 – Documento, FirmaDigital, Usuario
class Usuario4 {
    String nombre, email;
    Usuario4(String n, String e) { this.nombre=n; this.email=e; }
}
class FirmaDigital {
    String codigoHash, fecha;
    Usuario4 usuario; // agregación (referencia al firmante)
    FirmaDigital(String h, String f, Usuario4 u) { this.codigoHash=h; this.fecha=f; this.usuario=u; }
}
class Documento {
    String titulo, contenido;
    FirmaDigital firma; // composición
    Documento(String t, String c, FirmaDigital f) { this.titulo=t; this.contenido=c; this.firma=f; }
}
public class Ej08_Documento {
    public static void main(String[] args) {
        Usuario4 u = new Usuario4("Sol","sol@mail.com");
        Documento d = new Documento("Contrato","Contenido...", new FirmaDigital("abc123","2025-09-01", u));
        System.out.println("Doc: " + d.titulo + " firmado por " + d.firma.usuario.nombre + " hash " + d.firma.codigoHash);
    }
}
