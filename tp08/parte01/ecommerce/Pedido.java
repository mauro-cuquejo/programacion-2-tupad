package tp08.parte01.ecommerce;

import java.util.ArrayList;
import java.util.List;

import tp08.parte01.ecommerce.cliente.Cliente;
import tp08.parte01.ecommerce.cliente.Notificable;
import tp08.parte01.ecommerce.mediosdepago.MedioDePago;

public class Pedido implements Pagable {
    private List<Producto> productos;
    private Estados estado;
    private Cliente cliente;
    private int numeroPedido;

    private final static double DESCUENTO_TARJETA_CREDITO = 10.0;

    public Pedido(Cliente cliente, int numeroPedido) {
        this.productos = new ArrayList<>();
        this.estado = Estados.CREADO;
        this.cliente = cliente;
        this.numeroPedido = numeroPedido;
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto producto : productos) {
            total += producto.calcularTotal();
        }
        return total;
    }

    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
            System.out.println("Producto " + producto.getNombre() + " agregado al pedido nro: " + this.numeroPedido);
        } else {
            System.out.println("No se puede agregar un producto nulo al pedido nro: " + this.numeroPedido);
        }
    }

    public void eliminarProducto(Producto producto) {
        if (productos.contains(producto)) {
            this.productos.remove(producto);
            System.out.println("Producto " + producto.getNombre() + " eliminado del pedido nro: " + this.numeroPedido);
        } else {
            System.out.println(
                    "Error al eliminar: El producto " + producto.getNombre() + " no se encuentra en el pedido nro: "
                            + this.numeroPedido);
        }
    }

    public void actualizarEstado(Notificable cliente, Estados estado) {
        if (this.estado != estado) {
            this.estado = estado;
            cliente.notificar("El pedido de nro: " + this.numeroPedido + " se encuentra en estado: " + this.estado);
        }
    }

    public void procesarPago(MedioDePago medioDePago) {
        if (medioDePago == null) {
            System.out.println("Error al procesar pago pedido nro " + this.numeroPedido + ": Medio de pago no válido.");
            return;
        }
        if (this.estado != Estados.CREADO) {
            System.out.println("Error en procesamiento de pago. El pedido nro: " + this.numeroPedido
                    + " ya está en estado: " + this.estado);
            return;
        }
        double total = this.calcularTotal();
        if (medioDePago.getTipoMedioDePago().equals("Tarjeta de Crédito")) {
            System.out.println("Aplicando descuento por pago con Tarjeta de Crédito.");
            total = medioDePago.aplicarDescuento(total, DESCUENTO_TARJETA_CREDITO);
        } else {
            System.out.println("No se aplican descuentos por el medio de pago seleccionado.");
        }
        medioDePago.procesarPago(total);

        if (pagoTarjetaExitoso(medioDePago)) {
            this.actualizarEstado(this.cliente, Estados.PAGADO);
        }
    }

    public void enviarPedido() {
        if (this.estado == Estados.PAGADO) {
            this.actualizarEstado(this.cliente, Estados.ENVIADO);
            System.out.println("El pedido de nro: " + this.numeroPedido + " ha sido enviado.");
        } else {
            System.out.println(
                    "El pedido de nro: " + this.numeroPedido + " no puede ser enviado. Estado actual: " + this.estado);
        }
    }

    private boolean pagoTarjetaExitoso(MedioDePago medioDePago) {
        // Simulación de pago exitoso con tarjeta de crédito
        // se genera un numero random entre 1 y 1000. Si el número es mayor a 500, el
        // pago falla
        int numeroRandom = (int) (Math.random() * 1000) + 1;
        if (numeroRandom > 500) {
            System.out.println("El pago con " + medioDePago.getTipoMedioDePago() + " ha fallado.");
            return false;
        }
        System.out.println("El pago con " + medioDePago.getTipoMedioDePago() + " ha sido exitoso.");
        return true;
    }

    public void mostrarProductos() {
        System.out.println("Productos en el pedido de nro: " + this.numeroPedido + ":");
        if (productos.isEmpty()) {
            System.out.println("No hay productos en el pedido.");
        }
        for (Producto producto : productos) {
            System.out.println("- " + producto.getNombre() + ": $" + producto.calcularTotal());
        }
    }

    public Estados getEstado() {
        return estado;
    }

}
