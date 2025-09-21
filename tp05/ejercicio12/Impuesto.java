package tp05.ejercicio12;

import java.math.BigDecimal;

public class Impuesto {
    private BigDecimal monto;
    private Contribuyente contribuyente;

    public Impuesto(BigDecimal monto) {
        this.monto = monto;
    }

    public BigDecimal getMonto() {
        return monto;
    }

    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }

    public Contribuyente getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }

    @Override
    public String toString() {
        String contribuyenteNombre = (contribuyente != null) ? contribuyente.getNombre() : "N/A";
        return "Impuesto [monto=" + monto + ", contribuyente=" + contribuyenteNombre + "]";
    }
}
