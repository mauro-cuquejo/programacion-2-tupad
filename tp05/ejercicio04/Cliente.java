package tp05.ejercicio04;

public class Cliente {
    private final String nombre;
    private final Long dni;
    private TarjetaDeCredito tarjetaDeCredito;  // Asociacion bidireccional 1 a 1

    public Cliente(String nombre, Long dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public TarjetaDeCredito getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(TarjetaDeCredito tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
        if (tarjetaDeCredito != null && tarjetaDeCredito.getCliente() != this) {
            tarjetaDeCredito.setCliente(this);
        }
    }

    public void mostrarTarjeta() {
        if (this.tarjetaDeCredito == null) {
            System.out.println("Cliente no tiene Tarjeta asociada");
        } else {
            System.out.println("Tarjeta asociada a Cliente: " + this + ": " + this.tarjetaDeCredito);
        }
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", dni=" + dni + "]";
    }
}
