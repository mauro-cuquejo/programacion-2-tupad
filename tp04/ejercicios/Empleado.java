package tp04.ejercicios;

public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private String salario;
    private static int totalEmpleados;

    public Empleado(int id, String nombre, String puesto, String salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++;
    }

    //Constructor sobrecargado con patrón telescópico
    public Empleado(String nombre, String puesto) {
        //Llama al constructor principal con id = totalEmpleados + 1
        //para evitar id duplicado y salario = "0" por defecto.
        this(totalEmpleados + 1, nombre, puesto, "0");
    }

    //Getters
    public String getSalario() {
        return this.salario;
    }

    public String getPuesto() {
        return this.puesto;
    }

    public String getNombre() {
        return this.nombre;
    }

    //No se agrega setter de salario porque no se debe modificar directamente

    //Setters
    public void setPuesto(String puesto) {
        if (puesto != null && !puesto.isBlank()) {
            this.puesto = puesto;
        } else {
            System.out.println("El puesto no puede estar vacío");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Métodos
    public void actualizarSalario(Double porcentajeAumento) {
        if (porcentajeAumento < 0) {
            System.out.println("El porcentaje de aumento debe ser mayor a 0");
        } else {
            Double salarioActual = Double.parseDouble(this.salario);
            this.salario = String.valueOf(salarioActual   + (salarioActual * porcentajeAumento / 100));
        }
    }

    public void actualizarSalario(String importeAumento) {
        if (Double.parseDouble(importeAumento) < 0) {
            System.out.println("El importe de aumento debe ser mayor a 0");
        } else {
            Double salarioActual = Double.parseDouble(this.salario);
            Double importeAumentoDouble = Double.parseDouble(importeAumento);
            this.salario = String.valueOf(salarioActual   + importeAumentoDouble);
        }
    }

    //toString
    @Override
    public String toString() {
        return "Empleado{id=" + id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + "}";
    }

    //Métodos estáticos
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
}
