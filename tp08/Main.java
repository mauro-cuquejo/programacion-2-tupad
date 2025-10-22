package tp08;

import tp08.parte01.ecommerce.cliente.Cliente;
import tp08.parte01.ecommerce.Pedido;
import tp08.parte01.ecommerce.Producto;
import tp08.parte01.ecommerce.Estados;
import tp08.parte01.ecommerce.mediosdepago.MedioDePago;
import tp08.parte01.ecommerce.mediosdepago.PayPal;
import tp08.parte01.ecommerce.mediosdepago.TarjetaCredito;

public class Main {
    public static void main(String[] args) {
        System.out.println("TP08");
        ejercicio01();
    }

    public static void ejercicio01() {
        // Se crea el cliente
        System.out.println("Se crea el cliente");
        Cliente cliente = new Cliente("Mauro Cuquejo");

        // Se crean los productos
        System.out.println("\nSe crean los productos");
        Producto producto1 = new Producto("Papas Fritas Crunchy", 100.0);
        Producto producto2 = new Producto("Gaseosa Secco", 150.0);
        Producto producto3 = new Producto("Dulce de Leche la Vaquita contenta", 50.0);

        // Se crean medios de pago
        System.out.println("\nSe crean medios de pago");
        MedioDePago tarjeta = new TarjetaCredito();
        MedioDePago payPal = new PayPal();

        // Se crea el pedido
        System.out.println("\nSe crea el pedido");
        Pedido pedido = new Pedido(cliente, 1);

        // Se prueban agregados y eliminaciones de productos del pedido
        System.out.println("\nSe prueban agregados y eliminaciones de productos del pedido");
        pedido.agregarProducto(producto1);
        pedido.agregarProducto(producto2);
        pedido.eliminarProducto(producto3);
        pedido.agregarProducto(producto3);
        pedido.agregarProducto(null);

        // Se muestran los productos del pedido y el total
        System.out.println("\nSe muestran los productos del pedido y el total");
        pedido.mostrarProductos();
        cliente.notificar("El total de su pedido es: " + pedido.calcularTotal());

        // Se procesa el pago
        System.out.println("\nSe procesa el pago");
        pedido.procesarPago(null);
        int x = 1;
        while (pedido.getEstado() != Estados.PAGADO) {
            System.out.println("\nIntento de pago nro: " + (x));
            pedido.procesarPago(tarjeta);
            x++;
        }

        // Se intenta volver a pagar un pedido pagado
        System.out.println("\nSe intenta volver a pagar un pedido pagado");
        pedido.procesarPago(tarjeta);

        // Se envía el pedido
        System.out.println("\nSe envía el pedido");
        pedido.enviarPedido();

        // Se intenta volver a pagar un pedido enviado
        System.out.println("\nSe intenta volver a pagar un pedido enviado");
        pedido.procesarPago(tarjeta);

        // Se crea un segundo pedido para el mismo cliente
        System.out.println("\nSe crea un segundo pedido para el mismo cliente");
        Pedido pedido2 = new Pedido(cliente, 2);
        pedido2.mostrarProductos();
        pedido2.agregarProducto(producto2);
        pedido2.mostrarProductos();

        // Se envía el segundo pedido sin pagar
        System.out.println("\nSe envía el segundo pedido sin pagar");
        pedido2.enviarPedido();

        // Se procesa el pago del segundo pedido con PayPal
        System.out.println("\nSe procesa el pago del segundo pedido con PayPal");
        x = 1;
        while (pedido2.getEstado() != Estados.PAGADO) {
            System.out.println("\nIntento de pago nro: " + (x));
            pedido2.procesarPago(payPal);
            x++;
        }

        // Se envía el segundo pedido
        System.out.println("\nSe envía el segundo pedido");
        pedido2.enviarPedido();
    }
}
