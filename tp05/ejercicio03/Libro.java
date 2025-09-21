package tp05.ejercicio03;

public class Libro {
    private String titulo;
    private String isbn;
    private Editorial editorial;
    private Autor autor;

    public Libro(String titulo, String isbn, Editorial editorial) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.editorial = editorial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String autor = this.autor == null ? "Sin autor" : this.autor.getNombre();
        String editorial = this.editorial == null ? "No tiene editorial" : this.editorial.getNombre();
        return "titulo: " + this.titulo + ", isbn: " + this.isbn
                + ", editorial: " + editorial
                + ", autor: " + autor;
    }
}
