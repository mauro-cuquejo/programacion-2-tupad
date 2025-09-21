package tp05.ejercicio06;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserva {
    private LocalDateTime fecha;
    private LocalTime hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(LocalDateTime fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public LocalTime getHora() {
        return hora;
    }

    public void setHora(LocalTime hora) {
        this.hora = hora;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }

    public void mostrarCliente() {
        if (this.cliente == null) {
            System.out.println("Ningún cliente realizó reserva");
        } else {
            System.out.println("La reserva es del cliente " + this.cliente.getNombre());
        }
    }

    public void mostrarMesa() {
        if (this.mesa == null) {
            System.out.println("La Reserva no tiene asociada una mesa");
        } else {
            System.out.println("La Reserva es para la mesa  " + this.mesa.getNumero());
        }
    }

    @Override
    public String toString() {
        return "Reserva realizada el: " + this.fecha + " a las " + this.hora;
    }
}
