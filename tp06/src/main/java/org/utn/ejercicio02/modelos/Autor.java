package org.utn.ejercicio02.modelos;

public class Autor {
    private final String id;
    private final String nombre;
    private final String nacionalidad;

    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    @Override
    public String toString() {
        return "Autor{id: " + id + ", nombre: " + nombre + " , nacionalidad: " + nacionalidad + "}";
    }

    public void mostrarInfo() {
        System.out.println(this);
    }
}
