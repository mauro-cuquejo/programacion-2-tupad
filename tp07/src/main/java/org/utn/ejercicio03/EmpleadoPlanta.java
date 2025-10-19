package org.utn.ejercicio03;

public class EmpleadoPlanta extends Empleado {
    private final Double sueldoMensual;

    public EmpleadoPlanta(Double sueldoMensual) {
        this.sueldoMensual = sueldoMensual;
    }

    @Override
    public Double calcularSueldo() {
        return sueldoMensual;
    }
}
