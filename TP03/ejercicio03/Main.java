package TP03.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Martín Fierro", "José Hernández", 1875);

        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("Autor: " + libro1.getAutor());
        System.out.println("Año de Publicación: " + libro1.getAnioPublicacion());

        libro1.setAnioPublicacion(1872);
        System.out.println("Año de Publicación actualizado: " + libro1.getAnioPublicacion());

        libro1.setAnioPublicacion(2026);
        libro1.setAnioPublicacion(-10);
    }

}
