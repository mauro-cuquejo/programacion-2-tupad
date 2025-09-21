package tp05.ejercicio05;

public class Computadora {
    private final String marca;
    private final String numeroSerie;
    private final PlacaMadre placaMadre; // Composición
    private Propietario propietario;  // Asociacion bidireccional 1 a 1

    private static final String MENSAJE = "La computadora %s %s";

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public Propietario getPropietario() {
        return this.propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this) {
            propietario.setComputadora(this);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void mostrarPlacaMadre() {
        System.out.printf(MENSAJE,
                getModeloComputadora(),
                " tiene la placa madre " + this.placaMadre + "\n");
    }

    private String getModeloComputadora() {
        return this.marca + " " + this.numeroSerie;
    }

    public void mostrarPropietario() {
        if (this.propietario == null) {
            System.out.printf(MENSAJE, getModeloComputadora(), " no tiene propietario\n");
        } else {
            System.out.printf(MENSAJE,
                    getModeloComputadora(), " tiene como propietario a " + this.propietario + "\n");
        }
    }

    @Override
    public String toString() {
        return "Computadora:\nmarca: " + this.marca + "\nnumero de serie: " + this.numeroSerie;
    }
}
