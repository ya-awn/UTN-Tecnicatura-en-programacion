package tp8_interfaces_y_excepciones;

public class Cliente implements Notificable {

    private String nombre;
    private String email;

    public Cliente(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public void notificarCambioEstado(String mensaje) {
        System.out.println("[Notificación a " + nombre + " - " + email + "]: " + mensaje);
    }
}
