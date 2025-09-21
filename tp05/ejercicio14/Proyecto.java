package tp05.ejercicio14;

import java.time.LocalTime;

public class Proyecto {
    private String nombre;
    private LocalTime duracionMin;

    public Proyecto(String nombre, LocalTime duracionMin) {
        this.nombre = nombre;
        this.duracionMin = duracionMin;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalTime getDuracionMin() {
        return duracionMin;
    }

    public void setDuracionMin(LocalTime duracionMin) {
        this.duracionMin = duracionMin;
    }

    @Override
    public String toString() {
        return "Proyecto [nombre=" + nombre + ", duracion minutos=" +  getDuracionEnMinutos() + "]";
    }

    private String getDuracionEnMinutos() {
        return String.valueOf(duracionMin.getHour() * 60 + duracionMin.getMinute());
    }
}
