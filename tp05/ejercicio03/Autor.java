package tp05.ejercicio03;

public class Autor {
    private final String nombre;
    private final String nacionalidad;

    public Autor(String nombre, String nacionalidad) {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + ", nacionalidad: " + this.nacionalidad;
    }
}
