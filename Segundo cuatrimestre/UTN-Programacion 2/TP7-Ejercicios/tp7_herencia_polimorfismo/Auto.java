package tp7_herencia_polimorfismo;

public class Auto extends Vehiculo {

    private int cantidadPuertas;

    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    public int getCantidadPuertas() {
        return cantidadPuertas;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Auto:");
        System.out.println("  Marca: " + getMarca());
        System.out.println("  Modelo: " + getModelo());
        System.out.println("  Puertas: " + cantidadPuertas);
    }
}
