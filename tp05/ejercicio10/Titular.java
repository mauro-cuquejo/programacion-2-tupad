package tp05.ejercicio10;

public class Titular {
    private String nombre;
    private Long dni;
    private CuentaBancaria cuentaBancaria;

    public Titular(String nombre, Long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
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
