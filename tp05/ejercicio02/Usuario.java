package tp05.ejercicio02;

public class Usuario {
    private final String nombre;
    private final Integer dni;
    private Celular celular;  // Asociacion bidireccional 1 a 1

    public Usuario(String nombre, Integer dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public Celular getCelular() {
        return this.celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if (celular != null && celular.getUsuario() != this) {
            celular.setUsuario(this);
        }
    }

    public void mostrarCelular() {
        if (this.celular != null) {
            System.out.println("El usuario: " + this.nombre + " tiene el celular: "
                    + this.celular.getMarca() + " " + this.celular.getModelo()
                    + " con celular: " + this.celular.mostrarCelular());
        } else {
            System.out.println("El usuario: " + this.nombre + " no tiene celular");
        }
    }
}
