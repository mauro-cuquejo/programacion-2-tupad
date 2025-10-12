package org.utn.ejercicio02.modelos;

public class Libro {
    private final String isbn;
    private final String titulo;
    private final int anioPublicacion;
    private final Autor autor;

    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{isbn: " + isbn + ", titulo: " + titulo + ", año de publicación: " + anioPublicacion +
                " autor: " + autor + "}";
    }

    public void mostrarInfo() {
        System.out.println(this);
    }

    public String getIsbn() {
        return isbn;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }
}
