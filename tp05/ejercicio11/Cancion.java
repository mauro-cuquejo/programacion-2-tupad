package tp05.ejercicio11;

public class Cancion {
    private final String titulo;
    private Artista artista;  // Asociacion unidireccional

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public void reproducir() {
        System.out.println("Reproduciendo: " + titulo + " de " + artista.getNombre());
    }

    @Override
    public String toString() {
        String artistaNombre = (artista != null) ? artista.getNombre() : "Desconocido";
        return "Cancion [titulo=" + titulo + ", artista=" + artistaNombre + "]";
    }
}
