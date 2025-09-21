package tp05.ejercicio06;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        Mesa mesa = new Mesa(2, 3);
        Cliente cliente = new Cliente("Mauro", "011-47673297");
        Reserva reserva = new Reserva(LocalDateTime.of(2025, Month.SEPTEMBER, 25, 0, 0),
                LocalTime.of(19,00, 00),
                mesa);
        System.out.println(reserva);
        reserva.mostrarCliente();
        reserva.mostrarMesa();

        reserva.setCliente(cliente);
        reserva.mostrarCliente();

    }
}
