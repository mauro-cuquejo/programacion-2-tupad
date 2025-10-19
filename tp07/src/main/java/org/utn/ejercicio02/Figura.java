package org.utn.ejercicio02;

public abstract class Figura {
    private final String nombre;
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    public abstract double calcularArea();
    public String getNombre() {
        return nombre;
    }
}
