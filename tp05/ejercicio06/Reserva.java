package tp05.ejercicio06;

import java.time.LocalDateTime;
import java.time.LocalTime;

public class Reserva {
    private LocalDateTime fecha;
    private LocalTime hora;
    private Cliente cliente;  // Asociacion unidireccional 1 a 1
    private Mesa mesa; // Agregacion

    public Reserva(LocalDateTime fecha, LocalTime hora, Mesa mesa) {
        this.fecha = fecha;
        this.hora = hora;
        this.mesa = mesa;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void mostrarCliente() {
        if (this.cliente == null) {
            System.out.println("Ningún cliente realizó reserva");
        } else {
            System.out.println("La reserva es del cliente " + this.cliente);
        }
    }

    public void mostrarMesa() {
        if (this.mesa == null) {
            System.out.println("La Reserva no tiene asociada una mesa");
        } else {
            System.out.println("La Reserva es para la mesa  " + this.mesa);
        }
    }

    @Override
    public String toString() {
        return "Reserva realizada el: " + this.fecha + " a las " + this.hora;
    }
}
