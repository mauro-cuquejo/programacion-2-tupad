package tp05.ejercicio09;

public class Main {
    public static void main(String[] args) {
        Paciente paciente = new Paciente("Ana Gomez", "OSDE");
        System.out.println(paciente);
        Profesional profesional = new Profesional("Dr. Luis Martinez", "Cardiologia");
        System.out.println(profesional);
        CitaMedica citaMedica = new CitaMedica(java.time.LocalDateTime.of(2024, 7, 15, 10, 30), java.time.LocalTime.of(10, 30));
        System.out.println(citaMedica);
        citaMedica.setPaciente(paciente);
        System.out.println(citaMedica);
        citaMedica.setProfesional(profesional);
        System.out.println(citaMedica);
    }
}
