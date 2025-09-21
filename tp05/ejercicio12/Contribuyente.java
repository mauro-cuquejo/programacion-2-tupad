package tp05.ejercicio12;

public class Contribuyente {
    private final String nombre;
    private final String cuil;

    public Contribuyente(String nombre, String cuil) {
        this.nombre = nombre;
        this.cuil = cuil;
    }

    @Override
    public String toString() {
        return "Contribuyente [nombre=" + nombre + ", cuil=" + cuil + "]";
    }
}
