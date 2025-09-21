package tp05.ejercicio11;

public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public Artista getArtista() {
        return artista;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

    public String getTitulo() {
        return titulo;
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
