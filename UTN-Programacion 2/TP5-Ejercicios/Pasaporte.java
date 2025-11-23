import java.time.LocalDate;
class Foto {
    private byte[] imagen;
    private String formato;
    public Foto(byte[] imagen, String formato) { this.imagen = imagen; this.formato = formato; }
    public byte[] getImagen() { return imagen; }
    public String getFormato() { return formato; }
}
class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // asociación bidireccional
    public Titular(String nombre, String dni) { this.nombre = nombre; this.dni = dni; }
    void setPasaporte(Pasaporte p){ this.pasaporte = p; }
    public Pasaporte getPasaporte(){ return pasaporte; }
}
class Pasaporte {
    private String numero;
    private LocalDate fechaEmision;
    private Foto foto;          // composición
    private Titular titular;    // asociación
    public Pasaporte(String numero, LocalDate fechaEmision, Foto foto, Titular titular){
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto; // composición: creada/inyectada y gestionada por Pasaporte
        this.titular = titular;
        if (titular != null) titular.setPasaporte(this); // mantener bidireccionalidad
    }
}
