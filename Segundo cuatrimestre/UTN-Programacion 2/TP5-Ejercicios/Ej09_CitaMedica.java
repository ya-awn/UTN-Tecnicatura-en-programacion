// Ejercicio 9 – CitaMédica, Paciente, Profesional
class Paciente {
    String nombre, obraSocial;
    Paciente(String n, String o){ this.nombre=n; this.obraSocial=o; }
}
class Profesional {
    String nombre, especialidad;
    Profesional(String n, String e){ this.nombre=n; this.especialidad=e; }
}
class CitaMedica {
    String fecha, hora;
    Paciente paciente;      // asociación unidireccional
    Profesional profesional;// asociación unidireccional
    CitaMedica(String f, String h, Paciente p, Profesional pr){ this.fecha=f; this.hora=h; this.paciente=p; this.profesional=pr; }
}
public class Ej09_CitaMedica {
    public static void main(String[] args) {
        CitaMedica c = new CitaMedica("2025-09-30","10:30", new Paciente("Teo","OSDE"), new Profesional("Dra. Luz","Clínica"));
        System.out.println("Cita " + c.fecha + " " + c.hora + " con " + c.profesional.nombre + " - Paciente " + c.paciente.nombre);
    }
}
