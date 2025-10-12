package org.utn.ejercicio02;

import org.utn.ejercicio02.modelos.Autor;
import org.utn.ejercicio02.modelos.Biblioteca;
import org.utn.ejercicio02.modelos.Libro;

import java.util.List;

public class Main {
    static void main() {
        System.out.println("\n\n************************** INICIO EJERCICIO 02 **************************");
        System.out.println("\nCrear biblioteca:");
        Biblioteca biblioteca = new Biblioteca("Biblioteca del Amanecer");
        biblioteca.listarLibros();

        System.out.println("\nCrear autores:");
        Autor borges = new Autor("1", "Jorge Luis Borges", "Argentina");
        borges.mostrarInfo();
        Autor quiroga = new Autor("2", "Horacio Quiroga", "Argentina");
        quiroga.mostrarInfo();
        Autor hernandez = new Autor("3", "José Hernández", "Argentina");
        hernandez.mostrarInfo();

        System.out.println("\nAgregar libros a biblioteca:");
        biblioteca.agregarLibro("123", "Cuentos de Amor, de locura y de muerte", 1917, quiroga);
        biblioteca.agregarLibro("456", "El aleph", 1949, borges);
        biblioteca.agregarLibro("789", "Martín Fierro", 1872, hernandez);
        biblioteca.agregarLibro("1011", "Cuentos de la Selva", 1918, quiroga);
        biblioteca.agregarLibro("1213", "El jardín de los senderos que se bifurcan", 1942, borges);
        biblioteca.agregarLibro("1415", "La muerte y la brújula", 1942, borges);

        System.out.println("\nListar libros de biblioteca:");
        biblioteca.listarLibros();

        System.out.println("\nBuscar libro por ISBN:");
        Libro libroPorIsbn = biblioteca.buscarLibroPorIsbn("1011");
        libroPorIsbn.mostrarInfo();
        System.out.println("\nFiltrar libros por año:");
        List<Libro> librosFiltradosPorAnio = biblioteca.filtrarLibrosPorAnio(1942);
        for (Libro libro : librosFiltradosPorAnio) {
            libro.mostrarInfo();
        }

        System.out.println("\nEliminar libro por ISBN:");
        System.out.println("Antes de eliminar libro de ISBN 789:");
        biblioteca.listarLibros();
        biblioteca.eliminarLibro("789");
        System.out.println("\nDespués de eliminar libro de ISBN 789:");
        biblioteca.listarLibros();

        System.out.println("\nObtener cantidad de libros disponible:");
        int cantidadLibrosDisponibles = biblioteca.obtenerCantidadLibros();
        System.out.println("Cantidad de libros disponible: " + cantidadLibrosDisponibles);

        System.out.println("\nListar autores disponibles:");
        biblioteca.mostrarAutoresDisponibles();

        System.out.println("\n\n************************** FIN EJERCICIO 02 **************************");
    }
}
