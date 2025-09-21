package tp05.ejercicio14;

import java.time.LocalTime;

public class Proyecto {
    private final String nombre;
    private final LocalTime duracionMin;

    public Proyecto(String nombre, LocalTime duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    private String getDuracionEnMinutos() {
        return String.valueOf(duracionMin.getHour() * 60 + duracionMin.getMinute());
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", duracion minutos=" +  getDuracionEnMinutos() + "]";
    }
}
