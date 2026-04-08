public class Empleado {

    // ===== Atributos de instancia =====
    private int id;
    private String nombre;
    private String puesto;
    private double salario;

    // ===== Atributos estáticos =====
    private static int totalEmpleados = 0;
    private static int secuenciaId = 1;

    // ===== Constructores =====
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = validarNoNegativo(salario);
        totalEmpleados++;
    }

    public Empleado(String nombre, String puesto) {
        this.id = secuenciaId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 100000.0; // salario por defecto
        totalEmpleados++;
    }

    // ===== Métodos sobrecargados =====
    public void actualizarSalario(double porcentaje) {
        double factor = 1 + (porcentaje / 100.0);
        this.salario = validarNoNegativo(this.salario * factor);
    }

    public void actualizarSalarioCantidad(double monto) {
        this.salario = validarNoNegativo(this.salario + monto);
    }

    // ===== Getters y setters =====
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = validarNoNegativo(salario); }

    // ===== Método estático =====
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // ===== Representación en cadena =====
    @Override
    public String toString() {
        return "Empleado { " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                " }";
    }

    // ===== Utilidad interna =====
    private double validarNoNegativo(double valor) {
        return (valor < 0) ? 0.0 : valor;
    }
}