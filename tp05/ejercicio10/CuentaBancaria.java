package tp05.ejercicio10;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CuentaBancaria {
    private String cbu;
    private BigDecimal saldo; //prefiero usar BigDecimal para importes, por el problema de precisión de los double.
    private ClaveSeguridad claveSeguridad;
    private Titular titular;

    public CuentaBancaria(String cbu, BigDecimal saldo, String codigo, LocalDateTime ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.claveSeguridad = new ClaveSeguridad(codigo, ultimaModificacion);
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public void setSaldo(BigDecimal saldo) {
        this.saldo = saldo;
    }

    public ClaveSeguridad getClaveSeguridad() {
        return claveSeguridad;
    }

    public void setClaveSeguridad(ClaveSeguridad claveSeguridad) {
        this.claveSeguridad = claveSeguridad;
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
