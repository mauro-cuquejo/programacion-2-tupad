package org.utn.ejercicio03.modelos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Profesor {
    private final String id;
    private final String nombre;
    private final String especialidad;
    private final List<Curso> cursos;

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public void agregarCurso(Curso curso) {
        if (curso != null && !cursos.contains(curso)) {
            cursos.add(curso);
            if (curso.getProfesor() != this) {
                curso.setProfesor(this);
            }
            System.out.println("Curso " + curso.getNombre() + " asignado correctamente al profesor " + this.nombre);
        } else {
            System.out.println("No se agrega curso. El mismo ya existe registrado o es nulo");
        }
    }

    public void eliminarCurso(Curso curso) {
        if (curso != null && cursos.contains(curso)) {
            cursos.remove(curso);
            if (curso.getProfesor() == this) {
                curso.setProfesor(null);
            }
            System.out.println("Curso " + curso.getNombre() + " eliminado correctamente del profesor " + this.nombre);
        }
    }

    public void listarCursos() {
        System.out.println("Cursos del profesor " + nombre + ":");
        if (cursos.isEmpty()) {
            System.out.println("Sin cursos asignados");
        }
        for (Curso curso : cursos) {
            System.out.println(curso);
        }
    }

    @Override
    public String toString() {
        return "Profesor { nombre: " + nombre + ", especialidad: " + especialidad + " }";
    }

    public void mostrarInfo() {
        System.out.println("Profesor {id: " + id + ", nombre: " + nombre + ", especialidad: " + especialidad +
                ", Cantidad de cursos: "+ cursos.size() + "}");
    }

    public List<Curso> getCursos() {
        return Collections.unmodifiableList(cursos);
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}
