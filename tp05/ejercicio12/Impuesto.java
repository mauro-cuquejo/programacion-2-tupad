package tp05.ejercicio12;

import java.math.BigDecimal;

public class Impuesto {
    private final BigDecimal monto;
    private Contribuyente contribuyente;  // Asociacion unidireccional

    public Impuesto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        String contribuyenteNombre = (contribuyente != null) ? contribuyente.toString() : "N/A";
        return "Impuesto [monto=" + monto + ", contribuyente=" + contribuyenteNombre + "]";
    }
}
