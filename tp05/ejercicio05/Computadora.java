package tp05.ejercicio05;

public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    private final String MENSAJE = "La computadora %s %s";

    public Computadora(String marca, String numeroSerie, String modelo, String chipset) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset);
    }

    public PlacaMadre getPlacaMadre() {
        return this.placaMadre;
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

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public void mostrarPlacaMadre() {
        if (this.placaMadre == null) {
            System.out.printf(MENSAJE, getModeloComputadora(), "no tiene placa madre\n");
        } else {
            System.out.printf(MENSAJE,
                    getModeloComputadora(),
                    " tiene la placa madre " + this.placaMadre.getModelo() + "\n");
        }
    }

    private String getModeloComputadora() {
        return this.marca + " " + this.numeroSerie;
    }

    public void mostrarPropietario() {
        if (this.propietario == null) {
            System.out.printf(MENSAJE, getModeloComputadora(), " no tiene propietario\n");
        } else {
            System.out.printf(MENSAJE,
                    getModeloComputadora(), " tiene como propietario a " + this.propietario.getNombre() + "\n");
        }
    }

    @Override
    public String toString() {
        return "Computadora:\nmarca: " + this.marca + "\nnumero de serie: " + this.numeroSerie;
    }
}
