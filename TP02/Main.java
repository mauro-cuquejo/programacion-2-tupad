import java.util.Scanner;

import ejercicio01.Ejercicio01;
import ejercicio02.Ejercicio02;
import ejercicio03.Ejercicio03;
import ejercicio04.Ejercicio04;
import ejercicio05.Ejercicio05;
import ejercicio06.Ejercicio06;
import ejercicio07.Ejercicio07;
import ejercicio08.Ejercicio08;
import ejercicio09.Ejercicio09;
import ejercicio10.Ejercicio10;
import ejercicio11.Ejercicio11;
import ejercicio12.Ejercicio12;
import ejercicio13.Ejercicio13;

public class Main {
    public static void main(String[] args) {
        // Se crea un solo Scanner para toda la aplicación
        Scanner scanner = new Scanner(System.in);

        // System.out.println("Ejercicio 1: Verificación de año bisiesto");
        // Ejercicio01.ejecutarEjercicio(scanner);

        // System.out.println("Ejercicio 2: Determinar el mayor de tres números");
        // Ejercicio02.ejecutarEjercicio(scanner);

        // System.out.println("Ejercicio 3: Clasificación de Edad");
        // Ejercicio03.ejecutarEjercicio(scanner);

        // System.out.println("Ejercicio 4: Calculadora de Descuento según categoría");
        // Ejercicio04.ejecutarEjercicio(scanner);

        // System.out.println("Ejercicio 5: Suma de números pares hasta cero");
        // Ejercicio05.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 6: Contador de números positivos, negativos y ceros");
        Ejercicio06.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 7: Validación de nota entre 0 y 10");
        Ejercicio07.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 8: Cálculo del Precio Final con impuesto y descuento");
        Ejercicio08.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 9: Cálculo de costo de envío y total de compra");
        Ejercicio09.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 10: Actualización de stock a partir de venta y recepción de productos");
        Ejercicio10.ejecutarEjercicio(scanner);

        System.out.println("Ejercicio 11: Cálculo de descuento especial usando variable global");
        Ejercicio11.ejecutarEjercicio(scanner);

        System.out.println(
                "Ejercicio 12: Modificación de un array de precios y visualización de resultados de forma iterativa");
        Ejercicio12.ejecutarEjercicio();

        System.out.println(
                "Ejercicio 13: Modificación de un array de precios y visualización de resultados de forma recursiva");
        Ejercicio13.ejecutarEjercicio();

        // Se cierra el Scanner al final de la aplicación
        scanner.close();

    }

}
