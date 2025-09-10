public class Gallina {
    String idGallina;
    int edad;          // en años
    int huevosPuestos; // acumulado

    public Gallina(String idGallina, int edadInicial) {
        this.idGallina = idGallina;
        this.edad = Math.max(0, edadInicial);
        this.huevosPuestos = 0;
    }

    public void ponerHuevo() {
        huevosPuestos++;
        System.out.println(idGallina + " puso un huevo. Total: " + huevosPuestos);
    }

    public void envejecer() {
        edad++;
        System.out.println(idGallina + " envejeció. Nueva edad: " + edad);
    }

    public void mostrarEstado() {
        System.out.println("Gallina " + idGallina + " | Edad: " + edad + " | Huevos: " + huevosPuestos);
    }
}
