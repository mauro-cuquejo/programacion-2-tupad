package org.utn.ejercicio01;

import org.utn.ejercicio01.modelos.CategoriaProducto;
import org.utn.ejercicio01.modelos.Inventario;
import org.utn.ejercicio01.modelos.Producto;

import java.util.List;

public class Main {
    static void main() {
        System.out.println("************************** INICIO EJERCICIO 01 **************************");
        Producto remera = new Producto("1", "remera", 5000.0, 20, CategoriaProducto.ROPA);
        Producto notebook = new Producto("2", "notebook", 1000000.0, 10, CategoriaProducto.ELECTRONICA);
        Producto escoba = new Producto("3", "escoba", 3000.0, 15, CategoriaProducto.HOGAR);
        Producto fideos = new Producto("4", "fideos", 1000.0, 14, CategoriaProducto.ALIMENTOS);
        Producto pantalon = new Producto("5", "pantalon", 30000.0, 20, CategoriaProducto.ROPA);
        Producto teclado = new Producto("6", "teclado", 2400.50, 20, CategoriaProducto.ELECTRONICA);

        Inventario inventario = new Inventario();

        System.out.println("\nListar productos con inventario vacío:");
        inventario.listarProductos();

        inventario.agregarProducto(remera);
        inventario.agregarProducto(notebook);
        inventario.agregarProducto(escoba);
        inventario.agregarProducto(fideos);
        inventario.agregarProducto(pantalon);
        inventario.agregarProducto(teclado);

        System.out.println("\nListar productos con inventario cargado:");
        inventario.listarProductos();

        System.out.println("\nBuscar productos por ID:");
        Producto productoBuscadoPorId = inventario.buscarProductoPorId("5");
        productoBuscadoPorId.mostrarInfo();


        System.out.println("\nFiltrar productos por Categoria:");
        List<Producto> productosFiltradosPorCategoria = inventario.filtrarPorCategoria(CategoriaProducto.ROPA);
        for (Producto producto : productosFiltradosPorCategoria) {
            producto.mostrarInfo();
        }

        System.out.println("\nEliminar producto por ID:");
        System.out.println("Antes de eliminar producto de ID 3:");
        inventario.listarProductos();
        inventario.eliminarProducto("3");
        System.out.println("\nDespués de eliminar producto de ID 3:");
        inventario.listarProductos();

        System.out.println("\nActualizar stock producto:");
        Producto productoAActualizarStock = inventario.buscarProductoPorId("4");
        productoAActualizarStock.mostrarInfo();
        inventario.actualizarStock("4", -2);
        productoAActualizarStock.mostrarInfo();
        inventario.actualizarStock("4", 5);
        productoAActualizarStock.mostrarInfo();

        System.out.println("\nMostrar total Stock disponible:");
        int totalStock = inventario.obtenerTotalStock();
        System.out.println("Stock disponible inventario: " + totalStock);

        System.out.println("\nObtener productos con mayor stock:");
        List<Producto> productosConMayorStock = inventario.obtenerProductosConMayorStock();
        for (Producto producto : productosConMayorStock) {
            producto.mostrarInfo();
        }

        System.out.println("\nFiltrar productos por precio:");
        List<Producto> productosPorPrecio = inventario.filtrarProductosPorPrecio(1000.0, 3000.0);
        for (Producto producto : productosPorPrecio) {
            producto.mostrarInfo();
        }

        System.out.println("\nMostrar categorías disponibles:");
        inventario.mostrarCategoriasDisponibles();

        System.out.println("\n\n************************** FIN EJERCICIO 01 **************************");
    }
}
