package org.utn.ejercicio03.modelos;

public class Curso {
    private final String codigo;
    private final String nombre;
    private Profesor profesor;

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public void setProfesor(Profesor profesor) {
        if (this.profesor == profesor) {
            System.out.println("El profesor " + (profesor != null ? profesor.getNombre() : "null") + " ya está asignado a este curso.");
            return;
        }
        if (this.profesor != null) {
            this.profesor.eliminarCurso(this);
        }
        this.profesor = profesor;

        if (profesor != null && !profesor.getCursos().contains(this)) {
            profesor.agregarCurso(this);
        }
        if(profesor != null) {
            System.out.println("Profesor " + profesor.getNombre() + " asignado correctamente al curso " + this.nombre);
        } else {
            System.out.println("Profesor eliminado del curso " + this.nombre);
        }
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Curso { código: " + codigo + ", nombre: " + nombre + " }";
    }

    public void mostrarInfo() {
        String profesor = getProfesor() != null ? getProfesor().getNombre() : "Sin Profesor Asignado";
        System.out.println("Curso {código: " + codigo + ", nombre: " + nombre + ", profesor: " + profesor + "}");
    }
}
