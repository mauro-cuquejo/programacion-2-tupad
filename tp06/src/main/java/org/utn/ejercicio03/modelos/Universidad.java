package org.utn.ejercicio03.modelos;

import java.util.ArrayList;
import java.util.List;

public class Universidad {
    private final String nombre;
    private final List<Profesor> profesores;
    private final List<Curso> cursos;

    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        if (!profesores.contains(profesor)) {
            profesores.add(profesor);
            System.out.println("Profesor "+ profesor.getNombre() + " agregado correctamente.");
        } else {
            System.out.println("No se agrega profesor. El mismo ya existe registrado");
        }
    }

    public void agregarCurso(Curso curso) {
        if (!cursos.contains(curso)) {
            cursos.add(curso);
            System.out.println("Curso "+ curso.getNombre() + " agregado correctamente.");
        } else {
            System.out.println("No se agrega curso. El mismo ya existe registrado");
        }
    }

    public Profesor buscarProfesorPorId(String idProfesor) {
        for (Profesor profesor : profesores) {
            if (profesor.getId().equalsIgnoreCase(idProfesor)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigoCurso) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigoCurso)) {
                return curso;
            }
        }
        return null;
    }

    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Profesor profesorAAsingar = buscarProfesorPorId(idProfesor);
        Curso cursoAAsignar = buscarCursoPorCodigo(codigoCurso);
        if (profesorAAsingar == null) {
            System.out.println("Error en asignación profesor. El id del profesor no está registrado");
        } else if (cursoAAsignar == null) {
            System.out.println("Error en asignación profesor. El codigo de curso no está registrado");

        } else {
            profesorAAsingar.agregarCurso(cursoAAsignar);
        }
    }

    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("No hay cursos registrados.");
        }
        for (Curso curso : cursos) {
            curso.mostrarInfo();
        }
    }

    public void listarProfesores() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        }
        for (Profesor profesor : profesores) {
            profesor.mostrarInfo();
        }
    }

    public void eliminarCurso(String codigo) {
        Curso cursoAEliminar = buscarCursoPorCodigo(codigo);
        if (cursoAEliminar != null) {
            cursoAEliminar.setProfesor(null);
            cursos.remove(cursoAEliminar);
            System.out.println("Curso " + codigo + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el curso " + codigo + " para eliminar.");
        }
    }

    public void eliminarProfesor(String id) {
        Profesor profesorAEliminar = buscarProfesorPorId(id);
        if (profesorAEliminar != null) {
            for (Curso cursoADesasociar : List.copyOf(profesorAEliminar.getCursos())) {
                profesorAEliminar.eliminarCurso(cursoADesasociar);
            }
            profesores.remove(profesorAEliminar);
            System.out.println("Profesor " + id + " eliminado correctamente.");
        } else {
            System.out.println("No se encontró el profesor " + id + " para eliminar.");
        }
    }


    public void obtenerCantidadCursosPorProfesor() {
        if (profesores.isEmpty()) {
            System.out.println("No hay profesores registrados.");
        } else {
            for (Profesor profesor : profesores) {
                System.out.println("Profesor: " + profesor + ", Cantidad de cursos: " + profesor.getCursos().size());
            }
        }
    }

    public String getNombre() {
        return nombre;
    }
}
