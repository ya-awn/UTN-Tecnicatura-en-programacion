// Ejercicio 11 – Reproductor, Canción, Artista
class Artista2 {
    String nombre, genero;
    Artista2(String n, String g){ this.nombre=n; this.genero=g; }
}
class Cancion2 {
    String titulo;
    Artista2 artista; // asociación
    Cancion2(String t, Artista2 a){ this.titulo=t; this.artista=a; }
}
class Reproductor {
    void reproducir(Cancion2 c){ System.out.println("Reproduciendo: " + c.titulo + " por " + c.artista.nombre); }
}
public class Ej11_Reproductor {
    public static void main(String[] args) {
        Artista2 a = new Artista2("Cerati","Rock");
        Cancion2 c = new Cancion2("Crimen", a);
        new Reproductor().reproducir(c);
    }
}
