package tp05.ejercicio05;

public class Propietario {
    private final String nombre;
    private final Long dni;
    private Computadora computadora;  // Asociacion bidireccional 1 a 1

    public Propietario(String nombre, Long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Computadora getComputadora() {
        return this.computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this) {
            computadora.setPropietario(this);
        }
    }

    public void mostrarComputadora() {
        if (this.computadora == null) {
            System.out.println("El propietario " + this + " no tiene computadora");
        } else {
            System.out.println("El propietario " + this + " tiene una computadora " + this.computadora.getMarca());
        }
    }

    @Override
    public String toString() {
        return "Propietario [nombre=" + nombre + ", dni=" + dni + "]";
    }

}
