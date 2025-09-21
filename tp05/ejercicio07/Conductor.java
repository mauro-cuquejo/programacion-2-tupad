package tp05.ejercicio07;

public class Conductor {

    private String nombre;
    private Licencia licencia;
    private Vehiculo vehiculo;  // Asociacion bidireccional 1 a 1

    public Conductor(String nombre, Licencia licencia) {
        this.nombre = nombre;
        this.licencia = licencia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
        if (vehiculo != null && vehiculo.getConductor() != this) {
            vehiculo.setConductor(this);
        }
    }

    public void mostrarVehiculo() {
        if (this.vehiculo == null) {
            System.out.println("El conductor " + this.nombre + " no tiene un vehículo asignado.");
        } else {
            System.out.println("El conductor " + this.nombre + " conduce un vehículo de tipo: " + this.vehiculo.getModelo());
        }
    }

    @Override
    public String toString() {
        return "Conductor{" +
                "nombre='" + nombre + '\'' +
                ", licencia=" + licencia +
                ", vehiculo=" + (vehiculo != null ? vehiculo.getModelo() : "Ninguno") +
                '}';
    }
}
