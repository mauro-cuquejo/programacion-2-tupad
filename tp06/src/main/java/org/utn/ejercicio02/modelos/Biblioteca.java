package org.utn.ejercicio02.modelos;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private final String nombre;
    private final List<Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }

    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
        libros.add(nuevoLibro);
    }

    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca '" + nombre + "' no contiene libros aún.");
        }
        for (Libro libro : libros) {
            System.out.println(libro);
        }
    }

    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equalsIgnoreCase(isbn)) {
                return libro;
            }
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        Libro libroAEliminar = this.buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            libros.remove(libroAEliminar);
        }
    }

    public int obtenerCantidadLibros() {
        return libros.size();
    }

    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> librosFiltradosPorAnio = new ArrayList<>();
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                librosFiltradosPorAnio.add(libro);
            }
        }
        return librosFiltradosPorAnio;
    }

    public void mostrarAutoresDisponibles() {
        List<Autor> autoresDisponibles = new ArrayList<>();
        for (Libro libro : libros) {
            if (!autoresDisponibles.contains(libro.getAutor())) {
                autoresDisponibles.add(libro.getAutor());
            }
        }
        if (autoresDisponibles.isEmpty()) {
            System.out.println("No hay autores disponibles");
        }
        for (Autor autor : autoresDisponibles) {
            autor.mostrarInfo();
        }
    }
}
