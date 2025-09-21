package tp05.ejercicio05;

public class PlacaMadre {
    private String modelo;
    private String chipset;

    public String getModelo() {
        return modelo;
    }

    public PlacaMadre(String modelo, String chipset) {
        this.modelo = modelo;
        this.chipset = chipset;
    }

    @Override
    public String toString() {
        return "PlacaMadre [modelo=" + modelo + ", chipset=" + chipset + "]";
    }
}
