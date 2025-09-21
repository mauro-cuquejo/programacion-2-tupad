package ejercicio09;

import java.util.Scanner;

public class Ejercicio09 {
    private static double calcularCostoEnvio(double peso, String zona) {
        return (zona.equalsIgnoreCase("nacional"))
                ? peso * 5.0
                : peso * 10.0;
    }

    private static double calcularTotalCompra(double precioProducto, double costoEnvio) {
        return precioProducto + costoEnvio;
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precioProducto = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese el peso del paquete en kg: ");
        double peso = Double.parseDouble(scanner.nextLine());

        System.out.print("Ingrese la zona de envío (Nacional/Internacional): ");
        String zona = scanner.nextLine().trim();
        while (!zona.equalsIgnoreCase("nacional") && !zona.equalsIgnoreCase("internacional")) {
            System.out.print("Zona no válida. Ingrese 'Nacional' o 'Internacional': ");
            zona = scanner.nextLine().trim();
        }

        System.out.println("El costo de envío es: " + calcularCostoEnvio(peso, zona));
        System.out.println("El total a pagar es: "
                + calcularTotalCompra(precioProducto, calcularCostoEnvio(peso, zona)));
    }
}
