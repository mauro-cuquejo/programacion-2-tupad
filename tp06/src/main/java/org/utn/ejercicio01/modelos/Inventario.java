package org.utn.ejercicio01.modelos;

import java.util.ArrayList;
import java.util.List;

public class Inventario {
    private final List<Producto> productos;

    public Inventario() {
        productos = new ArrayList<>();
    }

    public void agregarProducto(Producto p) {
        productos.add(p);
    }

    public void listarProductos() {
        if (productos.isEmpty()) {
            System.out.println("No hay productos disponibles en el inventario");
        } else {
            System.out.println("Mostrando productos disponibles en inventario:");
        }
        for (Producto producto : productos) {
            producto.mostrarInfo();
        }
    }

    public Producto buscarProductoPorId(String id) {
        for (Producto producto : productos) {
            if (producto.getId().equalsIgnoreCase(id)) {
                return producto;
            }
        }
        return null;
    }

    public void eliminarProducto(String id) {
        Producto productoAEliminar = buscarProductoPorId(id);
        if (productoAEliminar != null) {
            productos.remove(productoAEliminar);
        }
    }

    public void actualizarStock(String id, int nuevaCantidad) {
        Producto productoAActualizar = buscarProductoPorId(id);
        if (productoAActualizar != null) {
            productoAActualizar.setCantidad(nuevaCantidad);
        }
    }

    public List<Producto> filtrarPorCategoria(CategoriaProducto categoria) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCategoria().equals(categoria)) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public int obtenerTotalStock() {
        int totalStock = 0;
        for (Producto producto : productos) {
            totalStock += producto.getCantidad();
        }
        return totalStock;
    }

    /**
     * Pese a que se solicita el producto con mayor Stock, pueden haber varios productos que cumplan esa condicion
     * Por lo tanto, se decidió devolver una lista de productos.
     **/
    public List<Producto> obtenerProductosConMayorStock() {
        int mayorStock = 0;
        List<Producto> productosConMayorStock = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getCantidad() == mayorStock) {
                productosConMayorStock.add(producto);
            } else if (producto.getCantidad() > mayorStock) {
                mayorStock = producto.getCantidad();
                productosConMayorStock.clear();
                productosConMayorStock.add(producto);
            }
        }
        return productosConMayorStock;
    }

    public List<Producto> filtrarProductosPorPrecio(double min, double max) {
        List<Producto> productosFiltrados = new ArrayList<>();
        for (Producto producto : productos) {
            if (producto.getPrecio() >= min && producto.getPrecio() <= max) {
                productosFiltrados.add(producto);
            }
        }
        return productosFiltrados;
    }

    public void mostrarCategoriasDisponibles() {
        CategoriaProducto[] categorias = CategoriaProducto.values();
        for (CategoriaProducto categoriaProducto : categorias) {
            System.out.println("Categoria: " + categoriaProducto.name() + ", descripción: " +
                    categoriaProducto.getDescripcion());
        }
    }
}
