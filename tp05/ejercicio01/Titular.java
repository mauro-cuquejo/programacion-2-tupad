package tp05.ejercicio01;

public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // Asociacion 1 a 1

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
        if (pasaporte != null && pasaporte.getTitular() != this) {
            pasaporte.setTitular(this);
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
