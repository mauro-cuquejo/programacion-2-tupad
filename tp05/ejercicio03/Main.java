package tp05.ejercicio03;

public class Main {
    public static void main(String[] args) {
        Editorial editorial = new Editorial("La flor", "Suipacha 102");
        Libro libro = new Libro("Todo Minerva", "1234asd123", editorial);
        System.out.println(libro);
        Autor autor = new Autor("Onik", "Argentina");
        libro.setAutor(autor);
        System.out.println(libro);
    }
}
