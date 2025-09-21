package tp05.ejercicio04;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco("Popular", "30-50001092-2");
        TarjetaDeCredito tarjetaDeCredito = new TarjetaDeCredito(300012341234L,
                LocalDateTime.of(2030, 9, 20,0,0),
                banco);

        System.out.println("Tarjeta: " + tarjetaDeCredito.getNumero());
        tarjetaDeCredito.mostrarCliente();
        tarjetaDeCredito.mostrarBanco();

        Cliente cliente = new Cliente("Mauro Cuquejo", 35353535L);
        cliente.mostrarTarjeta();
        cliente.setTarjetaDeCredito(tarjetaDeCredito);
        cliente.mostrarTarjeta();

        tarjetaDeCredito.mostrarBanco();
        tarjetaDeCredito.mostrarCliente();

    }
}
