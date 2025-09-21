package tp05.ejercicio11;

public class Main {
    public static void main(String[] args) {
        Artista artista = new Artista("The Beatles", "Rock");
        System.out.println(artista);
        Cancion cancion = new Cancion("Hey Jude");
        System.out.println(cancion);
        cancion.setArtista(artista);
        System.out.println(cancion);
        Reproductor.reproducir(cancion);
    }
}
