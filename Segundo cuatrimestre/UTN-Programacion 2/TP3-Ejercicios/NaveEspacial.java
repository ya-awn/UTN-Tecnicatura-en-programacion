public class NaveEspacial {
    String nombre;
    private int combustible;       // 0..capacidadMax
    private final int capacidadMax = 100;
    private boolean enVuelo = false;

    public NaveEspacial(String nombre, int combustibleInicial) {
        this.nombre = nombre;
        this.combustible = Math.min(Math.max(0, combustibleInicial), capacidadMax);
    }

    public boolean despegar() {
        int costoDespegue = 10;
        if (combustible < costoDespegue) {
            System.out.println("No hay combustible suficiente para despegar.");
            return false;
        }
        combustible -= costoDespegue;
        enVuelo = true;
        System.out.println("La nave " + nombre + " despegó. Combustible restante: " + combustible);
        return true;
    }

    public boolean avanzar(int distancia) {
        if (!enVuelo) {
            System.out.println("No se puede avanzar: la nave no está en vuelo.");
            return false;
        }
        if (distancia <= 0) {
            System.out.println("Distancia inválida.");
            return false;
        }
        int consumo = distancia; // 1 unidad de combustible por unidad de distancia
        if (combustible < consumo) {
            System.out.println("Combustible insuficiente para avanzar " + distancia + ". Disponible: " + combustible);
            return false;
        }
        combustible -= consumo;
        System.out.println("La nave avanzó " + distancia + " unidades. Combustible: " + combustible);
        return true;
    }

    public void recargarCombustible(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("Cantidad de recarga inválida.");
            return;
        }
        int antes = combustible;
        combustible = Math.min(capacidadMax, combustible + cantidad);
        int cargado = combustible - antes;
        if (cargado < cantidad) {
            System.out.println("Se alcanzó el límite. Cargado: " + cargado + ". Combustible: " + combustible + "/" + capacidadMax);
        } else {
            System.out.println("Recarga exitosa. Combustible: " + combustible + "/" + capacidadMax);
        }
    }

    public void mostrarEstado() {
        System.out.println("Nave \"" + nombre + "\" | Combustible: " + combustible + "/" + capacidadMax +
                " | En vuelo: " + enVuelo);
    }
}
