package tp05.ejercicio09;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class CitaMedica {
    private LocalDateTime fecha;
    private LocalTime hora;
    private Paciente paciente; //asociacion unidireccional
    private Profesional profesional; //asociacion unidireccional

    public CitaMedica(LocalDateTime fecha, LocalTime hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }

    @Override
    public String toString() {
        String paciente = this.paciente == null ? "sin paciente" : String.valueOf(this.paciente);
        String profesional = this.profesional == null ? "sin profesional" : String.valueOf(this.profesional);

        return "CitaMedica [fecha=" + fecha + ", hora=" + hora
                + ", paciente=" + paciente
                + ", profesional=" + profesional + "]";
    }
}
