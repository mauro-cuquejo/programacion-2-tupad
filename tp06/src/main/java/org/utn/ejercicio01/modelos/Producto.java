package org.utn.ejercicio01.modelos;

public class Producto {
    private final String id;
    private final String nombre;
    private final double precio;
    private int cantidad;
    private final CategoriaProducto categoria;


    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public void mostrarInfo() {
        System.out.println("Producto{id: " + id + ", nombre: " + nombre + ", precio: " + precio + ", cantidad: " +
                cantidad + ", categoria producto: " + categoria.getDescripcion() + "}");
    }

    public String getId() {
        return id;
    }

    public void setCantidad(int cantidad) {
        if (cantidad >= 0) {
            this.cantidad = cantidad;
        }
    }

    public CategoriaProducto getCategoria() {
        return categoria;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }
}
