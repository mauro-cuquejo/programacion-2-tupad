package ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    private static String solicitarCategoriaProd(Scanner scanner) {
        String categoria = scanner.nextLine();

        while (!categoria.equalsIgnoreCase("A")
                && !categoria.equalsIgnoreCase("B")
                && !categoria.equalsIgnoreCase("C")) {
            System.out.print("Categoría no válida. Ingrese la categoría del producto (A, B o C): ");
            categoria = scanner.nextLine();
        }
        return categoria;
    }

    private static int calcularPorcentajeDesc(String categoria) {
        switch (categoria.toUpperCase()) {
            case "A":
                return 10;
            case "B":
                return 15;
            case "C":
                return 20;
        }
        return 0;
    }

    private static double aplicarDescuento(double precio, int porcentaje) {
        return precio - (precio * porcentaje / 100);
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese el precio del producto: ");
        double precio = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese la categoría del producto (A, B o C): ");
        String categoria = solicitarCategoriaProd(scanner);

        int porcentajeDesc = calcularPorcentajeDesc(categoria);
        System.out.println("Descuento aplicado: " + porcentajeDesc + "%");
        System.out.println("Precio final: " + aplicarDescuento(precio, porcentajeDesc));
    }
}
