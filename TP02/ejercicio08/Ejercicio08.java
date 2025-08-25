package ejercicio08;

import java.util.Scanner;

public class Ejercicio08 {
    private static double calcularPrecioFinal(double precioBase, double impuesto, double descuento) {
        double impuestos = precioBase * (impuesto / 100.0);
        double descuentos = precioBase * (descuento / 100.0);
        return precioBase + impuestos - descuentos;
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese el precio base del producto: ");
        double precioBase = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el impuesto en porcentaje (Ejemplo: 10 para 10%): ");
        double impuesto = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el descuento en porcentaje (Ejemplo: 5 para 5%): ");
        double descuento = Double.parseDouble(scanner.nextLine());

        System.out.println("El precio final del producto es: " + calcularPrecioFinal(precioBase, impuesto, descuento));
    }
}
