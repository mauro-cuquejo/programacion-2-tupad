package tp05.ejercicio06;

public class Mesa {
    private final Integer numero;
    private final Integer capacidad;

    public Mesa(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    @Override
    public String toString() {
        return "Mesa [numero=" + numero + ", capacidad=" + capacidad + "]";
    }

}
