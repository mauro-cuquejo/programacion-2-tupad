package tp05.ejercicio07;

public class Motor {
    private final String tipo;
    private final Long numeroSerie;

    public Motor(String tipo, Long numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public Long getNumeroSerie() {
        return numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
