public class MainE {
    public static void main(String[] args) {

        // Crear empleados con ambos constructores
        Empleado e1 = new Empleado("Ana Gómez", "Desarrolladora");
        Empleado e2 = new Empleado("Luis Pérez", "QA Analyst");
        Empleado e3 = new Empleado(500, "Carla Ruiz", "Líder Técnico", 250000.0);

        // Actualizar salarios con métodos sobrecargados
        e1.actualizarSalario(10);          // +10%
        e2.actualizarSalarioCantidad(15000); // +15.000
        e3.actualizarSalario(-5);          // -5%

        // Mostrar información
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        // Total de empleados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}