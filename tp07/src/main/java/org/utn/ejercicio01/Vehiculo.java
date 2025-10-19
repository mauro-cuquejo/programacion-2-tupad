package org.utn.ejercicio01;

public class Vehiculo {
    private final String marca;
    private final String modelo;

    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void mostrarInfo() {
        System.out.println("Vehículo { marca: " + marca + ", modelo: " + modelo + " }");
    }
}
