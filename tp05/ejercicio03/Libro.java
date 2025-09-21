package tp05.ejercicio03;

public class Libro {
    private final String titulo;
    private final String isbn;
    private final Editorial editorial; // Agregacion
    private Autor autor;  // Asociacion unidireccional

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String autor = this.autor == null ? "Sin autor" : this.autor.toString();
        String editorial = this.editorial == null ? "No tiene editorial" : this.editorial.toString();
        return "titulo: " + this.titulo + ", isbn: " + this.isbn
                + ", editorial: " + editorial
                + ", autor: " + autor;
    }
}
