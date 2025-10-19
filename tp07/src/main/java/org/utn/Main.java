package org.utn;

import org.utn.ejercicio01.Auto;
import org.utn.ejercicio02.Circulo;
import org.utn.ejercicio02.Figura;
import org.utn.ejercicio02.Rectangulo;
import org.utn.ejercicio03.Empleado;
import org.utn.ejercicio03.EmpleadoPlanta;
import org.utn.ejercicio03.EmpleadoTemporal;
import org.utn.ejercicio04.Animal;
import org.utn.ejercicio04.Gato;
import org.utn.ejercicio04.Perro;
import org.utn.ejercicio04.Vaca;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main() {

        System.out.println("--- Ejercicio 1: ---");
        //instanciar auto y mostrar su informacion completa
        Auto auto = new Auto("Toyota", "Corolla", 4);
        auto.mostrarInfo();

        System.out.println("\n--- Ejercicio 2: ---");
        //Crear un array de figuras y mostrar el área de cada una usando polimorfismo.
        ArrayList<Figura> figuras = new ArrayList<>();
        figuras.add(new Rectangulo("Rectángulo1", 5, 10));
        figuras.add(new Circulo("Círculo1", 7));

        for (Figura figura : figuras) {
            System.out.println("Área de " + figura.getNombre() + ": " + figura.calcularArea());
        }

        System.out.println("\n--- Ejercicio 3: ---");
        //Crear lista de empleados, invocar calcularSueldo() polimórficamente,
        //usar instanceof para clasificar
        List<Empleado> empleados = new ArrayList<>();
        empleados.add(new EmpleadoPlanta(10000.0));
        empleados.add(new EmpleadoPlanta(15000.0));
        empleados.add(new EmpleadoTemporal(50.0, 160));
        empleados.add(new EmpleadoTemporal(60.0, 120));
        for (Empleado empleado : empleados) {
            Double sueldo = empleado.calcularSueldo();
            if (empleado instanceof EmpleadoPlanta) {
                System.out.println("Empleado de Planta - Sueldo: " + sueldo);
            } else if (empleado instanceof EmpleadoTemporal) {
                System.out.println("Empleado Temporal - Sueldo: " + sueldo);
            }
        }

        System.out.println("\n--- Ejercicio 4: ---");
        //Crear lista de animales y mostrar sus sonidos con polimorfismo
        List<Animal> animales = new ArrayList<>();
        animales.add(new Gato());
        animales.add(new Perro());
        animales.add(new Vaca());
        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
        }


    }
}
