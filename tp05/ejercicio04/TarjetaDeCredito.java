package tp05.ejercicio04;

import java.time.LocalDateTime;

public class TarjetaDeCredito {
    private Long numero;
    private LocalDateTime fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaDeCredito(Long numero, LocalDateTime fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public LocalDateTime getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDateTime fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
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
            System.out.println("Cliente asociado a tarjeta: " + this.cliente.getNombre());
        }
    }

    public void mostrarBanco() {
        if (this.banco == null) {
            System.out.println("Tarjeta No tiene banco asociado");
        } else {
            System.out.println("Banco asociado a tarjeta: " + this.banco.getNombre());
        }
    }
}
