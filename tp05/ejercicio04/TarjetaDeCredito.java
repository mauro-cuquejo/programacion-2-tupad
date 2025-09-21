package tp05.ejercicio04;

import java.time.LocalDateTime;

public class TarjetaDeCredito {
    private final Long numero;
    private final LocalDateTime fechaVencimiento;
    private final Banco banco; // Agregación
    private Cliente cliente;  // Asociacion bidireccional 1 a 1

    public TarjetaDeCredito(Long numero, LocalDateTime fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetaDeCredito() != this) {
            cliente.setTarjetaDeCredito(this);
        }
    }

    public void mostrarCliente() {
        if (this.cliente == null) {
            System.out.println("Tarjeta No tiene cliente asociado");
        } else {
            System.out.println("Cliente asociado a tarjeta: " + this.cliente);
        }
    }

    public void mostrarBanco() {
        if (this.banco == null) {
            System.out.println("Tarjeta No tiene banco asociado");
        } else {
            System.out.println("Banco asociado a tarjeta: " + this.banco);
        }
    }

    @Override
    public String toString() {
        return "TarjetaDeCredito [numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + "]";
    }
}
