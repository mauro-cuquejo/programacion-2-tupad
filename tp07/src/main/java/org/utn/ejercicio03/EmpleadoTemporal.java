package org.utn.ejercicio03;

public class EmpleadoTemporal extends Empleado {
    private final Double pagoPorHora;
    private final Integer horasTrabajadas;

    public EmpleadoTemporal(Double pagoPorHora, Integer horasTrabajadas) {
        this.pagoPorHora = pagoPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public Double calcularSueldo() {
        return pagoPorHora * horasTrabajadas;
    }
}
