package tp05.ejercicio08;

import java.time.LocalDateTime;

public class FirmaDigital {
    private String codigoHash;
    private LocalDateTime fecha;
    private Usuario usuario;

    public FirmaDigital(String codigoHash, LocalDateTime fecha, Usuario usuario) {
        this.codigoHash = codigoHash;
        this.fecha = fecha;
        this.usuario = usuario;
    }

    public String getCodigoHash() {
        return codigoHash;
    }

    public void setCodigoHash(String codigoHash) {
        this.codigoHash = codigoHash;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "FirmaDigital [codigoHash=" + codigoHash + ", fecha=" + fecha + ", usuario=" + usuario + "]";
    }
}
