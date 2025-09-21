package tp05.ejercicio04;

public class Cliente {
    private String nombre;
    private Long dni;
    private TarjetaDeCredito tarjetaDeCredito;

    public Cliente(String nombre, Long dni) {
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
            System.out.println("Tarjeta asociada a Cliente: " + this.tarjetaDeCredito.getNumero());
        }
    }
}
