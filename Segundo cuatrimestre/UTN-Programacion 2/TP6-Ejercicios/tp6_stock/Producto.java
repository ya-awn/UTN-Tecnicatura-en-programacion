package tp6_stock;

public class Producto {
    private String id;
    private String nombre;
    private double precio;
    private int cantidad;
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getCantidad() { return cantidad; }
    public CategoriaProducto getCategoria() { return categoria; }

    public void setCantidad(int cantidad) { this.cantidad = cantidad; }

    public void mostrarInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return String.format("Producto[id=%s, nombre=%s, precio=%.2f, cantidad=%d, categoria=%s]",
                id, nombre, precio, cantidad, categoria.name());
    }
}
