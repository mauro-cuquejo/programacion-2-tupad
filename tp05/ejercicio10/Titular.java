package tp05.ejercicio10;

public class Titular {
    private final String nombre;
    private final Long dni;
    private CuentaBancaria cuentaBancaria;  // Asociacion bidireccional 1 a 1

    public Titular(String nombre, Long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }

    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
        if (cuentaBancaria != null && cuentaBancaria.getTitular() != this) {
            cuentaBancaria.setTitular(this);
        }
    }

    @Override
    public String toString() {
        String cuenta = this.cuentaBancaria == null ? "sin cuenta bancaria" : String.valueOf(this.cuentaBancaria.getCbu());
        return "Titular [nombre=" + nombre + ", dni=" + dni + ", cuenta bancaria=" + cuenta + "]";
    }
}
