package tp05.ejercicio01;

import java.time.LocalDateTime;

public class Pasaporte {
    private Long numero;
    private LocalDateTime fechaEmision;
    private Titular titular; // Asociacion 1 a 1
    private Foto foto; // Composicion

    public Pasaporte(Long numero, LocalDateTime fechaEmision, String imagen, String formato) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen, formato);
    }

    public Long getNumero() {
        return numero;
    }

    public LocalDateTime getFechaEmision() {
        return fechaEmision;
    }

    public Titular getTitular() {
        return titular;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getPasaporte() != this) {
            titular.setPasaporte(this);
        }
    }

}
