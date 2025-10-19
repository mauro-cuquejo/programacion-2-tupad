package org.utn.ejercicio02;

public class Rectangulo extends Figura {
    private final double base;
    private final double altura;

    public Rectangulo(String nombre, double base, double altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}


