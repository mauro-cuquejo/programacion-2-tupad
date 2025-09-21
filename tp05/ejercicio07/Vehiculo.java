package tp05.ejercicio07;

public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor;
    private Conductor conductor;

    public Vehiculo(String patente, String modelo, Motor motor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
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
