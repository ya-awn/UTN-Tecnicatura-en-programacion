package tp8_interfaces_y_excepciones;

import java.util.ArrayList;
import java.util.List;

public class Pedido implements Pagable {

    private List<Producto> productos;
    private Cliente cliente;
    private String estado;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        this.estado = "Creado";
        notificarEstado();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getEstado() {
        return estado;
    }

    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        notificarEstado();
    }

    private void notificarEstado() {
        if (cliente != null) {
            cliente.notificarCambioEstado("El pedido ha cambiado de estado a: " + estado);
        }
    }

    @Override
    public double calcularTotal() {
        double total = 0.0;
        for (Producto p : productos) {
            total += p.calcularTotal();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Pedido de " + cliente.getNombre() + " - Estado: " + estado + " - Total: $" + calcularTotal();
    }
}
