package tp03.ejercicio01;

public class Estudiante {

    private String nombre;
    private String apellido;
    private String curso;
    private double calificacion;

    public Estudiante(String nombre, String apellido, String curso, double calificacion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.curso = curso;
        this.calificacion = calificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCurso() {
        return curso;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre + " " + apellido +
                ", Curso: " + curso + ", Calificación: " + calificacion);
    }

    public void subirCalificacion(double puntos) {
        if (puntos > 0 && calificacion + puntos <= 10) {
            calificacion += puntos;
        } else {
            System.out.println("No se puede subir la calificación. Valor inválido.");
        }
    }

    public void bajarCalificacion(double puntos) {
        if (puntos > 0 && calificacion - puntos >= 0) {
            calificacion -= puntos;
        } else {
            System.out.println("No se puede bajar la calificación. Valor inválido.");
        }
    }
}