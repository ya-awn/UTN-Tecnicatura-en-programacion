package tp7_herencia_polimorfismo;

public class EmpleadoPlanta extends Empleado {

    private double sueldoBase;
    private double adicionalAntiguedad;

    public EmpleadoPlanta(String nombre, double sueldoBase, double adicionalAntiguedad) {
        super(nombre);
        this.sueldoBase = sueldoBase;
        this.adicionalAntiguedad = adicionalAntiguedad;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + adicionalAntiguedad;
    }
}
