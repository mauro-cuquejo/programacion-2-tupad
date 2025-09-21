package tp05.ejercicio07;

public class Vehiculo {
    private final String patente;
    private final String modelo;
    private final Motor motor; // Agregación
    private Conductor conductor;  // Asociacion bidireccional 1 a 1

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getModelo() {
        return modelo;
    }

    public Conductor getConductor() {
        return conductor;
    }

    public void setConductor(Conductor conductor) {
        this.conductor = conductor;
        if (conductor != null && conductor.getVehiculo() != this) {
            conductor.setVehiculo(this);
        }
    }
    public void mostrarConductor() {
        if (this.conductor == null) {
            System.out.println("El vehículo " + this.modelo + " no tiene un conductor asignado.");
        } else {
            System.out.println("El vehículo " + this.modelo + " es conducido por: " + this.conductor.getNombre());
        }
    }

    public void mostrarMotor() {
        if (this.motor == null) {
            System.out.println("El vehículo " + this.modelo + " no tiene motor asignado.");
        } else {
            System.out.println("El vehículo " + this.modelo + " tiene un motor tipo: " + this.motor.getTipo() + " con número de serie: " + this.motor.getNumeroSerie());
        }
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "patente='" + patente + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor=" + (motor != null ? motor.toString() : "Ninguno") +
                ", conductor=" + (conductor != null ? conductor.getNombre() : "Ninguno") +
                '}';
    }
}
