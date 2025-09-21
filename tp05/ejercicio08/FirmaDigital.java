package tp05.ejercicio08;

import java.time.LocalDateTime;

public class FirmaDigital {
    private final String codigoHash;
    private final LocalDateTime fecha;
    private final Usuario usuario; // Agregación

    public FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "]";
    }
}
