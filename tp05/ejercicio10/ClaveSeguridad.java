package tp05.ejercicio10;

import java.time.LocalDateTime;

public class ClaveSeguridad {
    private final String codigo;
    private final LocalDateTime ultimaModificacion;

    public ClaveSeguridad(String codigo, LocalDateTime ultimaModificacion) {
        this.codigo = codigo;
        this.ultimaModificacion = ultimaModificacion;
    }

    @Override
    public String toString() {
        return "ClaveSeguridad [codigo=" + codigo + ", ultimaModificacion=" + ultimaModificacion + "]";
    }
}
