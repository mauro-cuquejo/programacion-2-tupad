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

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profesional getProfesional() {
        return profesional;
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
