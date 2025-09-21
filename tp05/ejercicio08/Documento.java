package tp05.ejercicio08;

import java.time.LocalDateTime;

public class Documento {
    private String titulo;
    private String contenido;
    private FirmaDigital firmaDigital; //composicion

    public Documento(String titulo, String contenido, String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.firmaDigital = new FirmaDigital(codigoHash, fecha, usuario);
    }

    public FirmaDigital getFirmaDigital() {
        return firmaDigital;
    }

    @Override
    public String toString() {
        return "Documento [titulo=" + titulo + ", contenido=" + contenido + ", firmaDigital=" + firmaDigital + "]";
    }
}
