package tp05.ejercicio05;

public class Propietario {
    private String nombre;
    private Long dni;
    private Computadora computadora;

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
            System.out.println("El usuario " + this.nombre + " no tiene computadora");
        } else {
            System.out.println("El usuario " + this.nombre + " tiene una computadora " + this.computadora.getMarca());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }
}
