package tp05.ejercicio06;

public class Mesa {
    private Integer numero;
    private Integer capacidad;

    public Mesa(Integer numero, Integer capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
