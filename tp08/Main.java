package tp08;

import tp08.parte01.ecommerce.cliente.Cliente;
import tp08.parte01.ecommerce.Pedido;
import tp08.parte01.ecommerce.Producto;
import tp08.parte01.ecommerce.Estados;
import tp08.parte01.ecommerce.mediosdepago.MedioDePago;
import tp08.parte01.ecommerce.mediosdepago.PayPal;
import tp08.parte01.ecommerce.mediosdepago.TarjetaCredito;
import tp08.parte02.cadenanumero.ConversorCadena;
import tp08.parte02.divisionsegura.DivisionSegura;
import tp08.parte02.excepcionpersonalizada.ValidadorEdad;
import tp08.parte02.lecturaarchivo.LecturaArchivo;
import tp08.parte02.trywithresources.LecturaArchivoWithResources;

public class Main {
    public static void main(String[] args) {
        System.out.println("TP08");
        ejercicio01();
        ejercicio02();
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

    public static void ejercicio02() {
        System.out.println("\nEjercicio 2.1 - División Segura");
        System.out.println("división válida");
        System.out.println(DivisionSegura.dividir(10, 2));
        System.out.println("\ndivisión por cero");
        System.out.println(DivisionSegura.dividir(10, 0));

        System.out.println("\nEjercicio 2.2 - Conversor de Cadena a Número");
        System.out.println("cadena válida");
        System.out.println(ConversorCadena.convertirANumero("123"));
        System.out.println("\ncadena inválida");
        System.out.println(ConversorCadena.convertirANumero("abc"));

        System.out.println("\nEjercicio 2.3 - Lectura de Archivo");
        System.out.println("lectura de archivo existente");
        LecturaArchivo.leerArchivo("tp08\\parte02\\lecturaarchivo\\archivo.txt");
        System.out.println("\nlectura de archivo inexistente");
        LecturaArchivo.leerArchivo("archivo_inexistente.txt");

        System.out.println("\nEjercicio 2.4 - Validación de Edad con Excepción Personalizada");
        System.out.println("edad válida");
        ValidadorEdad.validarEdad(25);
        System.out.println("\nedad inválida");
        ValidadorEdad.validarEdad(-5);

        System.out.println("\nEjercicio 2.5 - Lectura de Archivo con Try-With-Resources");
        System.out.println("lectura de archivo existente");
        LecturaArchivoWithResources.leerArchivo("tp08\\parte02\\trywithresources\\archivo.txt");
        System.out.println("\nlectura de archivo inexistente");
        LecturaArchivoWithResources.leerArchivo("archivo_inexistente.txt");
    }
}
