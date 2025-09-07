package TP04.ejercicios;

public class Main {
    public static void main(String[] args) {
        // Crear Empleados y Mostrar total de empleados
        System.out.println("Creando empleados...");
        // Constructor con todos los parámetros
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        Empleado empleado1 = new Empleado(1, "Juan", "Gerente", "1000");
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        Empleado empleado2 = new Empleado(2, "Maria", "Secretaria", "800");

        // Constructor con nombre y puesto
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
        Empleado empleado3 = new Empleado("Pedro", "Jefe de Almacen");
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());

        // Mostrar empleados
        System.out.println("\nMostrando empleados...");
        System.out.println(empleado1);
        System.out.println(empleado2);
        System.out.println(empleado3);

        // Actualizar salario con porcentaje
        System.out.println("\nActualizando salarios por porcentaje...");
        empleado1.actualizarSalario(-10.0);
        System.out.println(empleado1);

        empleado1.actualizarSalario(10.0);
        System.out.println(empleado1);

        empleado2.actualizarSalario(10.0);
        System.out.println(empleado2);

        empleado3.actualizarSalario(10.0);
        System.out.println(empleado3);

        // Actualizar salario con importe
        System.out.println("\nActualizando salarios por importe...");

        empleado1.actualizarSalario("-50.0");
        System.out.println(empleado1);

        empleado1.actualizarSalario("50.0");
        System.out.println(empleado1);

        empleado2.actualizarSalario("50.0");
        System.out.println(empleado2);

        // Actualizar salario con importe a partir del salario de otro empleado
        empleado3.actualizarSalario(empleado2.getSalario());
        System.out.println(empleado3);

        System.out.println("\nProbando getters y setters...");
        System.out.println("Nombre: " + empleado1.getNombre());
        System.out.println("Puesto: " + empleado1.getPuesto());
        System.out.println("Salario: " + empleado1.getSalario());

        empleado1.setNombre("Juan Carlos");
        System.out.println("Nombre: " + empleado1.getNombre());

        empleado1.setPuesto("Gerente de Proyectos");
        System.out.println("Puesto: " + empleado1.getPuesto());

        System.out.println(empleado1);

    }
}
