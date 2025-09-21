package tp05.ejercicio03;

public class Editorial {

    private final String nombre;
    private final String direccion;

    public Editorial(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "nombre: " + this.nombre + ", direccion: " + this.direccion;
    }

}
