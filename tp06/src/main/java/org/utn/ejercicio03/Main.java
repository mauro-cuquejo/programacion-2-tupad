package org.utn.ejercicio03;

import org.utn.ejercicio03.modelos.Curso;
import org.utn.ejercicio03.modelos.Profesor;
import org.utn.ejercicio03.modelos.Universidad;

public class Main {
    static void main() {
        System.out.println("\n\n************************** INICIO EJERCICIO 03 **************************");
        System.out.println("\nCreación profesores:");
        Profesor cimino = new Profesor("1", "Charly Cimino", "Programación");
        cimino.mostrarInfo();
        Profesor bruno = new Profesor("2", "Oscar Bruno", "Programación");
        bruno.mostrarInfo();
        Profesor sirne = new Profesor("3", "Oscar Sirne", "Matemática");
        sirne.mostrarInfo();
        Profesor reinosa = new Profesor("4", "Enrique Reinosa", "Gestión de Datos");
        reinosa.mostrarInfo();

        System.out.println("\nCreación cursos:");
        Curso ami = new Curso("1", "Análisis Matemático 1");
        ami.mostrarInfo();
        Curso fisica = new Curso("2", "Fisica 1");
        fisica.mostrarInfo();
        Curso programacion = new Curso("3", "Programación 1");
        programacion.mostrarInfo();
        Curso programacion2 = new Curso("4", "Programación 2");
        programacion2.mostrarInfo();
        Curso gdd = new Curso("5", "Gestion de Datos");
        gdd.mostrarInfo();

        System.out.println("\nCreación universidad:");
        Universidad utn = new Universidad("Universidad Tecnológica Nacional");
        System.out.println("Universidad creada: " + utn.getNombre());
        System.out.println("\nLista de cursos inicial:");
        utn.listarCursos();

        System.out.println("\nAgregando Cursos:");
        utn.agregarCurso(ami);
        utn.agregarCurso(fisica);
        utn.agregarCurso(programacion);
        utn.agregarCurso(programacion2);
        utn.agregarCurso(gdd);
        System.out.println("\nIntentando agregar un curso repetido:");
        utn.agregarCurso(ami);

        System.out.println("\nFin agregado Cursos. Se procede a listar cursos agregados:");
        utn.listarCursos();

        System.out.println("\nLista de profesores inicial:");
        utn.listarProfesores();

        System.out.println("\nAgregando Profesores:");
        utn.agregarProfesor(cimino);
        utn.agregarProfesor(bruno);
        utn.agregarProfesor(sirne);
        System.out.println("\nIntentando agregar un profesor repetido:");
        utn.agregarProfesor(cimino);
        System.out.println("\nFin agregado Profesores. Se procede a listar profesores agregados::");
        utn.listarProfesores();

        System.out.println("\nAsignando profesores a cursos:");
        utn.asignarProfesorACurso(programacion.getCodigo(), cimino.getId());
        System.out.print("\n");
        utn.asignarProfesorACurso(programacion2.getCodigo(), bruno.getId());
        System.out.print("\n");
        utn.asignarProfesorACurso(ami.getCodigo(), sirne.getId());
        System.out.print("\n");
        utn.asignarProfesorACurso(fisica.getCodigo(), sirne.getId());
        System.out.println("\nSe intenta agregar un curso a un profesor que aun no fue asignado a la universidad:");
        utn.asignarProfesorACurso(gdd.getCodigo(), reinosa.getId());
        System.out.println("\nSe agrega profesor a la universidad:");
        utn.agregarProfesor(reinosa);
        System.out.println("\nSe intenta nuevamente agregar curso:");
        utn.asignarProfesorACurso(gdd.getCodigo(), reinosa.getId());
        System.out.println("\nSe intenta asignar un curso a un profesor que ya lo tiene asignado:");
        utn.asignarProfesorACurso(programacion.getCodigo(), cimino.getId());

        System.out.println("\nfin asignación profesores a cursos. Se listan profesores y cursos:");
        utn.listarProfesores();
        utn.listarCursos();


        System.out.println("\nSe cambia a profesor de un curso:");
        System.out.println("Antes:");
        cimino.mostrarInfo();
        cimino.listarCursos();
        System.out.print("\n");
        bruno.mostrarInfo();
        bruno.listarCursos();
        System.out.println("\nSe procede a cambiar profesor del curso " + programacion2.getNombre() +
                " de " + bruno.getNombre() + " a " + cimino.getNombre());
        programacion2.setProfesor(cimino);
        System.out.println("\nDespues:");
        cimino.mostrarInfo();
        cimino.listarCursos();
        System.out.print("\n");
        bruno.mostrarInfo();
        bruno.listarCursos();

        System.out.println("\nSe elimina curso " + programacion.getNombre() + " de la universidad:");
        utn.eliminarCurso(programacion.getCodigo());
        System.out.println("\nSe verifica que el profesor ya no referencie al curso:");
        cimino.mostrarInfo();
        cimino.listarCursos();
        System.out.println("\nSe verifica que se haya eliminado el curso de la universidad:");
        utn.listarCursos();

        System.out.println("\nSe elimina profesor " + sirne.getNombre() + " de la universidad:");
        utn.eliminarProfesor(sirne.getId());
        System.out.println("\nSe verifica que las materias que dictaba el profesor ya no lo referencien:");
        ami.mostrarInfo();
        fisica.mostrarInfo();
        System.out.println("\nSe verifica que se haya eliminado el profesor de la universidad:");
        utn.listarProfesores();

        System.out.println("\nSe lista cantidad de cursos por profesor:");
        utn.obtenerCantidadCursosPorProfesor();


        System.out.println("\n\n************************** FIN EJERCICIO 03 **************************");
    }
}
