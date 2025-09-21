package ejercicio10;

import java.util.Scanner;

public class Ejercicio10 {
    private static int actualizarStock(int stockActual, int cantidadVendida, int cantidadRecibida) {
        return stockActual - cantidadVendida + cantidadRecibida;
    }

    public static void ejecutarEjercicio(Scanner scanner) {
        System.out.print("Ingrese el stock actual del producto: ");
        int stockActual = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad vendida: ");
        int cantidadVendida = Integer.parseInt(scanner.nextLine());

        System.out.print("Ingrese la cantidad recibida: ");
        int cantidadRecibida = Integer.parseInt(scanner.nextLine());

        System.out.println("El nuevo stock del producto es: "
                + actualizarStock(stockActual, cantidadVendida, cantidadRecibida));
    }
}
