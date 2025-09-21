package tp05.ejercicio09;

public class Paciente {
    private final String nombre;
    private final String obraSocial;

    public Paciente(String nombre, String obraSocial) {
        this.nombre = nombre;
        this.obraSocial = obraSocial;
    }

    @Override
    public String toString() {
        return "Paciente [nombre=" + nombre + ", obraSocial=" + obraSocial + "]";
    }
}
