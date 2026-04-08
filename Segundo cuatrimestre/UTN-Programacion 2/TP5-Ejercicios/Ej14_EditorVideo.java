// Ejercicio 14 – EditorVideo, Proyecto, Render
class Proyecto {
    String nombre; int duracionMin;
    Proyecto(String n, int d){ this.nombre=n; this.duracionMin=d; }
}
class Render {
    String formato;
    Proyecto proyecto; // asociación unidireccional
}
class EditorVideo {
    Render exportar(String formato, Proyecto proyecto){
        Render r = new Render(); // dependencia de creación
        r.formato = formato;
        r.proyecto = proyecto;
        return r;
    }
}
public class Ej14_EditorVideo {
    public static void main(String[] args) {
        Proyecto p = new Proyecto("Spot Redes", 30);
        Render r = new EditorVideo().exportar("MP4", p);
        System.out.println("Render " + r.formato + " del proyecto " + r.proyecto.nombre);
    }
}
