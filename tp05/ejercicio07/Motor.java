package tp05.ejercicio07;

public class Motor {
    private String tipo;
    private Long numeroSerie;

    public Motor(String tipo, Long numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Long getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(Long numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    @Override
    public String toString() {
        return "Motor{" +
                "tipo='" + tipo + '\'' +
                ", numeroSerie=" + numeroSerie +
                '}';
    }
}
