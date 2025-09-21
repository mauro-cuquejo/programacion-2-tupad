package tp05.ejercicio10;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CuentaBancaria {
    private final String cbu;
    private final BigDecimal saldo; //prefiero usar BigDecimal para importes, por el problema de precisión de los double.
    private final ClaveSeguridad claveSeguridad; // Composicion
    private Titular titular;  // Asociacion bidireccional 1 a 1

    public CuentaBancaria(String cbu, BigDecimal saldo, String codigo, LocalDateTime ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuentaBancaria() != this) {
            titular.setCuentaBancaria(this);
        }
    }

    @Override
    public String toString() {
        String titular = this.titular == null ? "sin titular" : String.valueOf(this.titular);
        return "CuentaBancaria [cbu=" + cbu + ", saldo=" + saldo + ", claveSeguridad=" + claveSeguridad + ", titular=" + titular + "]";
    }
}
